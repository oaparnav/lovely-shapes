class Square implements Drawable, Messanger{
	@Override
	public void draw(Printer printer) {
		printer.draw(this);	
	}
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "square";
	}
}