package com.company.StructuralPatterns.TemplatePattern;

import com.company.StructuralPatterns.TemplatePatternChallenge.OnlineOrderProcess;
import com.company.StructuralPatterns.TemplatePatternChallenge.OrderProcessTemplate;
import com.company.StructuralPatterns.TemplatePatternChallenge.StoreOrder;

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
