package za.ac.cput.Chapter3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class ListTest {
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
        Assert.assertNotSame("The List is actually an array",testArray,test.getList());
    }
    @After
    public void tearDown()
    {

    }
}
