package hamcrest;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

    @Test
    public void test_hamcrestMatchers() {
        List<Integer> numbers = Arrays.asList(1,4,23,5);
        assertThat(numbers, hasSize(4));
        assertThat(numbers, hasItems(1,4));
        assertThat(numbers, everyItem(lessThan(30)));

        //String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        // Arrays
        Integer[] marks = {1,2,3,4};
        assertThat(marks, Matchers.arrayWithSize(4));
        assertThat(marks, arrayContainingInAnyOrder(1,4,2,3));
    }
}
