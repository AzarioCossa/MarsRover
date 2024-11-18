public class Rover{
	private Position position;
	private Direction DIRECTION;
	
	public Rover() {
		this.position = new Position(0,0);
		this.DIRECTION = DIRECTION.NORTH;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Direction getDirection() {
		return DIRECTION;
	}

	public void setDirection(Direction direction) {
		this.DIRECTION = direction;
	}
}
