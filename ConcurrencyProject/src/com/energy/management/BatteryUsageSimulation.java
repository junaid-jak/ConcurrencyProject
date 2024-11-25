package com.energy.management;

import java.util.concurrent.atomic.AtomicInteger;

public class BatteryUsageSimulation {

    private AtomicInteger batteryCapacity;

    public BatteryUsageSimulation(int initialCapacity) {
        this.batteryCapacity = new AtomicInteger(initialCapacity);
    }

    public void simulateUsage(int usageAmount) {
        Runnable usageTask = () -> {
            synchronized (this) {
                if (batteryCapacity.get() >= usageAmount) {
                    batteryCapacity.addAndGet(-usageAmount);
                    System.out.println(Thread.currentThread().getName() + " used " + usageAmount + " units of energy. Remaining: " + batteryCapacity.get());
                } else {
                    System.out.println(Thread.currentThread().getName() + " attempted to use energy but not enough capacity available.");
                }
            }
        };

        Thread t1 = new Thread(usageTask, "Device-1");
        Thread t2 = new Thread(usageTask, "Device-2");
        Thread t3 = new Thread(usageTask, "Device-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
