import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Register {
    private static final String FILE_PATH = "Credentials.txt";
    private static final Scanner sc = new Scanner(System.in);

    static void registerUser() throws IOException {
        System.out.println("REGISTRATION");
        System.out.println("-----------------------------------------");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (QualityOfLife.isAlphaNumeric(username) && QualityOfLife.isAlphaNumeric(password)) {
            if (!Credentials.usernameExist(username)) {
                // Writer
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));

                // Puts combine into Credentials.txt
                writer.write(username + "," + password);
                writer.newLine();
                writer.flush();
                writer.close();

                waiting();
                System.out.println("Registration Successful [" + username + "].");
                QualityOfLife.enterAnyKey();
            } else {
                waiting();
                System.out.println("Account already exist.");
                QualityOfLife.enterAnyKey();
            }
        } else {
            System.out.println("Username should only contain Alpha-numerical values");
            QualityOfLife.enterAnyKey();
        }
    }

    static void waiting() {
        System.out.println("Registering. Please wait...");
        QualityOfLife.delay(3000);
    }
}
