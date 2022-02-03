class Canvas {
	Drawable drawables;
	public Canvas(Drawable drawables) {
		this.drawables = drawables;
	}
	public void draw(Printer p) {
		drawables.draw(p);
	}

}
