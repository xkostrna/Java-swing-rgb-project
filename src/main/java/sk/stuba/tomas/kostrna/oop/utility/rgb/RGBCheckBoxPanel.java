package sk.stuba.tomas.kostrna.oop.utility.rgb;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class RGBCheckBoxPanel extends JPanel {

    private final static int SIZE = 70;

    private JCheckBox red;
    private JCheckBox green;
    private JCheckBox blue;

    public RGBCheckBoxPanel() {
        super();
        initializeDefaultData();
        initializeCheckBoxes();
    }

    private void initializeCheckBoxes() {
        this.red = new JCheckBox("Red");
        this.green = new JCheckBox("Green");
        this.blue = new JCheckBox("Blue");

        this.add(this.red);
        this.add(this.green);
        this.add(this.blue);
    }

    private void initializeDefaultData() {
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setLayout(new GridLayout(3,1));
        this.setVisible(true);
        this.setFocusable(true);
    }
}
