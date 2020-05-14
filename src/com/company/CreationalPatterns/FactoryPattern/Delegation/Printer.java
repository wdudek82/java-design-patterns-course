package com.company.CreationalPatterns.FactoryPattern.Delegation;

public class Printer {
    // the "delegator"
    RealPrinter rp = new RealPrinter();

    void print() {
        this.rp.print();
    }
}
