package com.company.BehavioralPatterns.MediatorPatternChallenge;

public abstract class Buyer {
    protected AuctionMediator mediator;
    protected String name;
    protected int price;

    public Buyer(AuctionMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);

    public abstract void cancelBid();

    public abstract void auctionHasEnded();
}
