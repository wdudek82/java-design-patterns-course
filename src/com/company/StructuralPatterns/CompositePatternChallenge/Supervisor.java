package com.company.StructuralPatterns.CompositePatternChallenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private final String name;
    private final String departmentName;
    private final List<Faculty> myFacultyList;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.myFacultyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void add(Faculty professor) {
        myFacultyList.add(professor);
    }

    public void remove(Faculty professor) {
        myFacultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty() {
        return myFacultyList;
    }

    @Override
    public void getDetail() {
        System.out.println("=".repeat(40));
        System.out.println(getName() + " Department: " + getDepartmentName());
        System.out.println("=".repeat(40));

        for (Faculty professor : myFacultyList) {
            professor.getDetail();
        }
    }
}
