import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.applications.Application;


public class ApplicationTest
{

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {}

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {}

    @Before
    public void setUp() throws Exception
    {}

    @After
    public void tearDown() throws Exception
    {}

    @Test
    public final void test()
    {
        assertEquals(3, Application.get3());
    }

}
