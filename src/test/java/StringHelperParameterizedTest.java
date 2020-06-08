import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    private StringHelper stringHelper;
    private String input;
    private String output;

    public StringHelperParameterizedTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup() {
        stringHelper = new StringHelper();
    }

    @Parameters
    public static Collection<String[]> testConditions() {
       String[][] expectedOutputs = {
               {"AACD", "CD"},
               {"ACD", "CD"}
       };
       return Arrays.asList(expectedOutputs);
    }

    @Test
    public void test_truncateAInFirst2Positions() {
        assertEquals(
                output,
                stringHelper.truncateAInFirst2Positions(input)
        );
    }
}
