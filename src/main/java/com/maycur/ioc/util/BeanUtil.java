package com.maycur.ioc.util;

import org.apache.commons.beanutils.ConstructorUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class BeanUtil {

    public static <T> T constructBean(Class<T> beanClass, Object[] constructorArgs)
        throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return ConstructorUtils.invokeConstructor(beanClass, constructorArgs);
    }

    public static void injectField(Field field, Object obj, Object value) throws IllegalAccessException {
        if (field != null) {
            field.setAccessible(true);
            field.set(obj, value);
        }
    }
}
