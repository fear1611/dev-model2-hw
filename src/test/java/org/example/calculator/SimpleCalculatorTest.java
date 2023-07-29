package org.example.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @BeforeAll
    public static void startPrintTestingTimeMillisClass() {
        System.out.println("Start test class execution time millis:\n" + System.currentTimeMillis());
    }

    @AfterAll
    public static void endPrintTestingTimeMillisClass() {
        System.out.println("End test class execution time millis:\n" + System.currentTimeMillis() + "\n");
    }

    @BeforeEach
    public void startPrintTestingTimeMillis() {
        System.out.println("Start test execution time millis:\n" + System.currentTimeMillis());
    }

    @AfterEach
    public void endPrintTestingTimeMillis() {
        System.out.println("End test execution time millis:\n" + System.currentTimeMillis() + "\n");
    }

    //Method tests addition
    @Test
    void testTwoPlusTwoShouldEqualFour() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(4, calculator.addition(2,2));
    }

    @Test
    void testThreePlusSevenShouldEqualTen() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(10, calculator.addition(3,7));
    }

    @Test
    void testFiveMinusTenShouldEqualMinusFive() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(-5, calculator.addition(5,-10));
    }

    @Test
    void testMinusFiveMinusTenShouldEqualMinusFifteen() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(-15, calculator.addition(-5,-10));
    }


    //Method tests subtraction
    @Test
    void testTwoMinusTwoShouldEqualZero() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(0, calculator.subtraction(2,2));
    }

    @Test
    void testSevenMinusFiveShouldEqualTwo() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(2, calculator.subtraction(7,5));
    }

    @Test
    void testTwoMinusThreeShouldEqualMinusOne() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(-1, calculator.subtraction(2,3));
    }

    @Test
    void testMinusSevenMinusThreeShouldEqualMinusTen() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(-10, calculator.subtraction(-7,3));
    }

    @Test
    void testThreeMinusSevenShouldEqualMinusFour() {
        // Given
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(-4, calculator.subtraction(3,-7));
    }


    //Method tests division
    @Test
    void testTenDivideByTwoShouldEqualsFive() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(5, calculator.division(10,2));
    }

    @Test
    void testTenDivideByTenShouldEqualsOne() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(1, calculator.division(10,10));
    }

    @Test
    void testTenDivideByZero() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertThrows(IllegalArgumentException.class, () ->
            calculator.division(10, 0));
    }


    @Test
    void testMinusTenDivideByFive() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertThrows(IllegalArgumentException.class, () ->
                calculator.division(-10, 5));
    }

    @Test
    void testFiveDivideByMinusTen() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertThrows(IllegalArgumentException.class, () ->
                calculator.division(5, -10));
    }

    @Test
    void testMinusTenDivideByMinusTen() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertThrows(IllegalArgumentException.class, () ->
                calculator.division(-10, -10));
    }


    //Method tests multiplication
    @Test
    void testMultiplyTenByTwoShouldEqualsTwenty() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(20, calculator.multiplication(10,2));
    }

    @Test
    void testMultiplyMinusTenByTwoShouldEqualsMinusTwenty() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(-20, calculator.multiplication(-10,2));
    }

    @Test
    void testMultiplyMinusTenByMinusThreeShouldEqualsThirty() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(30, calculator.multiplication(-10,-3));
    }

    @Test
    void testMultiplyTenByZeroShouldEqualsZero() {
        SimpleCalculator calculator = new SimpleCalculator();

        //When & Then
        assertEquals(0, calculator.multiplication(10,0));
    }
}