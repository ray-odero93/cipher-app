public class Decoding {
    private int key;
    private String message;

    public Decoding(String encryptedMessage, int key){
        this.key = key;
        this.message = encryptedMessage;
    }

    public int getKey() {
        return this.key;
    }

    public String getInputText() {
        return this.message;
    }

    public String decrypt( String encryptedMessage, int key) {
        String originalMessage = " ";
        encryptedMessage = encryptedMessage.toUpperCase();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int charPosition;
        int keyValue;
        char initialValue;

        for (int i = 0; i <encryptedMessage.length(); i++) {
            switch (encryptedMessage.charAt(i)) {
                case ' ': originalMessage += ' ';
                break;
                case '.': originalMessage += '.';
                    break;
                case ',': originalMessage += ',';
                    break;
                case '!': originalMessage += '!';
                    break;
                case '?': originalMessage += '?';
                    break;

                default: charPosition = letters.indexOf(encryptedMessage.charAt(i));
                keyValue = (charPosition - key) % 26;

                if (keyValue < 0) {
                    keyValue = letters.length() + keyValue;
                }
                initialValue = letters.charAt(keyValue);
                originalMessage += initialValue;
                break;
            }
        }

        return originalMessage;

    }

}
