package model;

import java.util.HashMap;

public class CurrencySet {
    private HashMap<String,Currency> map;
    
    public CurrencySet(){
        map = new HashMap<>();
    }
    public Currency getCurrency(String code){
        return map.get(code);
    }

    public void add(String code, Currency currency) {
        map.put(code,currency);
    }
}
