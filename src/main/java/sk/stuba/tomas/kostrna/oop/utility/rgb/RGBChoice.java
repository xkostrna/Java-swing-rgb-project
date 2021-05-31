package sk.stuba.tomas.kostrna.oop.utility.rgb;

import java.awt.*;

public class RGBChoice extends Choice {

    public RGBChoice() {
        super();
        addItemsToChoice();
    }

    private void addItemsToChoice() {
        this.add("Red");
        this.add("Blue");
        this.add("Green");
        this.add("Custom");
    }
}
