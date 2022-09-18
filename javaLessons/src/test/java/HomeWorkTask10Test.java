import org.testng.Assert;
import org.testng.annotations.Test;
import static school.lesson2.HomeWorkTask10.shiftArray;

public class HomeWorkTask10Test {
    @Test
    void testNoShift() {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, 0);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertEquals(array, expected);
    }

    @Test
    void testNoShiftCycle() {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, 5);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertEquals(array, expected);
    }

    @Test
    void testShift7Left() {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, -7);
        int[] expected = {3, 4, 5, 1, 2};
        Assert.assertEquals(array, expected);
    }

    @Test
    void testShift7Right() {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, 7);
        int[] expected = {4, 5, 1, 2, 3};
        Assert.assertEquals(array, expected);
    }

    @Test
    void testShiftRight() {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, 1);
        int[] expected = {5, 1, 2, 3, 4};
        Assert.assertEquals(array, expected);
    }

    @Test
    void testShiftLeft() {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, -1);
        int[] expected = {2, 3, 4, 5, 1};
        Assert.assertEquals(array, expected);
    }
}
