package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet cs = new CurrencySet();
        cs.add(new Currency("Euro", "€", "EUR"));
        cs.add(new Currency("Dólar", "$", "USD"));
        cs.add(new Currency("Libra", "£", "GBP"));
        return cs;
    }
}
