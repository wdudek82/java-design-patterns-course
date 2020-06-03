package com.company.BehavioralPatterns.TemplatePattern;

import com.company.BehavioralPatterns.TemplatePatternChallenge.OnlineOrderProcess;
import com.company.BehavioralPatterns.TemplatePatternChallenge.OrderProcessTemplate;
import com.company.BehavioralPatterns.TemplatePatternChallenge.StoreOrder;

public class Demo {
    public static void run() {
        HouseTemplate houseType = new WoodenHouse();

        // using template method
        houseType.buildHouse();

        System.out.println("\n********************\n");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

    public static void runChallenge() {
        OrderProcessTemplate orderType = new StoreOrder();
        // orderType.isGift = true;

        orderType.processOrder();

        System.out.println("\n********************\n");

        orderType = new OnlineOrderProcess();
        orderType.isGift = true;
        orderType.processOrder();
    }
}
