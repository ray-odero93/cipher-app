import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodingTest {

    @Test
    public void newEncoding_instantiateCreation() {
        Encoding testEncoding = new Encoding("Dutch",'2');
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkKeySaved(){
        Encoding testEncoding = new Encoding("Dutch", '2');
        assertEquals(2, testEncoding.getKey());
    }

    @Test
    public void checkInputSaved() {
        Encoding testEncoding = new Encoding("Dutch",'2');
        assertEquals("Dutch", testEncoding.getInputText());
    }

    @Test
    public void validEncoding() {
        Encoding testEncoding = new Encoding(" ", ' ' );
        assertEquals(" ", testEncoding.encrypt(" ", ' '));
    }


}