package com.company.BehavioralPatterns.ProxyPatternChallenge;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyConnector implements Connector {
    private final List<String> blacklistedAddresses;

    public ProxyConnector() {
        blacklistedAddresses = new ArrayList<>();
        initializeBlacklist();
    }

    public void initializeBlacklist() {
        String[] blackList = new String[] {
                "www.foo.com",
                "www.bar.com",
                "www.baz.com",
        };

        blacklistedAddresses.addAll(Arrays.asList(blackList));
    }

    @Override
    public void connect(String address) {
        boolean isBlacklisted = blacklistedAddresses.contains(address);

        if (isBlacklisted) {
            System.out.println("This address is black listed. Disconnecting...");
            return;
        }

        RealConnector realConnector = new RealConnector();
        realConnector.connect(address);
    }
}
