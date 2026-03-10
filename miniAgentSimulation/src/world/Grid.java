package world;
import elements.*;
import java.util.Random;

public class Grid {

	private final int height;
	private final int width;
	private final Element[][] grid;
	
	public Grid(int height, int width) {
		this.height = height;
		this.width = width;
		this.grid = new Element[height][width];
		init();
	}
	
	private void init() {
		for (int y = 0; y < getHeight(); ++y) {
			for (int x = 0; x < getWidth(); ++x) {
				grid[y][x] = new Empty();
			}
		}
	}
	
	// TODO List of free positions to ensure that this method terminates 
	public void setRandom(int agentsCount, int obstaclesCount) {
		Random rand = new Random();
		int a = 0;
		int o = 0;
		while (a < agentsCount || o < obstaclesCount) {
			int y = rand.nextInt(getHeight());
			int x = rand.nextInt(getWidth());
			Position pos = new Position(x, y);
			if (!isFree(pos)) {
				continue;
			}
			if (a < agentsCount) {
				setElement(pos, new Agent());
				++a;
			} else {
				setElement(pos, new Obstacle());
				++o;
			}
		}
	}
	
	public boolean isFree(Position pos) {
		return getElement(pos) instanceof Empty;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public Element getElement(Position pos) {
		return grid[pos.getY()][pos.getX()];
	}
	
	public void setElement(Position pos, Element element) {
		grid[pos.getY()][pos.getX()] = element;
	}
}
