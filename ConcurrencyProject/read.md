# Energy Management System - Concurrency

- Group 7.2


## Role Distribution
- **Team Member **: 
- Name: Junaid Ahmad 
- Enrolment NO: 7222074


## Screencast link
https://drive.google.com/file/d/1smsx19LmRzWeYVAyYXp_kxW-Ldd0Bq6K/view?usp=sharing


# Concurrency in Energy Management System - Java Project

## Project Overview
This project enhances the existing Energy Management System by adding concurrency functionality to simulate:
1. **Multithreaded charging of batteries from several energy sources.**
2. **Multithreaded usage of batteries by multiple energy objects, with overload control mechanisms.**

The system demonstrates Java concurrency concepts like thread management, synchronization, and controlling system overload.

---

## File Structure

### `src` Directory:
- **com.energy.management**
  - `ChargingSimulation.java`: Simulates the charging of batteries from multiple energy sources using multithreading.
  - `BatteryUsageSimulation.java`: Simulates the usage of batteries by multiple devices in a multithreaded environment.
  - `OverloadControl.java`: Controls overload scenarios and ensures proper resource allocation during concurrent usage.
  - `LogFile.java`: Represents log files to track activities in the system.
  - `LogEntry.java`: Represents individual log entries.
  - `EnergyManagementSystem.java`: Main class to run the energy management system.

### `test/java` Directory:
- **com.energy.management**
  - `ChargingSimulationTest.java`: Unit tests for `ChargingSimulation.java`.
  - `BatteryUsageSimulationTest.java`: Unit tests for `BatteryUsageSimulation.java`.
  - `LogFileManagerTestSuite.java`: Combines all test cases into a single suite.

### Additional Files:
- **readme.md**: This file provides an overview of the project.
- **requirements.md**: Contains the system requirements for the project.
- **answers.md**: Contains answers to the questions asked for this project.

---

## Features
- **Multithreaded Charging**: Multiple energy sources (e.g., Solar, Wind, Hydro) charge batteries concurrently.
- **Multithreaded Usage**: Multiple devices consume energy from the same batteries in a synchronized manner.
- **Overload Control**: Prevents system overload and ensures balanced usage of resources.
- **Unit Testing**: Includes JUnit 5 tests for all implemented features.

---

## How to Run the Project
1. **Open the Project**: Import the project into Eclipse.
2. **Run the Application**:
   - Right-click on `EnergyManagementSystem.java` → Run As → Java Application.
3. **Run Unit Tests**:
   - Right-click on `LogFileManagerTestSuite.java` → Run As → JUnit Test.

---


## Java Concurrency Concepts Used
- Threads
- Synchronization
- Blocking vs. Non-blocking Algorithms
- Resource Management


