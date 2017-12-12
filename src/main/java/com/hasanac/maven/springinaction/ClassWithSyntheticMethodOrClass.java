package com.hasanac.maven.springinaction;

import java.lang.reflect.Method;

public class ClassWithSyntheticMethodOrClass {
    private String a = "This is String";
    B objB = new B();
    public B getB() { return objB; }
    public void someMethodName() {
        B nestObj = new B();
        System.out.println("Nested Variable: " + nestObj.b);

        Class c = nestObj.getClass();
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("m: " + m + " m.isSynthetic: " + m.isSynthetic());
        }
    }
    public class B {
        private String b = "This is private String";
    }
}
