package designpatterns.structural.decorator;

class BoldText extends TextDecorator {
    public BoldText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<b>" + decoratedText.getContent() + "</b>";
    }
}
