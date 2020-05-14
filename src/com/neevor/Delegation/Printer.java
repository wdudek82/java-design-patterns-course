package com.neevor.Delegation;

public class Printer {
    // the "delegator"
    RealPrinter rp = new RealPrinter();

    void print() {
        this.rp.print();
    }
}
