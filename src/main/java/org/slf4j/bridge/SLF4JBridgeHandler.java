package org.slf4j.bridge;

public class SLF4JBridgeHandler {

    // This monkey patch prevents Play from re-routing JUL to SL4FJ
    public static void install() {
        // do nothing
    }
    
}
