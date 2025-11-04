# Architect Like a Pro

## Introduction to the design Patterns

### Design patterns are typical  solutions to common problems in Software Design. Each patterns are like a blue print/ template that can customized to solve particular software design.

## 01.Singleton Pattern

What is does ?

- Ensure a class has only one instance, and provide a global point of access to it.

When it should be used ?

- When you need exactly one instance of a class that is shared globally.

## 02.Factory Pattern

What is does ?

- Defines an interface for creating objects, but lets subclasses or factories decide which class to instantiate.

When it should be used ? 

- When object creation logic is complex or depends on input conditions.

## 03.Builder Pattern

What it does?

- Separates the construction of a complex object from its representation.
- Let you create different representations using the same construction process.
- Supports step-by-step object creation and method chaining.

When it should be used?

- When an object has many optional parameters or requires multiple steps to construct.
- When you want readable and maintainable code for creating complex objects.

## 04.Prototype Pattern

What it does?

- Allows creating new objects by cloning an existing object instead of instantiating from scratch.
- Useful when object creation is costly or complex.

When it should be used?

- When object creation is expensive or complex.
- When you need many similar objects with small differences.

## 05.Abstract Factory Pattern

what it does ?

- Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- Ensures that objects created by one factory are compatible and consistent in style or theme.

When it should be used?

- When a system needs to create multiple related objects that must be used together.
- When you want to switch between product families easily without changing client code.
- When enforcing consistency among products is important.

## Bonus Challenge - Lazy Initialization

What it does ?

- It will only create a singleton instance untill it is actually needed

when it should be used?

- useful when the Singleton object is resource-intensive or when its creation involves complex initialization logic.


