package main;
import world.*;
import renderer.*;

public class Main {

	public static void main(String[] args) {
		int height = 10;
		int width = 10;
		World world = new World(height, width);
		
		ConsoleRenderer renderer = new ConsoleRenderer(world);
		
		renderer.render();
	}
}
