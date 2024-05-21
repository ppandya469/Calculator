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

        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield); //adding textfield to the frame
        frame.setVisible(true); //visible
    }
    public static void main(String[] args) { //main
        Calculator calc = new Calculator(); //creating an instance
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}