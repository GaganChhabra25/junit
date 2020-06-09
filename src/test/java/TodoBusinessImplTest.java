import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TodoBusinessImplTest {

    private  List<String> list;

    @Before
    public void setup() {
        list = Arrays.asList("Spring", "Spring MVC", "Java");
    }

    @Test
    public void test_retrieveTodosRelatedToString() {
        TodoService mockedTodoService = mock(TodoService.class);
        when(mockedTodoService.retrieveTodos("Gagan")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockedTodoService);
        List<String> result = todoBusiness.retrieveTodosRelatedToString("Gagan");
        assertEquals(2, result.size());
    }

    @Test
    public void test_deleteTodoNotRelatedToSpring() {
        TodoService mockedTodoService = mock(TodoService.class);
        when(mockedTodoService.retrieveTodos("Gagan")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockedTodoService);
        todoBusiness.deleteTodoNotRelatedToSpring("Gagan");
        verify(mockedTodoService).deleteTodo("Java");
        verify(mockedTodoService, times(1)).deleteTodo("Java");
        verify(mockedTodoService, never()).deleteTodo("Spring");
    }

    @Test
    public void test_deleteTodoNotRelatedToSpring_captureArguments() {
        ArgumentCaptor<String> argumentCaptor = new ArgumentCaptor<String>();
        TodoService mockedTodoService = mock(TodoService.class);
        when(mockedTodoService.retrieveTodos("Gagan")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockedTodoService);
        todoBusiness.deleteTodoNotRelatedToSpring("Gagan");

        verify(mockedTodoService).deleteTodo(argumentCaptor.capture());
        assertEquals("Java", argumentCaptor.getValue());
    }

    @Test
    public void test_deleteTodoNotRelatedToSpring_captureArguments_multiple() {
        ArgumentCaptor<String> argumentCaptor = new ArgumentCaptor<String>();
        TodoService mockedTodoService = mock(TodoService.class);
        when(mockedTodoService.retrieveTodos("Gagan")).thenReturn(list);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockedTodoService);
        todoBusiness.deleteTodoNotRelatedToSpring("Gagan");

        verify(mockedTodoService).deleteTodo(argumentCaptor.capture());
        assertEquals(1, argumentCaptor.getAllValues().size());
    }


}
