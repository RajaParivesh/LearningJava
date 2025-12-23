## Functional Interface

A **Functional Interface** is an interface with exactly **ONE abstract method**, which allows it to be implemented using a **lambda expression**.

Functional interfaces are the foundation of **lambda expressions** and **functional programming** in Java.

---

### Rules

- ✅ Must contain **exactly one abstract method**
- ✅ Can have **`default` methods**
- ✅ Can have **`static` methods**
- ❌ Cannot have **more than one abstract method**

---

### Why `@FunctionalInterface`?

- Provides **compile-time safety**
- Ensures the interface remains functional
- Improves **code readability**
- Optional, but **highly recommended**

---

### Example 1: Contains only one abstract method

```java
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    String display(); // abstract method
}
```

#### Example 2: Functional Interface with default and static methods

```java
@FunctionalInterface
public interface Greeting {

    // Abstract method (only one allowed)
    String greet(String name);

    // Default method
    default void sayHello() {
        System.out.println("Hello from default method");
    }

    // Static method
    static void info() {
        System.out.println("This is a functional interface");
    }
}
```

### Key Takeaways

- Functional interfaces enable lambda expressions
- They make Java code cleaner and more expressive
- Used extensively in Streams, Collections, and Concurrency
- Lambdas work only with functional interfaces

---

## Functional Interface – Questions & Answers (Interview Ready)

---

## 1. What is a Functional Interface?

A **Functional Interface** is an interface with **exactly one abstract method**, which allows it to be implemented using a **lambda expression**.


## 2. Why are Functional Interfaces needed in Java?

- Java is primarily **object-oriented**
- Lambda expressions need a **target type**
- Functional interfaces provide that **type contract**

📌 Without functional interfaces, **lambdas cannot exist** in Java.


## 3. Can a Functional Interface have default methods?

✅ **Yes**

```java
@FunctionalInterface
interface A {
    void run();
    default void log() {
        System.out.println("Logging...");
    }
}
```

## 4. Can a Functional Interface have static methods?

✅ **Yes**

```java
@FunctionalInterface
interface A {
    void run(); // abstract method

    static void info() {
        System.out.println("Static method");
    }
}
```

## 5. Can a Functional Interface extend another interface?

✅ Yes, but only if it does not add another abstract method.

**Valid Example:**
```java
interface Parent {
    void run();
}

@FunctionalInterface
interface Child extends Parent {
    // Still only one abstract method
}
```

**Invalid Example:**
```java
interface Parent {
    void run();
}

@FunctionalInterface
interface Child extends Parent {
    void walk(); // ❌ Two abstract methods
}

```

## 6. Is @FunctionalInterface annotation mandatory?

❌ No, it is not mandatory.

✅ However, it is highly recommended because:

- It enforces compile-time validation
- Prevents accidental addition of abstract methods
- Improves code readability and maintainability

## 7. Can we use lambda expressions without Functional Interfaces?
❌ No

In Java, lambda expressions only work with functional interfaces.

## 8. What are the most important built-in Functional Interfaces in Java?

| Interface | Abstract Method | Purpose |
|----------|-----------------|---------|
| `Runnable` | `run()` | No input, no output |
| `Supplier<T>` | `get()` | Returns a value |
| `Consumer<T>` | `accept(T)` | Consumes a value |
| `Function<T, R>` | `apply(T)` | Transforms input to output |
| `Predicate<T>` | `test(T)` | Returns boolean |

📌 These interfaces are heavily used in the **Stream API**.


## 9. Difference between Functional Interface and Abstract Class

| Feature | Functional Interface | Abstract Class |
|-------|----------------------|----------------|
| Abstract methods | Only one | Multiple |
| Lambda support | ✅ Yes | ❌ No |
| Multiple inheritance | ✅ Yes | ❌ No |
| Can have fields | ❌ No | ✅ Yes |

## 10. How are Functional Interfaces used in Streams?

```java
users.stream()
     .filter(User::isActive)        // Predicate
     .map(User::getName)            // Function
     .forEach(System.out::println); // Consumer
```

## 11. Can a Functional Interface throw exceptions?

✅ Yes

```java
@FunctionalInterface
interface Task {
    void execute() throws Exception;
}
```

## 12. Can a Functional Interface have private methods?

❌ No

- Interfaces (including functional interfaces) cannot have private abstract methods.

- Private methods in interfaces are allowed only as helper methods for default methods, not as abstract methods.

## 13. Key Interview Statement ⭐

```Lambdas are not standalone functions in Java; they are implementations of functional interfaces.```