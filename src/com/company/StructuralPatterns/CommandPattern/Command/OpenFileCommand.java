package com.company.StructuralPatterns.CommandPattern.Command;

import com.company.StructuralPatterns.CommandPattern.Receiver.FileSystemReceiver;

public class OpenFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    // store previous state for undo

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous state for undo
        fileSystemReceiver.openFile();
    }
}
