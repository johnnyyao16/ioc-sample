package com.maycur.ioc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassUtil {

    private static Logger logger = LoggerFactory.getLogger(ClassUtil.class);

    public static Class loadClass(String className) {
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            logger.error("Class not found {}", e);
        }
        return null;
    }
}
