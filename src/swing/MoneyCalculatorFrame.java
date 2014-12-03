package swing;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MoneyCalculatorFrame extends JFrame {
    
    private ActionListener actionListener;
    private final Currency[] currencies;
    
    public MoneyCalculatorFrame(){
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension (300,300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();
        this.setVisible(true);
    }
    
    private void createWidgets(){
        
    }
    
    public void registerActionInCalculateButton(ActionListener actionListener){
        this.actionListener = actionListener;
    }
}