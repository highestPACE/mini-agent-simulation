package world;
import renderer.*;

public class World extends Thread {
	private Grid grid;
	
	public World(int height, int width) {
		setGrid(new Grid(height, width));
	}
	
	@Override
	public void run() {
		ConsoleRenderer renderer = new ConsoleRenderer();
		while (!isInterrupted()) {
			update();
			renderer.render(grid);
		}
	}
	
	public void update() {
		grid.updateAgents();
	}
	
	public void setRandom(int agentsCount, int obstaclesCount) {
		grid.setRandom(agentsCount, obstaclesCount);
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
}
