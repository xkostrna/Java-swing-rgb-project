package sk.stuba.tomas.kostrna.oop.utility.rgb;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.event.ActionEvent;

@Getter
@Setter
public class RGBManager {
    private RGBPanel rgbPanel;

    public RGBManager(RGBPanel panel) {
        this.rgbPanel = panel;
    }

    public void handleApplyColorsEvent(ActionEvent e) {
        if (this.rgbPanel.getChoice().getSelectedItem().equals("Custom")) {
            int redColor = Integer.parseInt(this.rgbPanel.getTextFields().getRedColor().getText());
            int greenColor = Integer.parseInt(this.rgbPanel.getTextFields().getGreenColor().getText());
            int blueColor = Integer.parseInt(this.rgbPanel.getTextFields().getBlueColor().getText());
            this.rgbPanel.getCanvas().drawSquare(new Color(redColor, greenColor, blueColor));
        }
        else if (this.rgbPanel.getChoice().getSelectedItem().equals("Red")) {
            this.rgbPanel.getCanvas().drawSquare(new Color(255, 0, 0));
        }
        else if (this.rgbPanel.getChoice().getSelectedItem().equals("Green")) {
            this.rgbPanel.getCanvas().drawSquare(new Color(0, 255, 0));
        }
        else if (this.rgbPanel.getChoice().getSelectedItem().equals("Blue")) {
            this.rgbPanel.getCanvas().drawSquare(new Color(0, 0, 255));
        }
    }

    public void handleCheckColorsEvent() {
        int redColor = this.rgbPanel.getCheckBox().getRed().isSelected() ? 255 : 0;
        int greenColor = this.rgbPanel.getCheckBox().getGreen().isSelected() ? 255 : 0;
        int blueColor = this.rgbPanel.getCheckBox().getBlue().isSelected() ? 255 : 0;
        this.rgbPanel.getCanvas().drawSquare(new Color(redColor, greenColor, blueColor));
    }
}
