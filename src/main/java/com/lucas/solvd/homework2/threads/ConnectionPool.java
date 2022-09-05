package com.lucas.solvd.homework2.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    public static int size = 0;
    public List<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    Logger logger = LogManager.getLogger(ConnectionPool.class);

    public ConnectionPool(int size) {
        this.size = size;
        this.connectionPool = new ArrayList<>(size);
    }

    public void removeConnection(Connection connection) {
        connectionPool.remove(connection);
    }

    private void add(Connection connection) {
        connectionPool.add(connection);
    }

    public synchronized Connection getConnection() {
        if (!freeSlot()) {
            //queue
            logger.info("Pool is full, entering queue...");
            for (int i = 10; i > 0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (freeSlot()) {
                    i = 0;
                    Connection connection = create("url,user,password");
                    add(connection);
                    return connection;
                }
            }
            throw new RuntimeException("no connections available after 10 seconds");
        } else if (freeSlot()) {
            Connection connection = create("url,user,password");
            add(connection);
            return connection;
        }
        return new Connection("url,user,password");
    }

    private Connection create(String name) {
        Connection connection = new Connection(name);

        return connection;
    }


    public boolean freeSlot() {
        return connectionPool.size() < this.size;
    }
}
