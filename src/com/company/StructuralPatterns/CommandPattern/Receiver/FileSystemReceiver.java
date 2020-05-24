package com.company.StructuralPatterns.CommandPattern.Receiver;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
