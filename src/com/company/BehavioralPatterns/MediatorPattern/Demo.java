package com.company.BehavioralPatterns.MediatorPattern;

import com.company.BehavioralPatterns.MediatorPatternChallenge.AuctionMediator;
import com.company.BehavioralPatterns.MediatorPatternChallenge.AuctionMediatorImpl;
import com.company.BehavioralPatterns.MediatorPatternChallenge.Buyer;
import com.company.BehavioralPatterns.MediatorPatternChallenge.BuyerImpl;

public class Demo {
    public static void run() {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Jennifer");
        User user3 = new UserImpl(mediator, "Lucy");
        User user4 = new UserImpl(mediator, "Ian");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }

    public static void runChallenge() {
        AuctionMediator mediator = new AuctionMediatorImpl();

        Buyer buyer1 = new BuyerImpl(mediator, "Jason");
        Buyer buyer2 = new BuyerImpl(mediator, "John");
        Buyer buyer3 = new BuyerImpl(mediator, "Jennifer");
        Buyer buyer4 = new BuyerImpl(mediator, "Lucy");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        mediator.addBuyer(buyer4);

        buyer1.bid(100);
        buyer2.bid(120);
        buyer3.bid(130);
        buyer4.bid(140);

        mediator.findHighestBidder();

        buyer4.cancelBid();

        mediator.findHighestBidder();
    }
}
