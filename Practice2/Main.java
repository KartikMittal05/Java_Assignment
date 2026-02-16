import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LogService manager = new LogManager();

        while (true) {

            System.out.println("\n1.Add Log");
            System.out.println("2.Get Logs by Account");
            System.out.println("3.Get Recent Logs");
            System.out.println("4.Detect Suspicious Activity");
            System.out.println("5.Search by Action");
            System.out.println("6.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Account Number: ");
                    String acc = sc.next();

                    System.out.print("Action (DEPOSIT/WITHDRAW/TRANSFER/LOGIN/FAILED_LOGIN): ");
                    ActionType action = ActionType.valueOf(sc.next());

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    System.out.print("Status (SUCCESS/FAILED): ");
                    Status status = Status.valueOf(sc.next());

                    manager.addLog(acc, action, amt, status);
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    String account = sc.next();
                    manager.getLogsByAccount(account)
                           .forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    manager.getRecentLogs(n)
                           .forEach(System.out::println);
                    break;

                case 4:
                    manager.detectSuspicious()
                           .forEach(System.out::println);
                    break;

                case 5:
                    System.out.print("Action Type: ");
                    ActionType type = ActionType.valueOf(sc.next());
                    manager.searchByAction(type)
                           .forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
