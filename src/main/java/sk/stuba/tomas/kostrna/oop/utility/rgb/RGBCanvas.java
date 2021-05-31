package sk.stuba.tomas.kostrna.oop.utility.rgb;

import java.awt.*;

public class RGBCanvas extends Canvas {

    private static final int SIZE = 100;

    public RGBCanvas() {
        super();
        initializeDefaultData();
        reDrawThisWindow();
    }

    private void initializeDefaultData() {
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setFocusable(true);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0,0, SIZE, SIZE);
    }

    public void drawSquare(Color color) {
        Graphics g = this.getGraphics();
        g.setColor(color);
        g.fillRect(SIZE/2-12, SIZE/2-12, 24,24);
    }

    private void reDrawThisWindow() {
        this.revalidate();
        this.repaint();
    }

}
