package designpatterns.structural.bridge;

// Example Usage
public class BridgeMain {
    public static void main(String[] args) {
        Drawing redDrawing = new RedDrawing();
        Drawing greenDrawing = new GreenDrawing();

        Shape redCircle = new Circle(redDrawing, 5);
        Shape greenSquare = new Square(greenDrawing, 8);

        redCircle.draw();    // Drawing red circle with radius 5
        greenSquare.draw();  // Drawing green square with side 8
    }
}
