package renderer;
import world.*;

public class ConsoleRenderer {
	
	public void render(Grid grid) {
		String res = "";
		
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
}
