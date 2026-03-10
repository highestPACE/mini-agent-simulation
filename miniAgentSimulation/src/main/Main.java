package main;
import world.*;
import renderer.*;

public class Main {

	public static void main(String[] args) {
		int height = 5;
		int width = 5;
		World world = new World(height, width);
		world.setRandom(1, 5);
		
		System.out.println("Simulation started");
		ConsoleRenderer renderer = new ConsoleRenderer();
		renderer.render(world.getGrid());
		
		for (int i = 0; i < 5; ++i) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			world.update();
			renderer.render(world.getGrid());
		}
		
		System.out.println("Simulation ended");
	}
}
