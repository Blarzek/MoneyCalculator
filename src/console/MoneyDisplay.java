package console;

import model.Money;

public class MoneyDisplay implements ui.ConvertionDisplay {

    @Override
    public void display(Money money) {
        System.out.println(money.getAmount() + " " + money.getCurrency());
    }

}
