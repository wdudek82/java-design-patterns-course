package com.company.StructuralPatterns.ProxyPatternChallenge;

import java.net.ConnectException;
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
        String[] blackList = new String[]{
                "www.foo.com",
                "www.bar.com",
                "www.baz.com",
        };

        blacklistedAddresses.addAll(Arrays.asList(blackList));
    }

    @Override
    public void connect(String address) throws ConnectException {
        boolean isBlacklisted = blacklistedAddresses.contains(address.toLowerCase());

        if (isBlacklisted) {
            throw new ConnectException("Access Denied");
        }

        RealConnector realConnector = new RealConnector();
        realConnector.connect(address);
    }
}
