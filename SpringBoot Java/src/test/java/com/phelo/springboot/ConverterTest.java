/*
 * The class below is a test class for the Converter.java class
 * Phelo Macanda
 * MMI Holdings LTD Technical Test
 * September 2018
 */
package com.phelo.springboot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phelo
 */
public class ConverterTest {
    
    public ConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toMeters method, of class Converter.
     */
    @org.junit.Test
    public void testToMeters() {
        System.out.println("toMeters");
        double val = 23.0;
        Converter instance = new Converter("in");
        double expResult = 0.58;
        double result = instance.toMeters(val);
        assertEquals(expResult, result, 0);
        
        
        // Print this if the test fails
        fail("The values are not equal");
    }

    /**
     * Test of fromMeters method, of class Converter.
     */
    @org.junit.Test
    public void testFromMeters() {
        System.out.println("fromMeters");
        double meters = 10;
        Converter instance = new Converter("ft");
        double expResult = 33;
        double result = instance.fromMeters(meters);
        assertEquals(expResult, result, 0);
        
        // Print this if the test fails
        fail("The values are not equal");
        
    }
    
}
