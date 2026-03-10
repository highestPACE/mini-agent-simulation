package world;

public class Position {

	private int x = 0;
	private int y = 0;
	
	public Position(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Position)) {
			return false;
		}
		Position pos = (Position)obj;
		return (getX() == pos.getX() && getY() == pos.getY());
	}
}
