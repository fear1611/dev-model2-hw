package org.example.calculator;

public class SimpleCalculator implements Calculator {

    @Override
    public int addition(final int a, final int b) {
        return a +  b;
    }

    @Override
    public int subtraction(final int a, final int b) {
        return b < 0 ? a - -b : a - b;

    }

    @Override
    public int division(final int a, final int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("You cannot divide by zero");
        }

        return a / b;
    }

    @Override
    public int multiplication(final int a, final int b) {
        return a * b;
    }
}
