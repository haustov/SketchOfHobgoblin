/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.haustov.hobgoblin.hobservice;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author khaustov
 */
public class HomeStoreTest
{
    
    public HomeStoreTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of test method, of class HomeStore.
     */
    @Test
    public void testTest()
    {
        System.out.println("test");
        HomeStore instance = new HomeStore();
        long expResult = 4L;
        long result = instance.test();
        assertEquals(expResult, result);
    }

    /**
     * Test of testArray method, of class HomeStore.
     */
    @Test
    public void testTestArray()
    {
        System.out.println("testArray");
        HomeStore instance = new HomeStore();
        //List expResult = null;
        List result = instance.testArray();
        assertNotNull(result);
    }
}
