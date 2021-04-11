package ca.farleigh.kidpuzzles;

import org.junit.Assert;
import org.junit.Test;

public class MinNumberTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() {
        new MinNumber().findMinimum(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoNumbers() {
        new MinNumber().findMinimum(new int[] {});
    }

    @Test
    public void testOrderedNumbers() {
        Assert.assertEquals(1, new MinNumber().findMinimum(new int[] { 1, 2, 3, 4, 5, 6 ,7 ,8, 9, 81 }));
    }

    @Test
    public void testUnorderedNumbers() {
        Assert.assertEquals(11, new MinNumber().findMinimum(new int [] { 55, 66, 77, 31, 11, 10010, 9999 }));
    }
}
