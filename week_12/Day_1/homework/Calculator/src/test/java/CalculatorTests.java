
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void calculatorCanAdd() {
        assertEquals(6, calculator.add(2, 4));
    }

    @Test
    public void calculatorCanSubtract() {
        assertEquals(6, calculator.subtract(12, 6));
    }

    @Test
    public void calculatorCanMultiply() {
        assertEquals(30, calculator.multiply(5, 6));
    }

    @Test
    public void calculatorCanDivide() {
        assertEquals(30, calculator.divide(90, 3));
    }
}
