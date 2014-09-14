package com.filip;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Log4jLogging 
{
	private static Logger log4jlogger = LogManager.getLogger(Log4jLogging.class);
    public static void main( String[] args )
    {
       	log4jlogger.info("AHOJ");
    }
}
