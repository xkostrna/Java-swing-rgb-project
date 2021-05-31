package sk.stuba.tomas.kostrna.oop.utility.textarea;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
@Setter
public class TextAreaPanel extends JPanel implements ActionListener {

    private static final int SIZE = 400;

    private JTextArea input;
    private JTextArea output;
    private JTextArea shift;

    private JButton execute;
    private TextOperationChoice choice;

    public TextAreaPanel() {
        super();
        initializeDefaultData();
        initializeComponents();
        initializeButtonAndChoice();
    }

    private void initializeButtonAndChoice() {
        this.execute = new JButton("EXECUTE");
        this.execute.addActionListener(this);
        this.add(this.execute);

        this.choice = new TextOperationChoice();
        this.add(this.choice);
    }

    private void initializeDefaultData() {
        Dimension dimension = new Dimension(SIZE, SIZE);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setLayout(new GridLayout(5,2));
        this.setFocusable(true);
        this.setVisible(true);
    }

    private void initializeComponents() {
        this.add(new JLabel("Enter input :"));
        this.input = new JTextArea();
        this.add(this.input);

        this.add(new JLabel("Enter output :"));
        this.output = new JTextArea();
        this.output.setEditable(false);
        this.add(this.output);

        this.add(new JLabel("Enter shift :"));
        this.shift = new JTextArea();
        this.add(this.shift);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(this.execute.getActionCommand())) {
            String inputText = this.input.getText();
            if (!inputText.equals("")) {
                makeInteractionWithInput(inputText);
            }
        }
    }

    private void makeInteractionWithInput(String input) {
        if (this.choice.getSelectedItem().equals("Copy")) {
            this.output.setText(input);
        }
        else if (this.choice.getSelectedItem().equals("Reverse")) {
            this.output.setText(new StringBuilder(input).reverse().toString());
        }
        else if (this.choice.getSelectedItem().equals("Cesar cipher")) {
            int shift = (this.shift.getText().equals("") ? 2 : Integer.parseInt(this.shift.getText())) % 25;
            char[] inputArray = input.toCharArray();
            StringBuilder outputBuild = new StringBuilder();
            for (char ch : inputArray) {
                outputBuild.append( Character.toChars(((int)ch + shift)));
            }
            this.output.setText(outputBuild.toString());
        }
        this.input.setText("");

    }
}
