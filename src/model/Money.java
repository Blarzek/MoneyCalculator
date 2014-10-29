package model;

public class Money {
    private final float amount;
    private final Currency currency;

    public Money(float amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
