## Notes on Polymorphism in Java

### Introduction to Polymorphism
Polymorphism is one of the core concepts of object-oriented programming (OOP) in Java. It allows objects to be treated as instances of their parent class rather than their actual class. The word "polymorphism" is derived from the Greek words "poly" (meaning many) and "morph" (meaning form), signifying the ability to take many forms.

In Java, polymorphism is primarily achieved through method overriding and method overloading. It allows for flexibility and the ability to extend functionality by enabling objects to be manipulated regardless of their specific class types.

### Types of Polymorphism

1. **Compile-time Polymorphism (Static Polymorphism)**
   - Achieved by method overloading and operator overloading.
   - The method to be called is resolved at compile time.
   - Examples include method overloading and constructor overloading.
   - **Method Overloading:** Multiple methods with the same name but different parameters.
   - **Constructor Overloading:** Multiple constructors with different parameter lists in a class.

   **Example of Method Overloading:**
   ```java
   class MathOperations {
       int add(int a, int b) {
           return a + b;
       }

       double add(double a, double b) {
           return a + b;
       }
   }
   ```

2. **Runtime Polymorphism (Dynamic Polymorphism)**
   - Achieved by method overriding.
   - The method to be called is resolved at runtime.
   - It allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
   - **Method Overriding:** A subclass provides a specific implementation of a method that is already defined in its parent class.

   **Example of Method Overriding:**
   ```java
   class Animal {
       void sound() {
           System.out.println("Animal makes a sound");
       }
   }

   class Dog extends Animal {
       @Override
       void sound() {
           System.out.println("Dog barks");
       }
   }

   public class TestPolymorphism {
       public static void main(String[] args) {
           Animal a = new Dog();
           a.sound(); // Outputs: Dog barks
       }
   }
   ```

### Advantages of Polymorphism
- **Flexibility:** Allows the use of a single interface to represent different underlying forms (data types).
- **Maintainability:** Easier to maintain and modify the code.
- **Extensibility:** New functionality can be easily added with minimal changes to the existing codebase.
- **Reusability:** Promotes the reuse of code by implementing methods defined in the parent class.

### Diagrams

#### Method Overloading (Compile-time Polymorphism)

```
              +-------------------+
              | MathOperations    |
              +-------------------+
              | - add(int, int)   |
              | - add(double, double) |
              +-------------------+
```

#### Method Overriding (Runtime Polymorphism)

```
          +-------------------+                   +-------------------+
          |      Animal       |                   |        Dog        |
          +-------------------+                   +-------------------+
          | - sound()         |<-- overridden --  | - sound()         |
          +-------------------+                   +-------------------+
```

### Detailed Examples

#### Compile-time Polymorphism
```java
class DisplayOverloading {
    public void display(int a) {
        System.out.println("Arguments: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public void display(String a) {
        System.out.println("Arguments: " + a);
    }

    public static void main(String[] args) {
        DisplayOverloading obj = new DisplayOverloading();
        obj.display(1);
        obj.display(1, 2);
        obj.display("Hello");
    }
}
```

#### Runtime Polymorphism
```java
class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("Splendor is running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splendor(); // upcasting
        b.run();
    }
}
```

In the example above:
- `Bike` is the parent class.
- `Splendor` is the child class that overrides the `run()` method.
- At runtime, the JVM determines which `run()` method to call, based on the object `b` is referring to, which is an instance of `Splendor`.

### Conclusion
Polymorphism in Java is a powerful concept that enhances the flexibility and scalability of code. By understanding and implementing both compile-time and runtime polymorphism, developers can write more efficient, maintainable, and reusable code.