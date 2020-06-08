import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringHelperTest {

    StringHelper stringHelper;

    @Before
    public void setup() {
        stringHelper = new StringHelper();
    }

    @Test
    public void test_truncateAInFirst2Positions() {
        String actual = stringHelper.truncateAInFirst2Positions("AACD");
        assertEquals("CD", actual);
    }

    @Test
    public void test_areFirstAndLastTwoCharactersTheSame() {
        boolean areEqual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB");
        assertTrue(areEqual);
    }
}
