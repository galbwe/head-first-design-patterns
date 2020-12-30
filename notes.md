# Head First Design Patterns

## Ch1: Introduction

- The most important factor to account for in sotware engineering is change.
    - The client or stakeholders can decide they want the software to be different or that a new feature is required at any time.
    - Enterprise tools and libraries that you rely on might change.

- Most design patterns are based off of a common principle:
    - Encapsulate the part of a program that is going to change.
    - Ex: Strategy pattern: encapsulates behavior into a class and uses composition so that other classes have that behavior.

- Program to an abstraction: declare the most common base type so that different subclasses can be easily exchanged.


## Ch2: Observer Pattern

- loose coupling: practice of avoiding interdependencies between classes. In other words, classes should only need to know about the interfaces of the classes they interact with, but not the data or method implementations of other classes.

- analogy to understand observer pattern:
    - subject: a newspaper company
    - observers: subscribers to the newspaper company

- Observer pattern uses 2 interfaces:
    1. subject
        - has a method to register an observer
        - has a second method to unsubscribe an observer
        - has a third method to notify all observers of state changes
    1. observer
        - has a method that to update itself based on data obtained from the subject
        - on changes, observers may do something else with the new data

- The order in which the observers are updated and execute their side effects is not necessarily fixed.

## Ch3: Decorator Pattern

- open closed principle: classes should be open to extension but closed to modification
    - means that new behavior should be added by writing new code, instead of changing existing code. This will help prevent unintended bugs.

- Decorator pattern:
    1. Create a decorator class that
        1. subclasses the decorated class
        1. Has a decorated object that is the same type as the decorated class
        1. Implement the same interface as the decorated class in the decorator, using the decorated objects interface where necessary.

- be careful when adding decorator pattern to code that may depend on types of objects
    - Factory and builder patterns may help with this issue


## Ch4: Factory Pattern

- Continuing mantra: program to an interface, not an implementation
- In java, whenever you use the `new` keyword, you are programming to an implementation.
- The idea behind the factory pattern is that the implementation has to go somewhere, so it should be encapsulated so that if the concrete types change, the code only needs to change in one place.
- Often implement the factory pattern with a factory method: this is an abstract method on a class responsible for instantiating objects which is defined in a base class.
- Definition: the factory method pattern defines an interface for creating an object, but lets a subclass decide which class of object to instantiate.
- Dependency Inversion Principle: make classes that depend on abstractions, do not write classes that depend on concrete classes.
- Rules of Thumb that help a young programmer adhere to the dependency inversion principle:
    - No variable should directly reference a concrete class. Instead use a factory method.
    - Avoid subclassing a concrete class. Only subclass from an abstraction.
    - Avoid overriding a method that has an implementation. Instead override abstract methods.
- Difference between factory method pattern and abstract factory pattern:
    - The factory method pattern uses inheritance to give a class a method for constructing objects, whereas an abstract factory pattern uses object composition to provide a class with a factory object whose interface defines methods for constructing objects.