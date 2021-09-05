import javax.crypto.spec.PSource;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Enter your message:");
        String message = inputText.nextLine();

        System.out.println("Enter your key:");
        int key = inputText.nextInt();
    }
}
