package swing;

import model.Currency;
import model.Exchange;
import model.Money;
import ui.ExchangeDialog;

import javax.swing.*;
import java.awt.*;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {

    private JTextField amount;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;
    private Currency[] currencies;

    public ExchangeDialogPanel(Currency[] currencies) {
        this.currencies = currencies;
        this.setLayout(new FlowLayout());
        this.createWidgets();
    }

    private void createWidgets() {
        this.add(createAmountWidget());
        this.add(createFromCurrencyWidget());
        this.add(createToCurrencyWidget());
    }

    private JComponent createAmountWidget() {
        JTextField input = new JTextField(10);
        this.amount = input;
        return input;
    }

    private Component createFromCurrencyWidget() {
        JComboBox<Currency> input = new JComboBox<Currency>(currencies);
        this.fromCurrency = input;
        return input;
    }

    private Component createToCurrencyWidget() {
        JComboBox<Currency> input = new JComboBox<Currency>(currencies);
        this.toCurrency = input;
        return input;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(getMoney(), getCurrency(toCurrency));
    }

    private Money getMoney() {
        return new Money(getAmount(), getCurrency(fromCurrency));
    }

    private double getAmount() {
        return Double.parseDouble(amount.getText());
    }

    private Currency getCurrency(JComboBox<Currency> comboBox) {
        return comboBox.getItemAt(comboBox.getSelectedIndex());
    }

}
