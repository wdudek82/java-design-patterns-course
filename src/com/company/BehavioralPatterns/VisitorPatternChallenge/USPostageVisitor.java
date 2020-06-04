package com.company.BehavioralPatterns.VisitorPatternChallenge;

public class USPostageVisitor implements PostageVisitor {
    private double totalPostage = 0;

    public double getTotalPostage() {
        System.out.print("Total postage within US = " + totalPostage + "\n");
        return totalPostage;
    }

    @Override
    public void visit(Book book) {
        if (book.getPrice() > 20) {
            totalPostage += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() > 20) {
            totalPostage += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() > 20) {
            totalPostage += dvd.getWeight() * 3;
        }
    }
}
