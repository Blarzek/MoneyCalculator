package model;

import java.util.HashMap;

public class CurrencySet {
    private HashMap<String,Currency> currencySet;
    
    public CurrencySet(){
        currencySet = new HashMap<>();
    }
    public Currency getCurrency(String code){
        return currencySet.get(code);
    }
}
