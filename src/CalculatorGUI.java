import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {

    JFrame calcFrame;

    public CalculatorGUI(){

        calcFrame = new JFrame();
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(250,300);
        calcFrame.setLocation(200,200);
        calcFrame.setLayout(new BorderLayout());
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new FlowLayout());
        JTextArea display = new JTextArea(2,17);
        display.setEditable(false);
        display.setFont(new Font ("Arial" , 14, 14));
        JButton clearAll = new JButton("AC");
        JScrollPane scrollPane = new JScrollPane(display);

        keyboardPanel.add(display);
        keyboardPanel.add(clearAll);
        calcFrame.add(keyboardPanel);
    }


    public void showGUI(){
        calcFrame.setVisible(true);
    }

}
