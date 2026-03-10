package main;
import world.*;
import renderer.*;

public class Main {

	public static void main(String[] args) {
		int height = 10;
		int width = 10;
		World world = new World(height, width);
		world.setRandom(5, 5);

		new ConsoleRenderer().render(world.getGrid());
	}
}
