package control;

import ui.ConvertionDisplay;
import ui.ExchangeDialog;

public class ExchangeOperation {

    private final ExchangeDialog exchangeDialog;
    private final ConvertionDisplay convertionDisplay;

    public ExchangeOperation(ExchangeDialog exchangeDialog, ConvertionDisplay convertionDisplay) {
        this.exchangeDialog = exchangeDialog;
        this.convertionDisplay = convertionDisplay;
    }

    public void execute() {
        convertionDisplay.display(exchangeDialog.getExchange().getMoney());
    }

}