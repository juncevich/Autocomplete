package com.autocomplete;

import java.io.IOException;

/**
 * Main class.
 */
public class Main {
    /**
     * Main method.
     *
     * @param args standart parameter.
     * @throws IOException this is exception.
     */
    public static void main(final String... args) throws IOException {
        final ScanText scanText = new ScanText();
        scanText.parseFile();
        scanText.findMatches();
    }
}
