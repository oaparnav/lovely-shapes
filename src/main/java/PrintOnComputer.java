import java.util.ArrayList;
import java.util.List;

public class PrintOnComputer implements Printer{
	List<Class<? extends Drawable>> orderShapes;
	List<Messanger> messages;
	PrintOnComputer(List<Class<? extends Drawable>> order){
		this.orderShapes = order;
		this.messages = new ArrayList<>();
	}

	@Override
	public void done() {
		this.messages.stream().sorted((s1,s2) ->
		 	orderShapes.indexOf(s1.getClass()) - orderShapes.indexOf(s2.getClass()))
			.forEach(shape -> System.out.println(shape.message()));
		
	}

	@Override
	public void draw(Messanger message) {
		this.messages.add(message);	
	}

}
