package com.company.StructuralPatterns.ChainOfResponsibilityPattern;

import com.company.StructuralPatterns.ChainOfResponsibilityPatternChallenge.IssueRaiser;
import com.company.StructuralPatterns.ChainOfResponsibilityPatternChallenge.Error;
import com.company.StructuralPatterns.ChainOfResponsibilityPatternChallenge.MessagePriority;

public class Demo {
    public static void run() {
        Currency currency = new Currency(1380);

        AtmDispencer atmDispencer = new AtmDispencer();

        atmDispencer.c1.dispense(currency);
    }

    public static void runChallenge() {
        Error error1 = new Error("Fax", MessagePriority.NORMAL, "Fax error 1324");
        Error error2 = new Error("Email", MessagePriority.HIGH, "Email error 432");

        IssueRaiser issueRaiser = new IssueRaiser();
        issueRaiser.raiseMessage(error1.getMessage());
        issueRaiser.raiseMessage(error2.getMessage());
    }
}
