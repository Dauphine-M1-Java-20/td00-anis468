package fr.dauphine.ja.hamounianis.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
	 PrimeCollection primeTest = new PrimeCollection();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
    
    public void test0IsPrime() {
    	assertFalse(primeTest.isPrime(0));
    }
    public void testTwoIsPrime() {
    	assertTrue(primeTest.isPrime(2));
    } 
    public void test9IsNotPrime() {
    	assertFalse(primeTest.isPrime(9));
    }
}
