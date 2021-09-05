import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {

    @Test
    public void newDecoding_instantiateCreation() {
        Decoding testDecoding = new Decoding(" ",' ');
        assertEquals(true, testDecoding instanceof Decoding);
    }
    @Test
    public void checkKeySaved(){
        Decoding testDecoding = new Decoding("Dutch", '2');
        assertEquals(2, testDecoding.getKey());
    }

    @Test
    public void checkInputSaved() {
        Decoding testDecoding = new Decoding("Dutch",'2');
        assertEquals("Dutch", testDecoding.getInputText());
    }

    @Test
    public void validDecoding() {
        Decoding testDecoding = new Decoding(" ", ' ' );
        assertEquals(" ", testDecoding.decrypt(" ", ' '));
    }

}