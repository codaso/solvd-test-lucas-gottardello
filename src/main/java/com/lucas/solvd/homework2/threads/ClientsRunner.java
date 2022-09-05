package com.lucas.solvd.homework2.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientsRunner {
    static final int maxSize = 5;


    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(maxSize);
        ExecutorService executorService = Executors.newFixedThreadPool(maxSize);

        for (int i = 0; i < 15; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Connection connection1 = connectionPool.getConnection();
                        connection1.connect();
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        connectionPool.removeConnection(connection1);
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                }
            };
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}