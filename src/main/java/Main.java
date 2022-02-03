import java.util.Arrays;
import java.util.List;

/*
 * Lovely Shapes
 * 
 * Problem 1: 
 * What are the problems with the current design?
 * How can we change the design to handle new shapes?
 * 
 * Problem 2:
 * How can we handle drawing a single shape, as well as 
 * collection of shapes in a common way?
 * 
 * Problem 3:
 * When would we need to modify the Shape interface?
 * Who drives that change?
 * 
 * Problem 4:
 * If there is common code shared between shapes, how can
 * we handle it so that the code is not duplicated?
 * (Inheritance vs Composition)
 * 
 * Problem 5:
 * SuperShape should first draw all the circles, then squares,
 * then triangles. How can we implement this?
 */

public class Main {
  public static void main(String[] args) {
	Drawable circle = new Circle();
    Drawable square = new Square();
    Drawable triangle = new Triangle();
    
    Drawable house = new SuperShape(Arrays.asList(square, triangle));
    Drawable pentHouse = new SuperShape(Arrays.asList(circle, square, circle, triangle, square));
    Drawable gardenHouse = new SuperShape(Arrays.asList(house, circle, pentHouse));
    List<Class<? extends Drawable>>  order= Arrays.asList(Triangle.class, Square.class, Circle.class);
    Printer printOnDevice = new PrintOnComputer(order);
    Canvas canvas = new Canvas(gardenHouse);
    canvas.draw(printOnDevice);
    printOnDevice.done();
  }
}