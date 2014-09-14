package com.filip;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("javaLogger");
        logger.info("Information!");
        logger.warning("Warning Information!");
    }
}
