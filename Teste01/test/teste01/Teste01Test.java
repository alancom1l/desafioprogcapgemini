package teste01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alancom1l
 */
public class Teste01Test {
    /**
     * Test of main method, of class Teste01.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        int args;
        args = 5;
        String a = Teste01.main(args);
        
        Assert.assertEquals("*****", a);
    }
}
