package com.energy.management;

import org.junit.jupiter.api.Test;

class ChargingSimulationTest {

    @Test
    void testSimulateCharging() {
        ChargingSimulation simulation = new ChargingSimulation();
        String[] sources = {"Solar", "Wind", "Hydro"};
        simulation.simulateCharging(sources, 1);
        // Verify results manually through console logs.
    }
}
