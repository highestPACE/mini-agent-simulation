package world;

public class World {
	private Grid grid;
	
	public World(int height, int width) {
		setGrid(new Grid(height, width));
	}
	
	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
}
