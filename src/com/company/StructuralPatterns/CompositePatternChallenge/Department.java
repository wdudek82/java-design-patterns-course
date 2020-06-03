package com.company.StructuralPatterns.CompositePatternChallenge;

import java.util.ArrayList;
import java.util.List;

public class Department implements Faculty {
    private final String name;
    private final List<Faculty> professors;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Faculty professor) {
        professors.add(professor);
    }

    public void removeProfessor(Faculty professor) {
        professors.remove(professor);
    }

    @Override
    public void getDetail() {
        System.out.println("=".repeat(40));
        System.out.println(getName() + " Department:");
        System.out.println("=".repeat(40));

        for (Faculty professor : professors) {
            professor.getDetail();
        }
    }
}
