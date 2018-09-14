/*
 * This class is for testing the Converter.java class has main method
 * Phelo Macanda
 * MMI Holdings LTD Technical test
 * September 2018
 */
package com.phelo.springboot;

/**
 *
 * @author Phelo
 */

public class ConvertMain {
    
    public static void main(String[] args){
    
        Converter convert = new Converter("in");
        
        System.out.println(convert.toMeters(23.0));
        
    }
    
}
