import org.testng.Assert;
import org.testng.annotations.Test;

public class ClockPointersTest {
    private final ClockPointers clockPointers = new ClockPointers();

    @Test
    public void testRandomClockPointers() {
        Assert.assertEquals(clockPointers.getPointersDegree(10, 45), 52.5);
    }

    @Test
    public void testWrongHoursClockPointers() {
        Assert.assertThrows(IllegalArgumentException.class, () -> clockPointers.getPointersDegree(15, 10));
    }

    @Test
    public void testWrongMinutesClockPointers() {
        Assert.assertThrows(IllegalArgumentException.class, () -> clockPointers.getPointersDegree(12, 110));
    }
}
