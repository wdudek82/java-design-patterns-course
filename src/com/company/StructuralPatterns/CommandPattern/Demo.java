package com.company.StructuralPatterns.CommandPattern;

import com.company.StructuralPatterns.CommandPattern.Command.CloseFileCommand;
import com.company.StructuralPatterns.CommandPattern.Command.OpenFileCommand;
import com.company.StructuralPatterns.CommandPattern.Command.WriteFileCommand;
import com.company.StructuralPatterns.CommandPattern.Receiver.FileSystemReceiver;
import com.company.StructuralPatterns.CommandPattern.Receiver.FileSystemReceiverUtil;
import com.company.StructuralPatterns.CommandPatternChallenge.Broker;
import com.company.StructuralPatterns.CommandPatternChallenge.Command.BuyStock;
import com.company.StructuralPatterns.CommandPatternChallenge.Command.Order;
import com.company.StructuralPatterns.CommandPatternChallenge.Command.SellStock;
import com.company.StructuralPatterns.CommandPatternChallenge.Receiver.Stock;

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
