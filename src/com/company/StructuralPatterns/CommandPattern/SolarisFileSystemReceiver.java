package com.company.StructuralPatterns.CommandPattern;

public class SolarisFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in Solaris OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Solaris OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Solaris OS");
    }
}
