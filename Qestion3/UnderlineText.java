package Qestion3;

public class UnderlineText extends TextDecorator {
    public UnderlineText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", underline";
    }
}

