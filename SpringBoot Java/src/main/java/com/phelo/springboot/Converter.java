/*
 * This class is responsible for converting Metric units to Imperial and vice versa
 * Phelo Macanda
 * MMI Holdings LTD Technical test
 * September 2018
 */
package com.phelo.springboot;
import java.text.DecimalFormat;


/**
 *
 * @author Phelo
 */
public class Converter {
    // Initialize all the metric units
    static double INCHES = 0.0254001;
    static double FEET = 0.3048;
    static double MILES = 1609.35;
    static double MILLIMETERS = 0.001;
    static double CENTIMETERS = 0.01;
    static double METERS = 1;
    static double KILOMETERS = 1000;
    private double meters ,converted;
    
    // Round off all answers to two decimal places
    private final DecimalFormat decimal = new DecimalFormat(".##");
    
    // Obtain the unit of measure
    String afromUnit;
    
    // Constructor for initializing the unit of measure
    public Converter(String fromUnit){
        afromUnit = fromUnit;
    }
    
    // Convert from SI unit to metres
    public double toMeters(double val) {
        
        switch (afromUnit) {
            case "in":
                meters = Double.parseDouble(decimal.format(val*INCHES));
                break;
            case "ft":
                meters = Double.parseDouble(decimal.format(val*FEET));
                break;
            case "mi":
                meters = Double.parseDouble(decimal.format(val*MILES));
                break;
            case "mm":
                meters = Double.parseDouble(decimal.format(val*MILLIMETERS));
                break;
            case "cm":
                meters = Double.parseDouble(decimal.format(val*CENTIMETERS));
                break;
            case "m":
                meters = Double.parseDouble(decimal.format(val*METERS));
                break;
            default:
                meters = Double.parseDouble(decimal.format(val*KILOMETERS));
                break;
        }
    return meters;
  }
 
 // Convert from metres to SI unit
 public double fromMeters(double meters) {
        switch (afromUnit) {
            case "in":
                converted = Math.round(meters*39.369923740457715);
                break;
            case "ft":
                converted = Math.round(meters*3.280839895013123);
                break;
            case "mi":
                converted = Math.round(meters*0.0006213688756330196);
                break;
            case "mm":
                converted = Math.round(meters*1000);
                break;
            case "cm":
                converted = Math.round(meters*100);
                break;
            case "m":
                converted = Math.round(meters*1);
                ;
                break;
            default:
                converted = Math.round(meters*0.001);
                break;
        }
    return converted;
  }	
    
        
    
    
}
