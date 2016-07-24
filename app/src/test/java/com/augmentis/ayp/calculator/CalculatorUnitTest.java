package com.augmentis.ayp.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CalculatorUnitTest {
    @Test
    public void test_2_plus_2_equals_4() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("2");
        calculator.pressOperator("+");
        calculator.pressNumber("2");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(4, ResultTotal);
    }

    @Test
    public void test_225_mi_25_equals_200() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("2");
        calculator.pressNumber("2");
        calculator.pressNumber("5");
        calculator.pressOperator("+");
        calculator.pressOperator("-");
        calculator.pressOperator("x");
        calculator.pressOperator("/");
        calculator.pressOperator("-");
        calculator.pressNumber("2");
        calculator.pressNumber("5");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(200, ResultTotal);
    }

    @Test
    public void test_225_p_25_mu_2_equals_500() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("2");
        calculator.pressNumber("2");
        calculator.pressNumber("5");
        calculator.pressOperator("+");
        calculator.pressNumber("2");
        calculator.pressNumber("5");
        calculator.pressOperator("+");
        calculator.pressOperator("-");
        calculator.pressOperator("/");
        calculator.pressOperator("-");
        calculator.pressOperator("x");
        calculator.pressNumber("2");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(500, ResultTotal);
    }
    @Test
    public void test_225_mi_25_di_20_equals_10() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("2");
        calculator.pressNumber("2");
        calculator.pressNumber("5");
        calculator.pressOperator("+");
        calculator.pressOperator("-");
        calculator.pressOperator("x");
        calculator.pressOperator("/");
        calculator.pressOperator("-");
        calculator.pressNumber("2");
        calculator.pressNumber("5");
        calculator.pressOperator("+");
        calculator.pressOperator("x");
        calculator.pressOperator("/");
        calculator.pressNumber("2");
        calculator.pressNumber("0");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(10, ResultTotal);
}
    @Test
    public void test_200_p_mi_mu_20_equals_4000() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("2");
        calculator.pressNumber("0");
        calculator.pressNumber("0");
        calculator.pressOperator("+");
        calculator.pressOperator("-");
        calculator.pressOperator("x");
        calculator.pressNumber("0");
        calculator.pressNumber("2");
        calculator.pressNumber("0");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(4000, ResultTotal);
    }
    @Test
    public void test_30_multiple_4_equals_120() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("30");
        calculator.pressOperator("x");
        calculator.pressNumber("4");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(120, ResultTotal);
    }

    @Test
    public void test_77_minus_12_equals_120() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("77");
        calculator.pressOperator("-");
        calculator.pressNumber("12");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(65, ResultTotal);
    }

    @Test
    public void test_58_divide_2_equals_120() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("58");
        calculator.pressOperator("/");
        calculator.pressNumber("2");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(29, ResultTotal);
    }

    @Test
    public void test_077_minus_0012_equals_120() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("077");
        calculator.pressOperator("-");
        calculator.pressNumber("0012");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(65, ResultTotal);
    }

    @Test
    public void test_1000_minus_400_minus_150_equals_120() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1000");
        calculator.pressOperator("-");
        calculator.pressNumber("400");
        calculator.pressOperator("-");
        calculator.pressNumber("150");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(450, ResultTotal);
    }

    @Test
    public void test_1000_divide_10_minus_50_equals_120() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1000");
        calculator.pressOperator("/");
        calculator.pressNumber("10");
        calculator.pressOperator("-");
        calculator.pressNumber("50");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(50, ResultTotal);
    }

    @Test
    public void test_1000_multiple_10_minus_500_equals_9500() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1000");
        calculator.pressOperator("x");
        calculator.pressNumber("10");
        calculator.pressOperator("-");
        calculator.pressNumber("500");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(9500, ResultTotal);
    }

    @Test
    public void test_1000_multiple_0_minus_500_equals_9500() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1000");
        calculator.pressOperator("x");
        calculator.pressNumber("0");
        calculator.pressOperator("-");
        calculator.pressNumber("500");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(-500, ResultTotal);
    }

    @Test
    public void t1000_multiple_0_minus_500_equals_9500() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("1000");
        calculator.pressOperator("x");
        calculator.pressNumber("0");
        calculator.pressOperator("-");
        calculator.pressNumber("500");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(-500, ResultTotal);
    }

    @Test
    public void t0_multiple_0_minus_500_equals_9500() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("0");
        calculator.pressOperator("x");
        calculator.pressNumber("0");
        calculator.pressOperator("-");
        calculator.pressNumber("500");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(-500, ResultTotal);
    }

    @Test
    public void t100_p_10_p_10_p_300_equals_420() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("100");
        calculator.pressOperator("+");
        calculator.pressNumber("10");
        calculator.pressOperator("+");
        calculator.pressNumber("10");
        calculator.pressOperator("+");
        calculator.pressNumber("300");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(420, ResultTotal);
    }
    @Test
    public void t100_multi_10_mi_10_p_300_equals_420() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("100");
        calculator.pressOperator("x");
        calculator.pressNumber("10");
        calculator.pressOperator("-");
        calculator.pressNumber("10");
        calculator.pressOperator("+");
        calculator.pressNumber("300");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(1290, ResultTotal);
    }

    @Test
    public void t40_mu10_mi200_p3000_d50_equals_64() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("40");
        calculator.pressOperator("x");
        calculator.pressNumber("10");
        calculator.pressOperator("-");
        calculator.pressNumber("200");
        calculator.pressOperator("+");
        calculator.pressNumber("3000");
        calculator.pressOperator("/");
        calculator.pressNumber("50");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(64, ResultTotal);
    }

    @Test
    public void t40_m10_m200_m3000_m50_m27_equals_3327() {
        Calculator calculator = new Calculator();
        calculator.pressNumber("40");
        calculator.pressOperator("+");
//        calculator.pressOperator("+");
        calculator.pressNumber("10");
        calculator.pressOperator("+");
        calculator.pressNumber("200");
        calculator.pressOperator("+");
        calculator.pressNumber("3000");
        calculator.pressOperator("+");
        calculator.pressNumber("50");
        calculator.pressOperator("+");
        calculator.pressNumber("27");
        calculator.pressEqual();
        int ResultTotal = calculator.getResult();
        assertEquals(3327, ResultTotal);
    }
}