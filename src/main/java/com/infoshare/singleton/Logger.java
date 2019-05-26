package com.infoshare.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Logger {

    private static Logger LOG_INSTANCE;

    private AtomicInteger counter = new AtomicInteger(0); //atomic zabezpiecza przed tym żeby inkrementacja była w kilku wątkach

    private Logger() {}

    private static Logger getInstance() {

        synchronized (Logger.class) { //zabezpieczenie przed wielowątkowością
            if (LOG_INSTANCE == null) {
                LOG_INSTANCE = new Logger();

            }
            return LOG_INSTANCE;
        }
    }

    private Integer increment() {
        return counter.incrementAndGet();
    }
}