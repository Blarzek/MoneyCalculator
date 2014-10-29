package control;

import model.CurrencySet;

public class ExchangeOperation {
    private CurrencySet cs;
    
    public ExchangeOperation (CurrencySet cs){
        this.cs = cs;
    }

    public CurrencySet getCurrencySet() {
        return cs;
    }
}
