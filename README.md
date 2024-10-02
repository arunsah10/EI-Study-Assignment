
# **EI Study Assignment**

## **Exercise 1**

This exercise assignment demonstrates the implementation of six different design patterns, categorized into **Behavioral**, **Creational**, and **Structural** patterns. These patterns are foundational to building scalable, maintainable, and flexible software. Each design pattern is showcased through two unique use cases, providing a practical understanding of their real-world applications.

The project adheres to best practices in terms of code organization, defensive programming, and performance optimization, while ensuring that the solution is easy to maintain and extend.

## **Project Structure**

The project is structured to reflect the separation of concerns by placing each design pattern in its appropriate directory. Each class resides in its own file, and a clear naming convention is followed throughout.

```
design_patterns/
│
├── behavioral/
│   ├── CommandPattern/
│   ├── ObserverPattern/
├── creational/
│   ├── FactoryPattern/
│   ├── SingletonPattern/
├── structural/
│   ├── AdapterPattern/
│   ├── DecoratorPattern/
```

## **Behavioral Design Patterns**

### 1. **Command Pattern**
   - **Purpose:** Encapsulates requests as objects, allowing for parameterization of methods with different requests and delayed execution.
   - **Use Case:** Control a `Light` object, where commands like turning the light on and off are encapsulated as separate command classes.
   - **Key Classes:**
     - `Command.java`: Interface for executing commands.
     - `Light.java`: Receiver class representing a light.
     - `LightOnCommand` and `LightOffCommand`: Concrete command classes for turning the light on and off, respectively.
   - **Advantages:** This pattern promotes loose coupling between the invoker (client) and the receiver (Light), making it easier to extend the command functionality.

### 2. **Observer Pattern**
   - **Purpose:** Defines a one-to-many dependency between objects, where changes in the state of one object (subject) notify all dependent objects (observers).
   - **Use Case:** Temperature monitoring system where multiple observers (subscribers) receive updates when the temperature changes.
   - **Key Classes:**
     - `Observer.java`: Interface for updating observers.
     - `Subject.java`: The subject maintains a list of observers and notifies them when the state changes.
     - `ConcreteObserver`: Implementation of an observer that reacts to temperature updates.
   - **Advantages:** This pattern supports loosely coupled systems where changes to a subject automatically propagate to multiple objects, enhancing modularity.

## **Creational Design Patterns**

### 3. **Factory Pattern**
   - **Purpose:** Provides a way to create objects without exposing the instantiation logic to the client and refers to the newly created object via a common interface.
   - **Use Case:** Creating different shapes (`Circle`, `Rectangle`) using a `ShapeFactory`.
   - **Key Classes:**
     - `Shape.java`: Interface for different shapes.
     - `Circle.java` and `Rectangle.java`: Concrete implementations of shapes.
     - `ShapeFactory.java`: Factory class responsible for creating shape objects based on the input type.
   - **Advantages:** This pattern provides a flexible way to create objects and promotes code extensibility by adhering to the Open/Closed principle.

### 4. **Singleton Pattern**
   - **Purpose:** Ensures that a class has only one instance and provides a global point of access to it.
   - **Use Case:** A singleton class that manages a unique resource, ensuring a single instance across the application.
   - **Key Classes:**
     - `Singleton.java`: The class that ensures a single instance is created and shared across the application.
   - **Advantages:** The Singleton pattern controls access to a resource and ensures that there is only one instance of the class, reducing memory usage and avoiding inconsistent states.

## **Structural Design Patterns**

### 5. **Adapter Pattern**
   - **Purpose:** Converts the interface of a class into another interface that clients expect, allowing classes with incompatible interfaces to work together.
   - **Use Case:** A media player that can play different file formats (MP3, MP4), using an adapter to handle incompatible media types.
   - **Key Classes:**
     - `MediaPlayer.java`: The interface for basic media players.
     - `Mp3Player.java` and `Mp4Player.java`: Concrete implementations for playing MP3 and MP4 files, respectively.
   - **Advantages:** This pattern enables compatibility between different interfaces, promoting code reusability and flexibility.

### 6. **Decorator Pattern**
   - **Purpose:** Adds behavior or responsibilities to objects dynamically without altering their structure.
   - **Use Case:** Adding a red border to shapes like `Circle` and `Rectangle` at runtime.
   - **Key Classes:**
     - `ShapeDecorator.java`: Base decorator class that adds new functionality to shapes.
     - `RedShapeDecorator.java`: Concrete decorator class that adds a red border to shapes.
   - **Advantages:** This pattern provides a flexible alternative to subclassing for extending functionality. It allows behaviors to be added dynamically to individual objects without modifying other instances of the class.

## **Best Practices Implemented**

1. **Code Structure and Organization:**
   - Each design pattern is isolated into its own directory, with classes organized into separate files to maintain high cohesion and low coupling.
   - Proper naming conventions and directory structure have been adhered to for readability and maintainability.

2. **Logging and Exception Handling:**
   - Comprehensive logging is implemented in key parts of the code to track operations and assist in debugging.
   - Exception handling is included to gracefully handle unexpected scenarios, ensuring robustness.

3. **Defensive Programming:**
   - Input validation is applied where necessary to prevent invalid states or operations, ensuring that the program behaves predictably.

4. **Transient Error Handling:**
   - While this project does not involve external APIs or networked resources, the design leaves room for transient error handling if extended to such scenarios.

## **How to Run the Code**

1. Clone the repository:
   ```
   git clone <repo-link>
   cd design_patterns
   ```

2. Compile the classes:
   - Ensure you have a Java Development Kit (JDK) installed.
   - Navigate to each pattern's directory and compile the classes:
     ```bash
     javac *.java
     ```

3. Run the demos:
   - For each design pattern, you can run the corresponding demo file:
     ```bash
     java CommandPatternDemo
     java ObserverPatternDemo
     java FactoryPatternDemo
     java SingletonPatternDemo
     java AdapterPatternDemo
     java DecoratorPatternDemo
     ```

