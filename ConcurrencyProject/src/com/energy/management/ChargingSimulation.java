package com.energy.management;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChargingSimulation {

    private static final int MAX_THREADS = 5; // Maximum number of charging threads

    public void simulateCharging(String[] energySources, int batteryId) {
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

        for (String source : energySources) {
            executor.execute(() -> {
                System.out.println("Battery " + batteryId + " is charging from " + source);
                try {
                    Thread.sleep(2000); // Simulating charging delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Charging interrupted for source: " + source);
                }
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to complete
        }
        System.out.println("Battery " + batteryId + " is fully charged.");
    }
}

