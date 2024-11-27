import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

    @Test
    public void testPositionInitialization() {
        Position position = new Position(5, 10);
        assertEquals(5, position.getX());
        assertEquals(10, position.getY());
    }

    @Test
    public void testSetPosition() {
        Position position = new Position(0, 0);
        position.setX(8);
        position.setY(12);
        assertEquals(8, position.getX());
        assertEquals(12, position.getY());
    }

    @Test
    public void testToString() {
        Position position = new Position(3, 7);
        assertEquals("Position [y=7, x=3]", position.toString());
    }
}
