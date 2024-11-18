public class MoveRover {
    private Rover rover;

    public MoveRover(Rover rover) {
        this.rover = rover;
    }

    public void move(String movements) {
        for (char move : movements.toCharArray()) { // Correct iteration over string
            if (move == 'f') {
                moveForward();
            } else if (move == 'b') {
                moveBackwards();
            } else if (move == 'r') {
                turnRight();
            } else if (move == 'l') {
                turnLeft();
            }
        }
    }

    public void moveForward() {
        Position currentPosition = rover.getPosition();
        Direction direction = rover.getDirection();

        if (direction == Direction.NORTH) {
            rover.setPosition(new Position(currentPosition.getX(), currentPosition.getY() + 1));
        } else if (direction == Direction.EAST) {
            rover.setPosition(new Position(currentPosition.getX() + 1, currentPosition.getY()));
        } else if (direction == Direction.SOUTH) {
            rover.setPosition(new Position(currentPosition.getX(), currentPosition.getY() - 1));
        } else if (direction == Direction.WEST) {
            rover.setPosition(new Position(currentPosition.getX() - 1, currentPosition.getY()));
        }
    }

    public void moveBackwards() {
        Position currentPosition = rover.getPosition();
        Direction direction = rover.getDirection();

        if (direction == Direction.NORTH) {
            rover.setPosition(new Position(currentPosition.getX(), currentPosition.getY() - 1));
        } else if (direction == Direction.EAST) {
            rover.setPosition(new Position(currentPosition.getX() - 1, currentPosition.getY()));
        } else if (direction == Direction.SOUTH) {
            rover.setPosition(new Position(currentPosition.getX(), currentPosition.getY() + 1));
        } else if (direction == Direction.WEST) {
            rover.setPosition(new Position(currentPosition.getX() + 1, currentPosition.getY()));
        }
    }

    protected void turnRight() {
        Direction direction = rover.getDirection();

        if (direction == Direction.NORTH) {
            rover.setDirection(Direction.EAST);
        } else if (direction == Direction.EAST) {
            rover.setDirection(Direction.SOUTH);
        } else if (direction == Direction.SOUTH) {
            rover.setDirection(Direction.WEST);
        } else if (direction == Direction.WEST) {
            rover.setDirection(Direction.NORTH);
        }
    }

    protected void turnLeft() {
        Direction direction = rover.getDirection();

        if (direction == Direction.NORTH) {
            rover.setDirection(Direction.WEST);
        } else if (direction == Direction.WEST) {
            rover.setDirection(Direction.SOUTH);
        } else if (direction == Direction.SOUTH) {
            rover.setDirection(Direction.EAST);
        } else if (direction == Direction.EAST) {
            rover.setDirection(Direction.NORTH);
        }
    }
}
