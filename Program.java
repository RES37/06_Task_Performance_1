import java.util.Scanner;

public class Program {
    private static final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            try {
                FileChecker.FileExist();
                QualityOfLife.clearScreen();
                System.out.print("Press [R] to Register, [L] to Login, [0] to exit: ");
                String choice = scanner.nextLine();

                switch (choice.toUpperCase()) {
                    case "R":
                        QualityOfLife.clearScreen();
                        Register.registerUser();
                        break;
                    case "L":
                        QualityOfLife.clearScreen();
                        Login.loginUser();
                        break;
                    case "0":
                        System.out.println("System closed.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid user input. Restarting...");
                        QualityOfLife.delay(3000);
                }
            } catch (Exception e) {
                System.out.println("Error! Program restarting...");
                QualityOfLife.delay(3000);
            }
        }
    }
}
