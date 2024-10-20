import org.auro.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(5, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        // Test the subtract method
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(2, result);
    }
}