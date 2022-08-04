import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomArrayTest {

    @Test
    public void testWrongSizeOfArray() {
        Assert.assertThrows(RuntimeException.class, () -> new RandomArray(1));
    }
}
