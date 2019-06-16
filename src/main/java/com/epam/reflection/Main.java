package com.epam.reflection;

import com.epam.reflection.annotations.Secured;
import com.epam.reflection.entity.Entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Method;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Method[] methods = Entity.class.getDeclaredMethods();
        for (Method method : methods) {
            Secured annoSecured = method.getAnnotation(Secured.class);
            logger.info(method + " / " + annoSecured);
        }
    }
}
