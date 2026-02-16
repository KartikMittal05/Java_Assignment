import java.util.*;

public class LogManager implements LogService {

    private List<LogEntry> allLogs = new ArrayList<>();
    private Map<String, List<LogEntry>> accountMap = new HashMap<>();
    private Map<ActionType, List<LogEntry>> actionMap = new HashMap<>();
    private Deque<LogEntry> recentLogs = new ArrayDeque<>();
    private SuspiciousDetector detector = new SuspiciousDetector();

    @Override
    public void addLog(String accountNumber, ActionType actionType,
                       double amount, Status status) {

        LogEntry log = new LogEntry(accountNumber, actionType, amount, status);

        allLogs.add(log);
        recentLogs.addLast(log);

        accountMap.computeIfAbsent(accountNumber, k -> new ArrayList<>()).add(log);
        actionMap.computeIfAbsent(actionType, k -> new ArrayList<>()).add(log);

        System.out.println("Log added successfully!");
    }

    @Override
    public List<LogEntry> getLogsByAccount(String accountNumber) {
        return accountMap.getOrDefault(accountNumber, new ArrayList<>());
    }

    @Override
    public List<LogEntry> getRecentLogs(int n) {

        List<LogEntry> result = new ArrayList<>();
        Iterator<LogEntry> iterator = recentLogs.descendingIterator();

        while (iterator.hasNext() && n-- > 0) {
            result.add(iterator.next());
        }

        return result;
    }

    @Override
    public List<LogEntry> searchByAction(ActionType actionType) {
        return actionMap.getOrDefault(actionType, new ArrayList<>());
    }

    @Override
    public List<LogEntry> detectSuspicious() {
        return detector.detect(allLogs, accountMap);
    }
}
