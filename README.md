# Java Design Patterns Course by Jason Fedin

## Principles - SOLID

1. Single Responsibility Principle
2. Open/Closed Principle (open for extension, closed for modification),
3. Liskov Substitution Principle,
4. Interface Segregation Principle,
5. Dependency Inversion/Injection Principle

### Additional reading
[The S.O.L.I.D. Principles in Pictures](https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898)

## GoF Design Patterns (23) - examples & exercises

### Creational Patterns (5)

- [x] Factory
    - [x] Abstract Creator
    - [x] Concrete Creator
    - [x] Static Creator
- [x] Abstract Factory
- [x] Singleton
- [x] Builder
- [x] Prototype

### Structural Patterns (7)

* describes how classes and objects can be combined to form larger structures
    * utilizes inheritance to compose interfaces or implementations
    * structural object patterns describe ways to assemble objects
    * e.g. complex user interfaces and accounting data

* these design patterns concern class and object composition

* **class patterns** describe how relationship between classes are defined
    * use inheritance to compose interfaces or implementations
    * relationships are established at compile time
    * adapter

* **object patterns** describe relationship between objects
    * describe ways to compose objects to realize new functionality
    * use composition
    * relationships are typically created at runtime
        * more dynamic and flexible
    * bridge, composite, decorator, facade, flyweight and proxy patterns

- [x] Adapter
    - [x] Object Adapter
    - [x] Class Adapter
- [x] Bridge
- [x] Composite
- [x] Decorator
- [x] Facade
- [x] Flyweight
- [x] Proxy

### Behavioral Patterns (11)

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

- [x] Chain of Responsibility
- [x] Command
- [x] Interpreter
- [x] Iterator
- [x] Mediator
- [x] Memento
- [x] Observer
- [x] State
- [x] Strategy
- [x] Template Method
- [x] Visitor

### Additional reading
* [Source Making](https://sourcemaking.com/)
* [Refactoring Guru](https://refactoring.guru/)
