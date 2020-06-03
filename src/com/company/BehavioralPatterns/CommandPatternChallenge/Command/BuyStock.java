package com.company.BehavioralPatterns.CommandPatternChallenge.Command;

import com.company.BehavioralPatterns.CommandPatternChallenge.Receiver.Stock;

public class BuyStock implements Order {
    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
