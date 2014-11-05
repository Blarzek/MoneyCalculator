package control;

import model.CurrencySet;
import model.ExchangeRate;
import model.Money;
import ui.ExchangeDialog;

public class ExchangeOperation {
    private CurrencySet cs;
    
    public ExchangeOperation (CurrencySet cs){
        this.cs = cs;
    }

    public CurrencySet getCurrencySet() {
        return cs;
    }
    
    private void readExchange(){
        ExchangeDialog eo = new ExchangeDialog(cs);
        // ejecutar
        // get exchange
    }
    
    private void readExchangeRate(){
        /*
        load de ExchangeRateLoader
        */
    }
    private void calculate(Money money, ExchangeRate er){
        /*
        coge el amount de money, hace la multiplicacion y hace un money nuevo
        */
    }
    public void execute() {
        //ExchangeDialog
        //Exchanger
        //MoneyDisplay
    }
}
