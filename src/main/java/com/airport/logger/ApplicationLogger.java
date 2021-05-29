package com.airport.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 * @apiNote LOGGER CONFIG
 */
public class ApplicationLogger {

    private Logger LOGGER = LoggerFactory.getLogger(ApplicationLogger.class);

    public void debug(String className, String methodName, String msg) {
        LOGGER.debug("CLASSNAME : {} :: METHODNAME : {} :: {}", className,methodName,msg);
    }

    public void debug(String className, String methodName, String msg, Object obj) {
        LOGGER.debug("CLASSNAME : {} :: METHODNAME : {} :: {}", className,methodName,msg, obj);
    }

}