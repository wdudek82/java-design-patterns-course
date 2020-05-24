package com.company.StructuralPatterns.CommandPattern;

public class Demo {
    public static void run() {
        // creating the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // create the command with the associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // creating invoker and associate it with the command
        FileInvoker file = new FileInvoker(openFileCommand);

        // perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }

    public static void runChallenge() {

    }
}
