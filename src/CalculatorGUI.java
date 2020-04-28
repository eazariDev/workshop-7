import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {

    JFrame calcFrame;

    public CalculatorGUI(){

        calcFrame = new JFrame();
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(200,200);
        calcFrame.setLocation(200,200);
        calcFrame.setLayout(new BorderLayout());
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(1,2,5,5));

        JPanel text = new JPanel(new GridLayout(1,1,5,5));
        text.setSize(225,75);
        JTextArea display = new JTextArea(1,25);
        display.setEditable(false);
        display.setFont(new Font ("Arial" , 14, 14));
        display.setSize( 220,25);
        JPanel but = new JPanel(new GridLayout(1,1,5,5));
        JButton clearAll = new JButton("AC");
        JScrollPane scrollPane = new JScrollPane(display);
        clearAll.setSize(new Dimension(35,28));

        JPanel buttonPanel = new JPanel(new GridLayout(4,4,5,5));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("1"));

        text.add(display);
        but.add(clearAll);
        keyboardPanel.add(display);
        keyboardPanel.add(clearAll);
        calcFrame.add(keyboardPanel,BorderLayout.NORTH);
        calcFrame.add(buttonPanel,BorderLayout.CENTER);
    }


    public void showGUI(){
        calcFrame.setVisible(true);
    }

}
