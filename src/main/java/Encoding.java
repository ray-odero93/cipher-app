public class Encoding {

    private int key;
    private String message;

    public Encoding(String message, int key) {
        this.key = key;
        this.message = message;
    }

    public int getKey() {
        return this.key;
    }

    public String getInputText() {
      return this.message;
    }

    public String encode() {
        String encoded;
        key %= 26;


        return null;
    }
}