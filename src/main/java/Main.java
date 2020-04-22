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
    Circle circle = new Circle();
    Square square = new Square();
    Triangle triangle = new Triangle();

    Canvas canvas = new Canvas();
    canvas.draw(circle);
    canvas.draw(square);
    canvas.draw(triangle);
  }
}
