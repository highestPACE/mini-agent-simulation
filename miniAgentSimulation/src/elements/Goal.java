package elements;

import world.Grid;
import world.Position;

public class Goal extends Element {
	private final Grid grid;
	private Position position;
	
	public Goal(Grid grid, Position position) {
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
		return "G";
	}
}
