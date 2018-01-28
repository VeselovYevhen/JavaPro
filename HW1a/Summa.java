package com.hw1.veselov;

public class Summa {

    @MyAnnotation(numberOne = 10, numberTwo = 20)

    public int getSumma (int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
}
