package com.company.BehavioralPatterns.CommandPattern;

import com.company.BehavioralPatterns.CommandPattern.Command.Command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c) {
        command = c;
    }

    public void execute() {
        command.execute();
    }
}
