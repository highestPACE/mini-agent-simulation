package elements;
import world.*;
import java.util.Random;

public class Agent extends Element {
	private final Grid grid;
	private Position position;
	
	public Agent(Grid grid, Position position) {
		this.grid = grid;
		setPosition(position);
	}
	
	// TODO ensure that method terminates
	public Position decide() {
		Random rand = new Random();
		Position res = new Position(0, 0);
		do {
			res.setX(rand.nextInt(-1, 2) + position.getX());
			res.setY(rand.nextInt(-1, 2) + position.getY());
		} while (!grid.isFree(res));
		return res;
	}
	
	public void move() {
		setPosition(decide());
	}

	public String getSymbol() {
		return "A";
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		if (this.position != null) {
			grid.setElement(this.position, new Empty());
		}
		this.position = position;
		grid.setElement(this.position, this);
	}
}
