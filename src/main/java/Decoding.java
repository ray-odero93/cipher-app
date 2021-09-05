public class Decoding {
    private int key;
    private String message;

    public Decoding(String message, int key){
        this.key = key;
        this.message = message;
    }

    public int getKey() {
        return this.key;
    }
}
