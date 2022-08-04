import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatedSymbolTest {
    private final RepeatedSymbol repeatedSymbol = new RepeatedSymbol();

    @Test
    public void testRepeatedSymbol() {
        Assert.assertEquals(repeatedSymbol.getRepeatedSymbol("Hello"), "l");
    }

    @Test
    public void testNoRepeatedSymbol() {
        Assert.assertEquals(repeatedSymbol.getRepeatedSymbol("How"), "No repeated symbols were found.");
    }

    @Test
    public void testSymbolsAreLessThanRequired() {
        Assert.assertEquals(repeatedSymbol.getRepeatedSymbol(""), "Word contains less than 2 symbols.");
    }
}
