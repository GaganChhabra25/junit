import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysCompareTest {
    @Test
    public void testArray() {
        int[] numbers = {13,2,5};
        int[] expected = {2,5,13};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArray_nullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(expected = NullPointerException.class)
    public void test_nullPointerException() {
        throw new NullPointerException();
    }

    @Test(timeout = 1000)
    public void testArray_performance() {
        int array[] = {22,2,2};
        for(int i = 0; i< 10000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
