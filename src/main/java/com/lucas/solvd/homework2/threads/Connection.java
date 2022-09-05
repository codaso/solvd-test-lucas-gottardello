package com.lucas.solvd.homework2.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Connection {
    Logger logger = LogManager.getLogger(Connection.class);
    private String name;
    public static int staticThread = 0;
    private int threadNumber;


    public Connection(String name) {
        this.name = name;
        staticThread++;
        this.threadNumber = staticThread;
    }

    public void connect() {
        logger.info("Connection created : " + getName() + "Thread # :" + this.threadNumber);
    }

    public void disconnect() {

    }

    public String getName() {
        return this.name;
    }

    public int getThreadNumber() {
        return threadNumber;
    }

}
