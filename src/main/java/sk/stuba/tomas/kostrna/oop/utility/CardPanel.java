package sk.stuba.tomas.kostrna.oop.utility;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.tomas.kostrna.oop.utility.rgb.RGBPanel;
import sk.stuba.tomas.kostrna.oop.utility.textarea.TextAreaPanel;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class CardPanel extends JPanel {

    private RGBPanel rgbPanel;
    private TextAreaPanel textPanel;

    private JButton showRGBButton;
    private JButton showTextButton;

    private CardLayout cl;

    final static String RGB = "RGBPanel";
    final static String TEXT = "TextPanel";

    private static final int SIZE = 400;

    public CardPanel() {
        super();
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setVisible(true);
        this.setFocusable(true);
        this.cl = new CardLayout();
        this.setLayout(cl);
        initializePanels();
    }

    private void initializePanels() {
        this.showTextButton = new JButton(TEXT);
        this.rgbPanel = new RGBPanel();
        this.rgbPanel.add(this.showTextButton);

        this.add(this.rgbPanel, RGB);

        this.showRGBButton = new JButton(RGB);
        this.textPanel = new TextAreaPanel();
        this.textPanel.add(this.showRGBButton);

        this.add(this.textPanel, TEXT);


        this.showTextButton.addActionListener(e -> this.cl.show(this, TEXT));
        this.showRGBButton.addActionListener(e -> this.cl.show(this, RGB));

        this.revalidate();
        this.repaint();
    }

}
