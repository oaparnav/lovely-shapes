import java.util.List;

public class SuperShape implements Drawable{
	private List<Drawable> drawable;

	SuperShape(List<Drawable> drawable) {
		this.drawable = drawable;
	}

	@Override
	public void draw(Printer printer) {
		drawable.forEach(draw -> draw.draw(printer));
	}
}
