package swing;

import model.Currency;
import ui.ExchangeDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame {

    private final Currency[] currencies;
    private ActionListener actionListener;
    private ExchangeDialog exchangeDialog;
    //private JLabel label;

    public ApplicationFrame(Currency[] currencies) throws HeadlessException {
        this.currencies = currencies;
        this.setTitle("Money calculator");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.createWidgets();
        this.setVisible(true);
    }

    public ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }

    private void createWidgets() {
        this.add(createCalculateButton(), BorderLayout.SOUTH);
        this.add(createExchangeDialogPanel());
        //label = new JLabel("");
        //label.setVisible(false);
        //this.add(label);
    }

    private Component createExchangeDialogPanel() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencies);
        this.exchangeDialog = panel;
        return panel;
    }

    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
                //label.setText("Exchange");
                //label.setVisible(true);
            }
        });
        return button;
    }

    public void register(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
    
}