class Circle implements Drawable, Messanger{

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "circle";
	}

	@Override
	public void draw(Printer printer) {
		printer.draw(this);	
	}

}