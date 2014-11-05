package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    public CurrencySet load(){
        CurrencySet cs = new CurrencySet();
        Currency euro = new Currency("Euro","€","EUR");
        cs.add(euro.getCode(), euro);
        Currency dolar = new Currency("Dólar","$","USD");
        cs.add(dolar.getCode(), dolar);
        return cs;
    }
}
