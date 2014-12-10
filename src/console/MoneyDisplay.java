package console;

public class MoneyDisplay implements ui.ConvertionDisplay {

    public MoneyDisplay() {

    }

    @Override
    public void display(Money money) {
        System.out.println(money);
    }

}
