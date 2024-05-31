import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10]; //setting number of numerical buttons
    JButton[] functionButtons = new JButton[8]; //setting number of function buttons
    JButton addButton, subButton, mulButton, divButton; //creating operation buttons
    JButton decButton, equButton, delButton, clrButton; //creating action buttons
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30); //setting font type
    double num1 = 0, num2 = 0, result = 0; //initializing numbers
    char operator; //stores the current operation
    Calculator(){ //constructor
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows closing out of program
        frame.setSize(420, 550); //setting calculator display dimensions
        frame.setLayout(null); //no layout type set

        textfield = new JTextField(); //creating a textfield for the calculator input
        textfield.setBounds(50, 25, 300, 50); //setting text bounds
        textfield.setFont(myFont); //referencing the created font
        textfield.setEditable(false); //limits user input to certain characters

        //Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        //Adding buttons to array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        //iterating through the functionButtons
        for(int i = 0; i < 8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false); //removes button outline
        }

        //iterating through the numberButtons
        for(int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false); //removes button outline
        }

        delButton.setBounds(50,430,140,50);
        clrButton.setBounds(205,430,140,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4, 10, 10));

        //Adding buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel); //adding panel to frame
        frame.add(delButton); //adding delete button to frame
        frame.add(clrButton); //adding clear button to frame
        frame.add(textfield); //adding textfield to the frame
        frame.setVisible(true); //visible
    }
    public static void main(String[] args) { //main
        Calculator calc = new Calculator(); //creating an instance
    }

    //adding functionality to the initalized buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(numberButtons[i].getText())));
            }
        }
        if(e.getSource() == decButton){
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if(e.getSource() == equButton){
            num2 = Double.parseDouble(textfield.getText());

            switch(operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
            if(e.getSource() == clrButton){
                textfield.setText("");
            }
            if(e.getSource() == delButton){
                String string = textfield.getText();
                textfield.setText("");
                for(int i = 0; i <string.length() - 1; i++) {
                    textfield.setText(textfield.getText() + string.charAt(i));
                }
            }
        }
    }
}