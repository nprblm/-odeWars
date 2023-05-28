package kyu_6;
//https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/java

import org.junit.Test;
        import static org.junit.Assert.*;

public class SimpleEncryption1AlternatingSplitTest {

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", SimpleEncryption1AlternatingSplit.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", SimpleEncryption1AlternatingSplit.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", SimpleEncryption1AlternatingSplit.encrypt("This is a test!", 3));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.encrypt("This is a test!", 4));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", SimpleEncryption1AlternatingSplit.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.decrypt("This is a test!", 0));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.decrypt("This is a test!", 4));
        assertEquals("This is a test!", SimpleEncryption1AlternatingSplit.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", SimpleEncryption1AlternatingSplit.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", SimpleEncryption1AlternatingSplit.encrypt("", 0));
        assertEquals("", SimpleEncryption1AlternatingSplit.decrypt("", 0));
        assertEquals(null, SimpleEncryption1AlternatingSplit.encrypt(null, 0));
        assertEquals(null, SimpleEncryption1AlternatingSplit.decrypt(null, 0));
    }

}