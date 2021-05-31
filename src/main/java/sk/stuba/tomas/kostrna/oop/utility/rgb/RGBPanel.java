package sk.stuba.tomas.kostrna.oop.utility.rgb;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
@Setter
public class RGBPanel extends JPanel implements ActionListener {

    private RGBManager manager;
    private RGBTextFields textFields;
    private RGBCanvas canvas;
    private JButton applyButton;
    private RGBChoice choice;
    private RGBCheckBoxPanel checkBox;
    private JButton checkBoxButton;

    private final int SIZE = 400;

    public RGBPanel() {
        super();
        initializeDefaultData();
        initializeManager();
        initializeTextFields();
        initializeCanvas();
        initializeButton();
        initializeChoice();
        initializeCheckBox();
        initializeCheckBoxButton();
    }

    private void initializeCheckBoxButton() {
        this.checkBoxButton = new JButton("CHECK");
        this.checkBoxButton.addActionListener(this);
        this.add(this.checkBoxButton);
    }

    private void initializeCheckBox() {
        this.checkBox = new RGBCheckBoxPanel();
        this.add(checkBox);
    }

    private void initializeChoice() {
        this.choice = new RGBChoice();
        this.add(choice);
    }

    private void initializeManager() {
        this.manager = new RGBManager(this);
    }

    private void initializeDefaultData() {
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setVisible(true);
        this.setFocusable(true);
        this.setLayout(new FlowLayout());
    }

    private void initializeTextFields() {
        this.textFields = new RGBTextFields();
        this.add(this.textFields);
    }

    private void initializeCanvas() {
        this.canvas = new RGBCanvas();
        this.add(this.canvas);
    }

    private void initializeButton() {
        this.applyButton = new JButton("APPLY");
        this.applyButton.addActionListener(this);
        this.add(this.applyButton);
    }

    private void reDrawThisWindow() {
        this.revalidate();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(this.applyButton.getActionCommand())) {
            this.manager.handleApplyColorsEvent(e);
        }
        else if (e.getActionCommand().equals(this.checkBoxButton.getActionCommand())) {
            this.manager.handleCheckColorsEvent();
        }
    }
}
