import java.util.List;

class Canvas {
	public void draw(Circle c) {
		System.out.println("Canvas drawing a circle.");
		c.draw();
	}

	public void draw(Square c) {
		System.out.println("Canvas drawing a square.");
		c.draw();
	}

	public void draw(Triangle c) {
		System.out.println("Canvas drawing a triangle.");
		c.draw();
	}

	public void draw(List<?> shapes) {
		// loop and draw all the shapes
	}
}
