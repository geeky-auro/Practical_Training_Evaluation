import org.auro.Calculator;
import org.junit.Assert;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        // This method runs before each test
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        // This method runs after each test
        calculator = null; // Clean up resources
    }

    @Test
    public void testAdd() {
        int result = calculator.add(5, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(2, result);
    }
}
