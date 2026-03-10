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
	
	public Position decide() {
		Random rand = new Random();
		Position res = new Position(rand.nextInt(-1, 2), rand.nextInt(-1, 2));
		res.setX(res.getX() + position.getX());
		res.setY(res.getY() + position.getY());
		return res;
	}

	public String getSymbol() {
		return "A";
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		grid.setElement(this.position, new Empty());
		this.position = position;
		grid.setElement(this.position, this);
	}
}
