package com.maven.Logging;

import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
class Materials
{
	private static final Logger LOGGER = LogManager.getLogger(Materials.class);
	static void meth()
	{
		double MatCost,Area;
	    Scanner sc=new Scanner (System. in);
	    LOGGER.info("Choose material cost which you want to use for construction from below");
	    LOGGER.info("1.StandardMaterial cost:1200");
	    LOGGER.info("2.AboveStandardMaterialcost:1500");
	    LOGGER.info("3.HighStandardMaterialcost:1800");
	    LOGGER.info("4.HighStandardMaterialcost and fully automated home:2500");
	    LOGGER.info("Enter the material cost:");
	    MatCost=sc.nextDouble();
	    LOGGER.info("Enter area of the house:");
	    Area=sc.nextDouble();
	    Materials.calculate(MatCost,Area);
	    
	    LOGGER.info("Method executed successfully");
	}
	static void calculate(double t,double r)
	{
		double cost;
		cost=t*r;
		LOGGER.info("Cost of the house="+cost);
	}
	
}

public class Construction 
{
    public static void main( String[] args )
    {
    	Materials.meth();   
    }
    
   
	
}
