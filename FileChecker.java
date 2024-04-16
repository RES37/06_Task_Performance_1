import java.io.File;
import java.io.IOException;

public class FileChecker {
    private static final String FILE_PATH = "Credentials.txt";

    static void FileExist() throws IOException {
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
