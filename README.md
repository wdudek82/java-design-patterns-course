# Udemy - Java Design Patterns Course, Jason Fedin

## Principles - SOLID

1. Single Responsibility Principle
2. Open/Closed Principle (open for extension, closed for modification),
3. Liskov Substitution Principle,
4. Interface Segregation Principle,
5. Dependency Inversion/Injection Principle

## Design Patterns (examples & exercises)

### Creational Patterns

- [x] Factory
    - [x] Abstract Creator
    - [x] Concrete Creator
    - [x] Static Creator
- [x] Abstract Factory
- [x] Singleton
- [x] Builder
- [x] Prototype

### Structural Patterns

- [ ] Adapter
- [ ] Bridge
- [ ] Composite
- [ ] Decorator
- [ ] Facade
- [ ] Flyweight
- [ ] Proxy

### Behavioral Patterns

* these design patterns are specifically concerned with communication between objects
    * characterize complex control flow that is difficult to follow at run-time
    * shift the focus away from flow of control to let you concentrate just on the way objects are interconnected
    
* there patterns increase flexibility in carrying out this communication

* provide solutions on how to segregate objects to be both dependent and independent

* concerned with algorithms and the assignment of responsibilities between objects

* **behavioral class patterns** use inheritance to describe algorithms and flow of control
    * the template method is an abstract definition of an algorithms
        * defines an algorithm step by step
        * a subclass fleshes out the algorithms by defining the abstract operations

* **behavioral object patterns** describe how a group of objects cooperate to perform a task that no single object can carry out alone
    * uses object composition rather than inheritance
    * the mediator pattern uses a mediator object for peer object communication
        * mediator provides the indirection needed for loose coupling

- [ ] Chain of Responsibility
- [ ] Command
- [ ] Interpreter
- [ ] Iterator
- [ ] Mediator
- [ ] Memento
- [ ] Observer
- [ ] State
- [x] Strategy
- [ ] Template Method
- [ ] Visitor
