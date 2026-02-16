import java.util.List;

public interface LogService {

    void addLog(String accountNumber, ActionType actionType,
                double amount, Status status);

    List<LogEntry> getLogsByAccount(String accountNumber);

    List<LogEntry> getRecentLogs(int n);

    List<LogEntry> searchByAction(ActionType actionType);

    List<LogEntry> detectSuspicious();
}
