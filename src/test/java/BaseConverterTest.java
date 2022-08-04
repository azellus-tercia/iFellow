import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseConverterTest {
    private final BaseConverter baseConverter = new BaseConverter();

    @Test
    public void testConvertKelvins() {
        Assert.assertEquals(baseConverter.convert(30, 'K'), 303.15);
    }

    @Test
    public void testConvertFahrenheits() {
        Assert.assertEquals(baseConverter.convert(30, 'F'), 86.0);
    }

    @Test
    public void testConvertWrongType() {
        Assert.assertThrows(IllegalArgumentException.class, () -> baseConverter.convert(30, 'T'));
    }
}
