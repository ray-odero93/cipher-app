import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodingTest {

    @Test
    public void newEncoding_instantiatesCorrectly() {
        Encoding testEncoding = new Encoding("raymond", '1');
        assertEquals(true, testEncoding instanceof Encoding);
    }
}