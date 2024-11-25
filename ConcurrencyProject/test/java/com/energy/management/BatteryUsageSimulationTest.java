package com.energy.management;

import org.junit.jupiter.api.Test;

class BatteryUsageSimulationTest {

    @Test
    void testSimulateUsage() {
        BatteryUsageSimulation simulation = new BatteryUsageSimulation(100);
        simulation.simulateUsage(30);
        // Verify through console logs and ensure no overuse occurs.
    }
}
