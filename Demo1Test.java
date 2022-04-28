import static org.junit.Assert.*;
import org.junit.*;

public class Demo1Test {
    
    @Test
    public void testSum()
    {
        int[] arr1 = {1,2,3,4};
        assertEquals(10, Demo1.sumIntArray(arr1));
    }
}
