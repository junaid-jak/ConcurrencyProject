# Answering Theoretical Questions

## 1. Comparison of Concurrency Models

### **Thread-based Concurrency**
- **Pros**: Easy to implement, suitable for I/O-bound tasks.
- **Cons**: Overhead due to thread creation, context switching.

### **Task-based Concurrency**
- **Pros**: Better resource utilization, higher-level abstraction.
- **Cons**: Requires understanding of thread pools and executor services.

### **Actor Model**
- **Pros**: Decouples tasks, inherently thread-safe.
- **Cons**: Requires frameworks like Akka; has a learning curve.

---

## 2. Concurrency vs. Parallelism

### **Concurrency**
- Deals with managing multiple tasks simultaneously to make progress.
- Tasks may not execute at the same time but are interleaved.
- **Example**: A single CPU executing multiple threads by time-slicing.

### **Parallelism**
- Deals with executing multiple tasks simultaneously on multiple processors/cores.
- **Example**: A multi-core processor executing different threads at the same time.

---

## 3. Blocking vs. Non-blocking Algorithms

### **Blocking Algorithms**
- Involve operations where threads are blocked until resources are available.
- **Example**: Using synchronized blocks, thread locks.
- **Usage**: Suitable for scenarios requiring strict control over shared resources.
- **Drawback**: Reduces throughput due to thread contention.

### **Non-blocking Algorithms**
- Use atomic operations and lock-free data structures.
- **Example**: `java.util.concurrent.atomic` package.
- **Usage**: Suitable for high-performance scenarios requiring minimal thread contention.
- **Drawback**: Complex to implement and debug.
