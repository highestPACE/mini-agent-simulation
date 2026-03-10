package elements;

import world.*;

public class Obstacle extends Element {
	private final Grid grid;
	private Position position;
	
	public Obstacle(Grid grid, Position position) {
		this.grid = grid;
		setPosition(position);
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

	public String getSymbol() {
		return "#";
	}
}
