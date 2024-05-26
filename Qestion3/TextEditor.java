package Qestion3;

public class TextEditor {
    public static void main(String[] args) {
        try {
            Text myText = new Text("I am a DP");
            System.out.println(myText.getDescription());

            Text boldText = new BoldText(myText);
            System.out.println(boldText.getDescription());

            Text italicText = new ItalicText(boldText);
            System.out.println(italicText.getDescription());

            Text underlineText = new UnderlineText(italicText);
            System.out.println(underlineText.getDescription());
        } catch (Exception e) {
            System.out.println("Error in text processing: " + e.getMessage());
        }
    }
}

// using decortor desgin pattern


