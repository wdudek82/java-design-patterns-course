package com.company.StructuralPatterns.MediatorPatternChallenge;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediatorImpl implements AuctionMediator {
    private final List<Buyer> buyers;

    public AuctionMediatorImpl() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer buyer : buyers) {
            if (buyer.price > maxBid) {
                winner = buyer;
                maxBid = buyer.price;
            }
            buyer.auctionHasEnded();
        }

        if (winner == null) return;

        System.out.println("The auction winner is " + winner.name + ". Winner paid " + winner.price);
    }
}
