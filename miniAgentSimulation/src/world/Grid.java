package world;
import elements.*;

public class Grid {

	private final int height;
	private final int width;
	private final Cell[][] grid;
	
	public Grid(int height, int width) {
		this.height = height;
		this.width = width;
		this.grid = new Cell[height][width];
		init();
	}
	
	private void init() {
		for (int y = 0; y < height; ++y) {
			for (int x = 0; x < width; ++x) {
				grid[y][x] = new Cell();
			}
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public Element getElement(Position pos) {
		return grid[pos.getY()][pos.getX()].getElement();
	}
	
	public void setElement(Position pos, Element element) {
		grid[pos.getY()][pos.getY()].setElement(element);
	}
}
