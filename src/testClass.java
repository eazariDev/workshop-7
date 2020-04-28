import javax.swing.*;

public class testClass {

    public static void main(String[] args){

        try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                System.out.println(info.getClassName());
                if ( "nimbus".equals(info.getClassName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {

        }

        CalculatorGUI cal1 = new CalculatorGUI();
        cal1.showGUI();
    }
}
