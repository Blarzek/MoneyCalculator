package application;

import control.ExchangeOperation;
import model.CurrencySet;
import persistence.CurrencySetLoader;
import swing.MoneyCalculatorFrame;

public class Application {
    public static void main (String [ ] args){
        CurrencySet currencySet = new CurrencySetLoader().load();
        MoneyCalculatorFrame frame = new MoneyCalculatorFrame(currencySet.toArray());
        frame.registerActionInCalculateButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new ExchangeOperation(frame);
            }
        });
        ExchangeOperation exchangeOperation = new ExchangeOperation(currencySet);
        exchangeOperation.execute();
    }
}
