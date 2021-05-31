package sk.stuba.tomas.kostrna.oop;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.tomas.kostrna.oop.utility.CardPanel;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class Application extends JFrame {

    private CardPanel panel;

    private static final int SIZE = 500;

    public Application() {
        super("App");
        initializeMainWindow();
    }

    private void initializeMainWindow() {
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.createBufferStrategy(2);
        this.setFocusable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        addPanel();
        reDrawThisWindow();
    }

    private void addPanel() {
        this.panel = new CardPanel();
        this.add(this.panel);
    }

    private void reDrawThisWindow() {
        this.revalidate();
        this.repaint();
    }



}
