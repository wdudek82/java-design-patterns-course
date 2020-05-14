package com.company.StructuralPatterns.StrategyPattern;

import com.company.StructuralPatterns.StrategyPatternChallenge.Abacus;
import com.company.StructuralPatterns.StrategyPatternChallenge.OperationAdd;
import com.company.StructuralPatterns.StrategyPatternChallenge.CalculationStrategy;
import com.company.StructuralPatterns.StrategyPatternChallenge.OperationSubtract;

public class Demo {
    public static void run() {
        PaymentStrategy creditCardStrategy = new CreditCardStrategy("John Doe", "12234", "123", "01/11");
        PaymentStrategy paymentStrategy = new PayPalStrategy("john.doe@testing.com", "12345");

        Item item1 = new Item("12345 67890", 10);
        Item item2 = new Item("54321 09876", 8);
        Item item3 = new Item("15243 70896", 18);
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);


        shoppingCart.pay(creditCardStrategy);
        shoppingCart.pay(paymentStrategy);
    }

    public static void runChallenge() {
        Abacus abacus = new Abacus();

        CalculationStrategy operationAdd = new OperationAdd();
        CalculationStrategy operationSubtract = new OperationSubtract();

        abacus.calculate(operationAdd, 4, 8);
        abacus.calculate(operationSubtract, 4, 8);
    }
}
