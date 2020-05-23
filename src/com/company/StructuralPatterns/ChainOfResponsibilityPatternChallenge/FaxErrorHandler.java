package com.company.StructuralPatterns.ChainOfResponsibilityPatternChallenge;

public class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;

    @Override
    public void setNextChain(ReceiverInterface nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println("Fax Error Handler: " + message.getPriority().name() + " " + message.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }
}
