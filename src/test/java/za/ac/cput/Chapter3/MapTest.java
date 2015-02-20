package za.ac.cput.Chapter3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class MapTest {
    private AirlineApp test;
    @Before
    public void setUp()
    {
        test = new AirlineApp();
    }
    @Test
    public void testList()
    {
        String [] testArray = new String [1];
        Assert.assertNotSame("The Map is actually an array",testArray,test.getMap());
    }
    @After
    public void tearDown()
    {

    }
}