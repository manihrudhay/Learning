package designpatterns.structural.decorator;

// Example Usage
public class DecoratorMain {
    public static void main(String[] args) {

        Text plainText = new PlainText("Hello, Decorator Pattern!");

        Text boldText = new BoldText(plainText);

        Text italicBoldText = new ItalicText(boldText);
        System.out.println("Plain Text: " + plainText.getContent());
        System.out.println("Bold Text: " + boldText.getContent());
        System.out.println("Italic Bold Text: " + italicBoldText.getContent());
    }
}

