package com.company.StructuralPatterns.CommandPattern;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
