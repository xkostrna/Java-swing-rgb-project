package sk.stuba.tomas.kostrna.oop.utility.textarea;

import java.awt.*;

public class TextOperationChoice extends Choice {

    public TextOperationChoice() {
        super();
        this.add("Copy");
        this.add("Reverse");
        this.add("Cesar cipher");
    }
}
