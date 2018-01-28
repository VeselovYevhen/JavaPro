package com.hw1.veselov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Summa summa = new Summa();
        Class <?> cls = summa.getClass();
        Method[] methods = cls.getDeclaredMethods();

        for (Method m: methods){
            if (m.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
                int result = (Integer)m.invoke(summa,myAnnotation.numberOne(), myAnnotation.numberTwo());
                System.out.println("Result =" + " " + result);
            }
        }
    }
}
