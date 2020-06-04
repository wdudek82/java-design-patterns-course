package com.company.BehavioralPatterns.VisitorPatternChallenge;

public class SouthAmericaPostageVisitor implements PostageVisitor {
    private double totalPostage = 0;

    public double getTotalPostage() {
        System.out.print("Total postage outside US = " + totalPostage + "\n");
        return totalPostage;
    }

    @Override
    public void visit(Book book) {
        if (book.getPrice() > 30) {
            totalPostage += book.getWeight() * 4;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() > 30) {
            totalPostage += cd.getWeight() * 5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() > 30) {
            totalPostage += dvd.getWeight() * 6;
        }
    }
}
