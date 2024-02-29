package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.example.App.fb;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFb(){
        assertEquals("1", fb(1));
        assertEquals("Fizz", fb(3));
        assertEquals("Fizz", fb(4));
//        assertEquals("Buzz", fb(14));
//        assertEquals("Buzz", fb(10));
//        assertEquals("FizzBuzz", fb(46));
//        assertEquals("FizzBuzz", fb(15));

    }
}
