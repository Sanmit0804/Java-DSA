# Inheritance

### Inheritance in Java

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class to inherit properties and behaviors (fields and methods) from another class. It promotes code reuse and establishes a natural hierarchical relationship between classes.

### Key Concepts of Inheritance

1. **Superclass (Parent Class) and Subclass (Child Class):**
    - **Superclass:** The class whose properties and methods are inherited.
    - **Subclass:** The class that inherits from the superclass. It can have additional properties and methods or override the inherited ones.
2. **`extends` Keyword:**
    - In Java, inheritance is implemented using the `extends` keyword. A subclass uses `extends` followed by the superclass name.
3. **Single Inheritance:**
    - Java supports single inheritance, meaning a class can inherit from only one superclass directly.
4. **`super` Keyword:**
    - The `super` keyword refers to the superclass and can be used to access superclass methods and constructors.

### Types of Inheritance in Java

1. **Single Inheritance:**
    - A class inherits from one superclass.
    
    ```java
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }
    
    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
    
    ```
    
2. **Multilevel Inheritance:**
    - A class is derived from another derived class.
    
    ```java
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }
    
    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
    
    class Labrador extends Dog {
        void display() {
            System.out.println("This is a Labrador.");
        }
    }
    
    ```
    
3. **Hierarchical Inheritance:**
    - Multiple classes inherit from a single superclass.
    
    ```java
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }
    
    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
    
    class Cat extends Animal {
        void meow() {
            System.out.println("The cat meows.");
        }
    }
    
    ```
    
4. **Hybrid Inheritance (Through Interfaces):**
    - Java does not support multiple inheritance directly to avoid ambiguity. However, hybrid inheritance can be achieved through interfaces.
    
    ```java
    interface Animal {
        void eat();
    }
    
    interface Pet {
        void play();
    }
    
    class Dog implements Animal, Pet {
        public void eat() {
            System.out.println("This dog eats food.");
        }
    
        public void play() {
            System.out.println("The dog plays.");
        }
    }
    
    ```
    

### Diagram Representation

Here’s a UML diagram representing the types of inheritance in Java:

```
Single Inheritance:
Animal
  |
 Dog

Multilevel Inheritance:
Animal
  |
 Dog
  |
Labrador

Hierarchical Inheritance:
    Animal
   /     \\
 Dog     Cat

Hybrid Inheritance:
   Animal        Pet
      \\          /
       \\        /
        \\      /
         \\    /
          Dog

```

### Detailed Example

Let's illustrate inheritance with a more detailed example:

```java
// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " eats.");
    }

    void sleep() {
        System.out.println(name + " sleeps.");
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the superclass constructor
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " barks.");
    }

    // Overriding the eat method
    @Override
    void eat() {
        System.out.println(name + " eats dog food.");
    }
}

// Another Subclass
class Cat extends Animal {
    boolean isIndoor;

    Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }

    void meow() {
        System.out.println(name + " meows.");
    }

    // Overriding the sleep method
    @Override
    void sleep() {
        System.out.println(name + " sleeps on a cushion.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.eat(); // Buddy eats dog food.
        dog.sleep(); // Buddy sleeps.
        dog.bark(); // Buddy barks.

        Cat cat = new Cat("Whiskers", true);
        cat.eat(); // Whiskers eats.
        cat.sleep(); // Whiskers sleeps on a cushion.
        cat.meow(); // Whiskers meows.
    }
}

```

In this example:

- The `Animal` class is the superclass with common properties and methods.
- The `Dog` class is a subclass of `Animal` and inherits its properties and methods, with additional properties (`breed`) and methods (`bark`). It also overrides the `eat` method.
- The `Cat` class is another subclass of `Animal` with its unique properties (`isIndoor`) and methods (`meow`). It overrides the `sleep` method.

### Benefits of Inheritance

1. **Code Reusability:**
    - Allows reusing common code across multiple classes.
2. **Method Overriding:**
    - Provides the ability to define a method in the subclass with the same name and signature as in the superclass, enabling dynamic method dispatch.
3. **Extensibility:**
    - Makes it easy to extend and enhance existing code without modifying it.

### Conclusion

Inheritance is a powerful feature in Java that enables creating a well-structured and maintainable codebase. It establishes a clear relationship between classes, promotes code reuse, and enhances the overall design of an application. Understanding and effectively using inheritance is crucial for developing robust object-oriented software.