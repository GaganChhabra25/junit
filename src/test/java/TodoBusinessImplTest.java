import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplTest {

    private  List<String> list;

    @Before
    public void setup() {
        list = Arrays.asList("Spring", "Spring MVC");
    }

    @Test
    public void test_retrieveTodosRelatedToString() {
        TodoService mockedTodoService = mock(TodoService.class);
        when(mockedTodoService.retrieveTodos("Gagan")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockedTodoService);
        List<String> result = todoBusiness.retrieveTodosRelatedToString("Gagan");
        assertEquals(2, result.size());
    }
}
