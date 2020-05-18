package com.company.BehavioralPatterns.CompositePattern;

// import com.company.BehavioralPatterns.CompositePattern.Example1.Developer;
// import com.company.BehavioralPatterns.CompositePattern.Example1.Directory;
// import com.company.BehavioralPatterns.CompositePattern.Example1.Employee;
// import com.company.BehavioralPatterns.CompositePattern.Example1.Manager;
import com.company.BehavioralPatterns.CompositePattern.Example2.Employee;
import com.company.BehavioralPatterns.CompositePattern.Example2.Developer;
import com.company.BehavioralPatterns.CompositePattern.Example2.Manager;
import com.company.BehavioralPatterns.CompositePatternChallenge.*;

public class Demo {
    public static void run() {
        // example1();
        example2();
    }

    public static void runChallenge() {
        Supervisor technologyDean = new Supervisor("Dr Mike", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr John", "Chair of Math Department");
        Supervisor chairOfComputerScience = new Supervisor("Dr Ian", "Chair of CS Department");

        Faculty mathProfessor1 = new Professor("John Doe", "Professor", 100);
        Faculty mathProfessor2 = new Professor("Jane Doe", "Professor", 101);

        Faculty csProfessor1 = new Professor("Irenicus", "Adjunct", 104);
        Faculty csProfessor2 = new Professor("Paulina Hernandez", "Associate", 103);
        Faculty csProfessor3 = new Professor("Alexandro Fernandez", "Associate", 102);

        technologyDean.add(chairOfMathDepartment);
        technologyDean.add(chairOfComputerScience);

        chairOfMathDepartment.add(mathProfessor1);
        chairOfMathDepartment.add(mathProfessor2);

        chairOfComputerScience.add(csProfessor1);
        chairOfComputerScience.add(csProfessor2);
        chairOfComputerScience.add(csProfessor3);

        technologyDean.getDetail();
    }

    // public static void example1() {
    //     Employee dev1 = new Developer("Jason Fedin", 100, "Pro Developer");
    //     Employee dev2 = new Developer("John Doe", 101, "Senior Backend Developer");
    //
    //     Directory engDirectory = new Directory();
    //     engDirectory.addEmployee(dev1);
    //     engDirectory.addEmployee(dev2);
    //
    //     Employee mgr1 = new Manager("Jennifer Fedin", 200, "SEO Manager");
    //     Employee mgr2 = new Manager("Ian Fedin", 201, "Myra's Manager");
    //
    //     Directory accDirectory = new Directory();
    //     accDirectory.addEmployee(mgr1);
    //     accDirectory.addEmployee(mgr2);
    //
    //     Directory companyDirectory = new Directory();
    //     companyDirectory.addEmployee(engDirectory);
    //     companyDirectory.addEmployee(accDirectory);
    //
    //     companyDirectory.showEmployeeDetails();
    // }

    public static void example2() {
        Employee dev1 = new Developer("Jason Fedin", 100, "Pro Developer");
        Employee dev2 = new Developer("John Doe", 101, "Senior Backend Developer");

        Manager mgr1 = new Manager("Jennifer Fedin", 25000);
        mgr1.addEmployee(dev1);
        mgr1.addEmployee(dev2);

        Employee dev3 = new Developer("Jane Doe", 102, "Senior Frontend Developer");

        Manager generalManager = new Manager("Alexandre Fernandez", 450_000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(mgr1);

        generalManager.showEmployeeDetails();
    }
}
