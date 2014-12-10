package control;

import model.CurrencySet;
import model.ExchangeRate;
import model.Money;
import ui.ExchangeDialog;

public class ExchangeOperation {

    private final ExchangeDialog exchangeDialog;
    private final CurrencySet currencySet;

    public ExchangeOperation(ExchangeDialog exchangeDialog) {
        this.exchangeDialog = exchangeDialog;
    }

    public CurrencySet getCurrencySet() {
        return currencySet;
    }

    private void readExchange() {
        ExchangeDialog exchangeDialog = new ExchangeDialog(currencySet);
        // ejecutar
        // get exchange
    }

    private void readExchangeRate() {
        /*
         load de ExchangeRateLoader
         */
    }

    private void calculate(Money money, ExchangeRate exchangeRate) {
        /*
         coge el amount de money, hace la multiplicacion y hace un money nuevo
         */
    }

    public void execute() {
        System.out.println(exchangeDialog);
        //ExchangeDialog
        //Exchanger
        //MoneyDisplay
    }
}
