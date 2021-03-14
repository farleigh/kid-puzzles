package ca.farleigh.kidpuzzles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciCalculatorTest {

    @Test
    public void testZero() {
        assertEquals(0, new FibonacciCalculator().calculate(0));
    }

    @Test
    public void testOne() {
        assertEquals(1, new FibonacciCalculator().calculate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, new FibonacciCalculator().calculate(2));
    }

    @Test
    public void testThree() {
        assertEquals(2, new FibonacciCalculator().calculate(3));
    }

    @Test
    public void testFive() {
        assertEquals(5, new FibonacciCalculator().calculate(5));
    }

    @Test
    public void testTwenty() {
        assertEquals(6765, new FibonacciCalculator().calculate(20));
    }

    @Test
    public void testThirtyNine() {
        assertEquals(63245986, new FibonacciCalculator().calculate(39));
    }
}
