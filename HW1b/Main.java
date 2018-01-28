package com.hw1b.veselov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer tc = new TextContainer();
        Class<?> cls = tc.getClass();

        if (!cls.isAnnotationPresent(SaveTo.class)){
            return;
        }
        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        String text = saveTo.text();
        Method [] methods = cls.getDeclaredMethods();

        for (Method m: methods) {
            if (m.isAnnotationPresent(Saver.class)){
                m.invoke(tc, text);
            }
        }
    }
}
