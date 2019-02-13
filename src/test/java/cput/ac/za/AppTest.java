
import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddition()
    {
        App app = new App();
        int result = app.calculate(3,4);
        assertEquals(7,result);
    }
}
