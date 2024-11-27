import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoverTest {

	@Test
    public void testMoveForward() {
        Rover rover = new Rover();
        MoveRover moveRover = new MoveRover(rover);

        moveRover.move("f");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
    }

    @Test
    public void testMoveBackwards() {
        Rover rover = new Rover();
        MoveRover moveRover = new MoveRover(rover);

        moveRover.move("b");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(-1, rover.getPosition().getY());
    }

    @Test
    public void testTurnLeft() {
        Rover rover = new Rover();
        MoveRover moveRover = new MoveRover(rover);

        moveRover.move("l");
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void testTurnRight() {
        Rover rover = new Rover();
        MoveRover moveRover = new MoveRover(rover);

        moveRover.move("r");
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void testMultipleMovements() {
        Rover rover = new Rover();
        MoveRover moveRover = new MoveRover(rover);

        moveRover.move("ffrff");
        assertEquals(2, rover.getPosition().getX());
        assertEquals(2, rover.getPosition().getY());
        assertEquals(Direction.EAST, rover.getDirection());
    }
}
