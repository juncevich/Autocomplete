package com.autocomplete;

import java.io.IOException;

public class Main {

    public static void main(final String[] args) throws IOException {
        final ScanText scanText = new ScanText();
        scanText.parseFile();
        scanText.findMatches();
    }
}
