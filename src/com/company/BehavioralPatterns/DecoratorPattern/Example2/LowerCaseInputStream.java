package com.company.BehavioralPatterns.DecoratorPattern.Example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws  IOException {
        int result = in.read(b, offset, len);

        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
