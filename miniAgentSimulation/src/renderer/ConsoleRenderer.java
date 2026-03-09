package renderer;
import world.*;

public class ConsoleRenderer {
	private World world;
	
	public ConsoleRenderer(World world) {
		setWorld(world);
	}
	
	public void render() {
		String res = "";
		
		Grid grid = world.getGrid();
		int height = grid.getHeight();
		int width = grid.getWidth();
		
		for (int y = 0; y < height; ++y) {
			for (int x = 0; x < width; ++x) {
				res = res.concat(" ");
				res = res.concat(grid.getElement(new Position(x, y)).getSymbol());
				res = res.concat(" ");
			}
			res = res.concat("\n");
		}
		
		System.out.println(res);
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
}
