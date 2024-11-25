package com.energy.management;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    ChargingSimulationTest.class,
    BatteryUsageSimulationTest.class,
    LogFileManagerTest.class
})
public class LogFileManagerTestSuite {
    // This will run all the specified test classes
}
