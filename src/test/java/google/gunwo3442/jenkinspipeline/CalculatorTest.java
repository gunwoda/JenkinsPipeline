package google.gunwo3442.jenkinspipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        assertEquals(5, calculator.sum(2,3));
    }

    @Test
    public void testSum2(){
        assertEquals(8, calculator.sum(4,4));
    }
}
