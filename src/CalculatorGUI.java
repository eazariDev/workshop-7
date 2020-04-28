import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {

    JFrame calcFrame;

    public CalculatorGUI(){

        calcFrame = new JFrame();
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(300,300);
        calcFrame.setLocation(200,200);
        calcFrame.setLayout(new BorderLayout());
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel keyboardPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextArea display = new JTextArea(2,20);
        display.setEditable(false);
        display.setFont(new Font ("Arial" , 14, 14));
        JScrollPane scrollPane = new JScrollPane(display);

        JPanel but = new JPanel(new GridLayout(1,1,5,5));
        JButton clearAll = new JButton("  AC  ");

        JPanel buttonPanel = new JPanel(new GridLayout(4,4,5,5));
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("/"));
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(new JButton("*"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("-"));
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("="));
        buttonPanel.add(new JButton("+"));

        keyboardPanel.add(display);
        keyboardPanel.add(clearAll);
        calcFrame.add(keyboardPanel,BorderLayout.NORTH);
        calcFrame.add(buttonPanel,BorderLayout.CENTER);

    }


    public void showGUI(){
        calcFrame.setVisible(true);
    }

}
