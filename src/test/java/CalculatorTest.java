import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(25, calculator.add(10, 15));
    }

    @Test
    public void testSubtract(){
        assertEquals(5, calculator.subtract(20, 15));
    }

    @Test
    public void testMultiply(){
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void testDivide(){
        assertEquals(5, calculator.divide(10, 2), 0.0);
    }
}
