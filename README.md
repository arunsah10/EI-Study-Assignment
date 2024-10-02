
# **EI Study Assignment**

# **Exercise 1: Problem Statement on Design patterns**

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

---

# **Exercise 2: Problem Statements for Mini-projects: Question No. 8**

This is a terminal-based application that allows users to manage virtual classrooms. The program enables adding and removing classrooms, enrolling students, scheduling assignments, and submitting assignments. It serves as a backend solution for an EdTech platform, showcasing efficient classroom management within a command-line interface.


## **Project Overview**

The **Virtual Classroom Manager** simulates a real-world scenario of managing virtual classrooms, students, and assignments. The program is designed to operate within a terminal, where users can:
- Add new classrooms.
- Enroll students into specific classrooms.
- Schedule assignments for classrooms.
- Submit assignments for enrolled students.

This exercise helps in understanding the management of relationships between entities such as students, classrooms, and assignments, as well as handling various operations in a modular and maintainable way.

---

## **Features**

- **Classroom Management**:
  - Add new classrooms.
  - List all existing classrooms.
  - Remove classrooms.
  
- **Student Management**:
  - Enroll students in classrooms.
  - List students in each classroom.
  
- **Assignment Management**:
  - Schedule new assignments for classrooms.
  - Submit assignments on behalf of students.
  
- **Logging**:
  - Log important events such as starting and stopping the program.

- **Error Handling**:
  - Handle errors like duplicate classroom names or adding a student to a non-existent classroom gracefully.

---

## **Code Structure**

The project follows a structured and modular codebase, adhering to the SOLID principles for clean and maintainable code. Below is an overview of the code structure:

```
virtual_classroom_manager/
│
├── model/
│   ├── Classroom.java        # Represents a classroom with students and assignments
│   ├── Student.java          # Represents a student entity
│   ├── Assignment.java       # Represents an assignment entity
│
├── service/
│   ├── ClassroomService.java # Handles classroom-related operations
│   ├── StudentService.java   # Handles student enrollment and listing
│   ├── AssignmentService.java# Manages scheduling and submission of assignments
│
├── util/
│   ├── Logger.java           # Logs key events in the application
│
└── VirtualClassroomManager.java # Main class that handles user input and system interaction
```

---

## **Design Principles**

This project adheres to several key software engineering principles, ensuring high-quality and maintainable code:

- **Single Responsibility Principle (SRP)**: Each class has a single responsibility, making the code easy to understand and maintain.
  
- **Modularity**: Different services handle distinct concerns, ensuring that future changes (such as adding new features) can be implemented with minimal impact on existing code.

- **Best Practices**: The program includes logging, validation of inputs, and proper error messages to ensure smooth operation and troubleshooting.

- **Loose Coupling**: The services (`ClassroomService`, `StudentService`, `AssignmentService`) are loosely coupled with the main class (`VirtualClassroomManager.java`), allowing the program to be extended easily.

---

## **Requirements**

To run this project, you will need:
- Java 8 or higher installed on your machine.
  
---

## **Installation**

Follow these steps to get the Virtual Classroom Manager running on your local machine:

1. **Clone the repository**:
   ```bash
   git clone <repository-link>
   cd virtual_classroom_manager
   ```

2. **Compile the Java program**:
   ```bash
   javac VirtualClassroomManager.java
   ```

3. **Run the program**:
   ```bash
   java VirtualClassroomManager
   ```

---

## **How to Use**

Once the program is running, you can interact with the virtual classroom system by typing specific commands into the terminal. Below are the available commands:

1. **Add Classroom**: Add a new classroom to the system.
   ```bash
   add_classroom <class_name>
   ```

   **Example**:
   ```bash
   add_classroom Math101
   ```

   _Output_: `Classroom Math101 has been created.`

2. **Add Student**: Enroll a student in a specific classroom.
   ```bash
   add_student <student_id> <class_name>
   ```

   **Example**:
   ```bash
   add_student S12345 Math101
   ```

   _Output_: `Student S12345 has been enrolled in Math101.`

3. **Schedule Assignment**: Add an assignment for a classroom.
   ```bash
   schedule_assignment <class_name> <assignment_details>
   ```

   **Example**:
   ```bash
   schedule_assignment Math101 Homework1
   ```

   _Output_: `Assignment for Math101 has been scheduled.`

4. **Submit Assignment**: Submit an assignment on behalf of a student.
   ```bash
   submit_assignment <student_id> <class_name> <assignment_details>
   ```

   **Example**:
   ```bash
   submit_assignment S12345 Math101 Homework1
   ```

   _Output_: `Assignment submitted by Student S12345 in Math101.`

5. **List Classrooms**: List all available classrooms.
   ```bash
   list_classrooms
   ```

6. **List Students in a Classroom**: List all students enrolled in a specific classroom.
   ```bash
   list_students <class_name>
   ```

7. **Remove Classroom**: Remove a classroom from the system.
   ```bash
   remove_classroom <class_name>
   ```

8. **Exit the Program**: Exit the application.
   ```bash
   exit
   ```

---



**Author**:  
Arun Kumar Sah  
**Contact**: [arunsah98078@gmail.com/6204052243]


