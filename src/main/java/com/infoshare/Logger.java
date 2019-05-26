package com.infoshare;

public class Logger {

    private static Logger LOG_INSTANCE;

    private Logger() {}

    private static Logger getInstance() {

        synchronized (Logger.class) {
            if (LOG_INSTANCE == null) {
                LOG_INSTANCE = new Logger();

            }
            return LOG_INSTANCE;
        }
    }
}