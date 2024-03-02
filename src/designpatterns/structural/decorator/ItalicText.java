package designpatterns.structural.decorator;

class ItalicText extends TextDecorator {
    public ItalicText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<i>" + decoratedText.getContent() + "</i>";
    }
}
