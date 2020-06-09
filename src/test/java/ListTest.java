import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test_mockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void test_mockListGetMethod() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Item");
        assertEquals("Item", listMock.get(0));
    }

    @Test
    public void test_matchers() {
        List listMock = mock(List.class);
        when(listMock.subList(anyInt(), 5)).thenThrow(new RuntimeException());
    }
}
