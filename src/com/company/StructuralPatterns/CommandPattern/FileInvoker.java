package com.company.StructuralPatterns.CommandPattern;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c) {
        command = c;
    }

    public void execute() {
        command.execute();
    }
}
