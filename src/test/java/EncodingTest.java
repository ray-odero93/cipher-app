import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodingTest {

    Encoding testEncoding = new Encoding("raymond",'1');;


    @Test
    public void newEncoding_instantiatesCorrectly() {
        Encoding testEncoding = new Encoding("raymond", '1');
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkTextInputted() {
        assertEquals("globe", testEncoding.getInputText());
    }

    @Test
    public void checkInputtedKey() {
        assertEquals(2, testEncoding.getKey());
    }
}