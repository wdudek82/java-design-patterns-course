package com.company.BehavioralPatterns.CommandPattern;

import com.company.BehavioralPatterns.CommandPattern.Command.CloseFileCommand;
import com.company.BehavioralPatterns.CommandPattern.Command.OpenFileCommand;
import com.company.BehavioralPatterns.CommandPattern.Command.WriteFileCommand;
import com.company.BehavioralPatterns.CommandPattern.Receiver.FileSystemReceiver;
import com.company.BehavioralPatterns.CommandPattern.Receiver.FileSystemReceiverUtil;
import com.company.BehavioralPatterns.CommandPatternChallenge.Broker;
import com.company.BehavioralPatterns.CommandPatternChallenge.Command.BuyStock;
import com.company.BehavioralPatterns.CommandPatternChallenge.Command.SellStock;
import com.company.BehavioralPatterns.CommandPatternChallenge.Receiver.Stock;

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
        Stock googleStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(googleStock);
        SellStock sellStockOrder = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
        broker.placeOrders();
    }
}
