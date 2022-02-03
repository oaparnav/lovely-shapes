class Triangle implements Drawable, Messanger{
	


	@Override
	public String message() {
		return "Triangle";
	}


	@Override
	public void draw(Printer p) {
		p.draw(this);		
	}
}