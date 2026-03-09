package world;
import elements.*;

public class Cell {
	private Element element = new Empty();
	
	public Element getElement() {
		return element;
	}
	
	public void setElement(Element element) {
		this.element = element;
	}
	
	boolean isFree() {
		return element == null;
	}
}
