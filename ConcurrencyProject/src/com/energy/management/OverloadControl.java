package com.energy.management;

import java.util.concurrent.Semaphore;

public class OverloadControl {

    private static final int MAX_CONCURRENT_TASKS = 3; // Max tasks to avoid overload
    private Semaphore semaphore = new Semaphore(MAX_CONCURRENT_TASKS);

    public void simulateTask(String taskName) {
        try {
            semaphore.acquire();
            System.out.println(taskName + " is running...");
            Thread.sleep(3000); // Simulate task duration
            System.out.println(taskName + " has completed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Task interrupted: " + taskName);
        } finally {
            semaphore.release();
        }
    }
}
