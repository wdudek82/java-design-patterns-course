package com.company.StructuralPatterns.CommandPatternChallenge.Command;

import com.company.StructuralPatterns.CommandPatternChallenge.Receiver.Stock;

public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
