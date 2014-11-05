package ui;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {

    public ExchangeDialog(CurrencySet cs) {
        Exchange exchange = new Exchange(new Money(10,cs.getCurrency("EUR")),cs.getCurrency("USD"));
    }
}
