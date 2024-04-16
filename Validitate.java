import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Credentials {
    private static final String FILE_PATH = "Credentials.txt";

    static boolean usernameExist(String username) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(username)) {
                    String[] temp = line.split(",");
                    if (!line.equals(temp[0])) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static boolean validateCredential(String username, String password) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("P: " + username)) {
                    if (line.equals("P: " + password)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
