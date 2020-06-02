package com.company.StructuralPatterns.TemplatePattern;

public abstract class HouseTemplate {

    // template method, final so subclasses cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("House is built.");
    }

    protected abstract void buildPillars();

    protected abstract void buildWalls();

    // default implementation, hook method
    private void buildWindows() {
        System.out.println("Building Glass Windows.");
    }

    protected void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand.");
    }
}
