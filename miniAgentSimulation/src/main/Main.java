package main;
import world.*;
import renderer.*;

public class Main {

	public static void main(String[] args) {
		int height = 10;
		int width = 10;
		World world = new World(height, width);
		world.setRandom(1, 5);
		world.run();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		world.stop();
	}
}
