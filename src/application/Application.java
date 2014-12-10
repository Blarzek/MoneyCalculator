package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ExchangeOperation;
import model.CurrencySet;
import persistence.CurrencySetLoader;
import swing.ApplicationFrame;
import console.MoneyDisplay;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay()).execute();
            }
        });
    }
}
