package world;
import elements.*;
import java.util.Random;
import java.util.ArrayList;

public class Grid {

	private final int height;
	private final int width;
	private final Element[][] grid;
	private ArrayList<Agent> agents = new ArrayList<Agent>();
	
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
	
	private void addAgent(Position position) {
		Agent agent = new Agent(this, position);
		agents.add(agent);
	}
	
	public void updateAgents() {
		for (Agent a : agents) {
			a.move();
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
				addAgent(pos);
				++a;
			} else {
				setElement(pos, new Obstacle());
				++o;
			}
		}
	}
	
	public boolean isFree(Position position) {
		if (!isValidPosition(position)) {
			return false;
		}
		return getElement(position) instanceof Empty;
	}
	
	public boolean isValidPosition(Position position) {
		if (position.getX() < 0 || width <= position.getX()) {
			return false;
		} else if (position.getY() < 0 || height <= position.getY()) {
			return false;
		}
		return true;
	}
	
	public Element getElement(Position position) {
		return grid[position.getY()][position.getX()];
	}
	
	// TODO remove setElement, Elements locate themselves
	public void setElement(Position position, Element element) {
		grid[position.getY()][position.getX()] = element;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
}
