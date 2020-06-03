package com.company.BehavioralPatterns.CommandPattern.Receiver;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
