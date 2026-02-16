import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SuspiciousDetector {

    public List<LogEntry> detect(List<LogEntry> allLogs,
                                 Map<String, List<LogEntry>> accountMap) {

        List<LogEntry> suspicious = new ArrayList<>();

        for (LogEntry log : allLogs) {

            // Rule 1: Withdrawal > 50,000
            if (log.getActionType() == ActionType.WITHDRAW &&
                log.getAmount() > 50000) {
                suspicious.add(log);
            }

            // Rule 2: More than 3 FAILED_LOGIN in last 5 logs
            if (log.getActionType() == ActionType.FAILED_LOGIN) {

                List<LogEntry> logs = accountMap.get(log.getAccountNumber());
                int size = logs.size();

                int count = 0;
                for (int i = Math.max(0, size - 5); i < size; i++) {
                    if (logs.get(i).getActionType() == ActionType.FAILED_LOGIN) {
                        count++;
                    }
                }

                if (count > 3) {
                    suspicious.add(log);
                }
            }
        }

        return suspicious;
    }
}
