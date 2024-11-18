import java.util.HashMap;

public class Grid {
	int X_DIMENSION = 100;
	int Y_DIMENSION = 100;
	HashMap<Position, Obstacle> gridCases = new HashMap<Position, Obstacle>();
	
	public Grid() {
		initializeGrid();
	}
	
	protected void initializeGrid() {
		for (int i=0; i<this.X_DIMENSION; i++) {
			for (int j=0; j<this.Y_DIMENSION; j++) {
				gridCases.put(new Position(i,j), null);
			}
		}
	}
	
	public boolean isPositionEmpty(Position position) {
        if (!gridCases.containsKey(position)) {
            throw new IllegalArgumentException("Position is out of grid bounds.");
        }
        return gridCases.get(position) == null;
    }
	
	public void setCase(Obstacle obstacle, Position position) {
		if (isPositionEmpty(position)) {
			gridCases.replace(position, obstacle);
		}
		else {
			System.out.println("La position est déjà occupée");
		}
			
	}
}
