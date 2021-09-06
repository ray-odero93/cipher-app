import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String yourMessage = input.nextLine();
        System.out.println("Enter your key: ");
        int yourKey = input.nextInt();

        System.out.println("(E)ncode or (D)ecode?");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'E':
            case 'e':
                Encoding random = new Encoding(yourMessage, yourKey);
                System.out.println("your encryption is: " + random.encrypt(yourMessage, yourKey));
                break;
            case 'D':
            case 'd':
                Decoding another = new Decoding("", ' ');
                System.out.println("your decryption is: " + another.decrypt(yourMessage, yourKey));
        }
    }
}
