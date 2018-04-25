package org.test;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Method;

public class StaticMethodTest {

    @Test
    public void testStaticMethod() {
        // This call should contain the static method whoAmI from class B, but it contains the method from class A.
        final Method[] methods = B.class.getMethods();
        boolean methodFound = false;
        for (Method method : methods) {
            if ("whoAmI".equals(method.getName())) {
                Assert.assertEquals("org.test.B", method.getDeclaringClass().getName());
                methodFound = true;
            }
        }
        if (!methodFound) {
            Assert.fail();
        }
    }
}
