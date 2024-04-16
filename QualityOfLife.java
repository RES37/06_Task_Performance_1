import java.util.Scanner;

public class QualityOfLife {
    private static final Scanner sc = new Scanner(System.in);

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static boolean isAlphaNumeric(String s){
        String pattern= "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
    }

    static void enterAnyKey() {
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("------- Enter any key to continue -------");
        sc.nextLine();
    }
}
