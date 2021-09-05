import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String yourMessage = input.nextLine();
        System.out.println("Enter your key: ");
        int yourKey = input.nextInt();

        Encoding encoding = new Encoding(yourMessage, yourKey);
        String encryption = encoding.encrypt(yourMessage,yourKey);
        String encryptedMessage = encryption;

        Decoding decoding = new Decoding(encryptedMessage, yourKey);
        String decryption = decoding.decrypt(encryptedMessage, yourKey);

        System.out.println("Your encryption is : " +encryption);
//        System.out.println("Your original message is: " + decryption);
    }
}
