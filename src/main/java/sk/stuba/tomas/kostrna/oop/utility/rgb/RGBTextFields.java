package sk.stuba.tomas.kostrna.oop.utility.rgb;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class RGBTextFields extends JPanel {

    private static final int SIZE = 100;

    private JTextField redColor;
    private JTextField greenColor;
    private JTextField blueColor;

    public RGBTextFields() {
        super();
        initializeDefaultData();
        initializeTextFields();
    }

    private void initializeDefaultData() {
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setVisible(true);
        this.setFocusable(true);
        this.setLayout(new GridLayout(3,2));
    }

    private void initializeTextFields() {
        this.add(new JLabel("R: "));
        this.redColor = new JTextField();
        this.add(this.redColor);

        this.add(new JLabel("G: "));
        this.greenColor = new JTextField();
        this.add(this.greenColor);

        this.add(new JLabel("B: "));
        this.blueColor = new JTextField();
        this.add(this.blueColor);
    }

    private void reDrawThisWindow() {
        this.revalidate();
        this.repaint();
    }

}
