package org.example;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends TestCase {

    private static final int ZERO = 0;
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }


    @Test
    public void test_sum() {
        int result = calculator.sum(5, 2);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_sum_abs() {
        int result = calculator.sum(5, -2);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_div() {
        int result = calculator.div(6, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test_div_on_zero() {
        calculator.div(100, ZERO);
        Assert.fail();
    }

}
