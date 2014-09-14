package com.filip;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class SimpleCommonsLogging 
{
	private static Log log = LogFactory.getLog("simpleTestLog");
	
    public static void main( String[] args )
    {
    	log.info("Hello world info");
    	log.warn("Hello world Warning");
    	
    }
}
