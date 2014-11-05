package application;

import control.ExchangeOperation;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class Application {
    public static void main (String [ ] args){
        CurrencySet cs = new CurrencySetLoader().load();
        ExchangeOperation eo = new ExchangeOperation(cs);
        eo.execute();
    }
}
