import org.junit.*;

public class QuickBeforeAndAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
    @Before
    public void setup() {
        System.out.println("Before test");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @After
    public void teardown() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }
}
