package world;
import renderer.*;

public class World {
	private Grid grid;
	private boolean run = false;
	
	public World(int height, int width) {
		setGrid(new Grid(height, width));
	}
	
	public void run() {
		run = true;
		ConsoleRenderer renderer = new ConsoleRenderer();
		while (run) {
			update();
			renderer.render(grid);
		}
	}
	
	public void stop() {
		run = false;
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
