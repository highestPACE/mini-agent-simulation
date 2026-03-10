package world;

public class World extends Thread {
	private Grid grid;
	
	public World(int height, int width) {
		setGrid(new Grid(height, width));
	}
	
	@Override
	public void run() {
		while (!isInterrupted()) {
			update();
		}
	}
	
	public void update() {
		getGrid().updateAgents();
	}
	
	public void setRandom(int agentsCount, int obstaclesCount) {
		grid.setRandom(agentsCount, obstaclesCount);
	}
	
	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
}
