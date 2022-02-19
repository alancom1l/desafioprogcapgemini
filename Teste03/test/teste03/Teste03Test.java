package teste03;

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
public class Teste03Test {
    /**
     * Test of main method, of class Teste03.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String args;
        args = "ifailuhkqq";
        int a = Teste03.main(args);
        
        Assert.assertEquals(3, a);
    }
}
