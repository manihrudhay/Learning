package designpatterns.structural.flyweight;

// Concrete Flyweight (CharFlyweightImpl)
class CharFlyweightImpl implements CharFlyweight {
    private char character;

    public CharFlyweightImpl(char character) {
        this.character = character;
    }

    @Override
    public void print() {
        System.out.print(character);
    }
}
