package com.epam.reflection;

import com.epam.reflection.annotations.Secured;
import com.epam.reflection.entity.Entity;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SecuredTest {
    @Test
    void testSecuredAnnotation() {
        Method[] methods = Entity.class.getDeclaredMethods();
        for (Method method : methods) {
            Secured annoSecured = method.getAnnotation(Secured.class);
            if (method.getName().equals("firstMethod")) {
                assertEquals(1, annoSecured.firstValue());
                assertEquals("strict", annoSecured.secondValue());
            }
            if (method.getName().equals("secondMethod")) {
                assertEquals(2, annoSecured.firstValue());
                assertEquals("val", annoSecured.secondValue());
            }
            if (method.getName().equals("thirdMethod")) {
                assertNull(annoSecured);
            }
        }
    }
}
