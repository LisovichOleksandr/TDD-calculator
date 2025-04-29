package org.example;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void test_sum() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.sum(5, 2);

        // Assert
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_div() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.div(6, 2);

        // Assert
        Assert.assertEquals(3, result);
    }
}
