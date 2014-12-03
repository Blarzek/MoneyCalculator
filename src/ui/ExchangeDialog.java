package ui;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog extends JPanel implements {
    
    private final Currency[] currencies;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;
    private JTextField amount;
    
    public Exchange getExchange(){
        return new Exchange(getMoney(), getCurrency());
    }
    
    private Money getMoney(){
        return new Money(getAmount(), getFromCurrency());
    }
    
    public double getAmount(){
        return Double.parseDouble(amount.getText());
    }
    
    public double getFromCurrency(){
        return fromCurrency.getItemAt(fromCurrency.getSelectedIndex());
    }
    
    private void createWidgets(){
        add(createAmount());
        add(createFromCurrency());
        add(createToCurrency());
    }
    
    public ExchangeDialog(CurrencySet cs) {
        Exchange exchange = new Exchange(new Money(10,cs.getCurrency("EUR")),cs.getCurrency("USD"));
    }
    
    private JTextField createAmount() {
        this.amount = new JTextField(10);
        return amount;
    }
    
    private JComboBox<Currency> createFromCurrency (){
        this.fromCurrency = new JComboBox<>(currencies);
        return fromCurrency;
    }
    
    private JComboBox<Currency> createToCurrency(){
        JComboBox<Currency>
    }
}
