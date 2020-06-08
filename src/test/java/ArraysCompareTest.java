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
}
