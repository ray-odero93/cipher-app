public class Encoding {

    private int key;
    private String message;

    public Encoding(String yourMessage, int yourKey) {
        this.key = yourKey;
        this.message = yourMessage;
    }

    public int getKey() {
        return this.key;
    }

    public String getInputText() {
      return this.message;
    }

    public static String encrypt(String message, int key) {
        String encryptedMessage = " ";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        message = message.toUpperCase();
         int charPosition;
         int keyValue;
         char encryptedValue;

         for (int i = 0; i < message.length(); i++) {
             switch (message.charAt(i)) {
                 case ' ': encryptedMessage += ' ';
                 break;
                 case '.': encryptedMessage += '.';
                     break;
                 case ',': encryptedMessage += ',';
                     break;
                 case '!': encryptedMessage += '!';
                     break;
                 case '?': encryptedMessage += '?';
                     break;

                 default: charPosition = letters.indexOf(message.charAt(i));

                 keyValue = (key + charPosition) % 26;

                 if (keyValue <  0) {
                     keyValue = letters.length() + keyValue;
                 }

                 encryptedValue = letters.charAt(keyValue);
                 encryptedMessage += encryptedValue;
                 break;
             }
         }

        return encryptedMessage;

    }
}