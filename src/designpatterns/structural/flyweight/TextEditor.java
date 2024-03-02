package designpatterns.structural.flyweight;

// Client (TextEditor)
class TextEditor {
    private CharFlyweightFactory flyweightFactory;
    private String text;

    public TextEditor(CharFlyweightFactory flyweightFactory, String text) {
        this.flyweightFactory = flyweightFactory;
        this.text = text;
    }

    public void printText() {
        for (char character : text.toCharArray()) {
            CharFlyweight flyweight = flyweightFactory.getCharFlyweight(character);
            flyweight.print();
        }
        System.out.println(); // Print a newline at the end
    }
}
