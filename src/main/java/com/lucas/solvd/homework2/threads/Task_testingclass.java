package com.lucas.solvd.homework2.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task_testingclass implements Runnable {
    private Logger logger = LogManager.getLogger(Task_testingclass.class);
    public int a;
    public boolean p;
    public String str;

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("#Thread");
            System.out.println("****");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
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

         */
    }


    /*
    public void execute(Runnable r) {
        Executor executor = new Task();
        executor.execute(() -> {
            r.run();
        });
    }

     */


    public void execute(Runnable r) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Future<String> future = executorService.schedule(() -> {
            //
            r.run();
            return "";
        }, 1, TimeUnit.SECONDS);
        executorService.shutdown();
    }

    /*

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(7);
        Task task = new Task();
        task.execute(task);
        executor.shutdown();
    }

     */


}
