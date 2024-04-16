import java.io.IOException;
import java.util.Scanner;

public class Login {
    private static final Scanner sc = new Scanner(System.in);

    static void loginUser() throws IOException {
        System.out.println("LOGIN");
        System.out.println("-----------------------------------------");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (Credentials.validateCredential(username, password)) {
            waiting();
            System.out.println("Login Successful.");
            QualityOfLife.enterAnyKey();
        } else {
            waiting();
            System.out.println("User does not exist.");
            QualityOfLife.enterAnyKey();
        }
    }

    static void waiting() {
        System.out.println("Loging in. Please wait...");
        QualityOfLife.delay(3000);
    }
}
