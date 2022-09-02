package com.lucas.solvd.homework2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Executor, Runnable {
    private Logger logger = LogManager.getLogger(Task.class);
    public int a;
    public boolean p;
    public String str;

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            Task task = new Task();
            Field[] fields = task.getClass().getDeclaredFields();
            try {
                for (Field field : fields) {
                    logger.info(field);
                    Thread.sleep(1024);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        logger.info("----------");
    }

    public void execute(Runnable r) {
        Executor executor = new Task();
        executor.execute(() -> {
            r.run();
        });
    }


    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(7);
        executor.submit(new Task());
        /*
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

         */
        executor.shutdown();


    }


}
