package com.company.BehavioralPatterns.ProxyPatternChallenge;

import java.net.ConnectException;

public interface Connector {
    void connect(String address) throws ConnectException;
}
