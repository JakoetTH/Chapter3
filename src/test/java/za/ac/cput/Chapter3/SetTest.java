package za.ac.cput.Chapter3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class SetTest {
    private AirlineApp test;
    @Before
    public void setUp()
    {
        test = new AirlineApp();
    }
    @Test
    public void testSet()
    {
        String [] testArray = new String [1];
        Assert.assertNotSame("The set is actually an array",testArray,test.getSet());
    }
    @After
    public void tearDown()
    {

    }
}
