package model;

import java.util.HashMap;

public class CurrencySet {
    private HashMap<String,Currency> currencyList;
    
    public CurrencySet(){
        currencyList = new HashMap<>();
    }
    public Currency getCurrency(String code){
        return currencyList.get(code);
    }

    public void add(String code, Currency currency) {
        currencyList.put(code,currency);
    }
    
    public Currency get(int index){
        return currencyList.get(index);
    }
}
