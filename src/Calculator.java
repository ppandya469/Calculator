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