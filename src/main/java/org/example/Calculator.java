package org.example;

public class Calculator {


    public int sum(int i, int i1) {
        return Math.abs(i) + Math.abs(i1);
    }

    public int div(int divined, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Divisor can not be zero!");
        else
           return divined / divisor;
    }
}
