## Refactoring Summary

- The `InstrumentPlayer` class contained logic such as conditionals or switches to determine how an instrument should be played.
- Adding a new instrument required modifying the method, violating the **Open/Closed Principle**.
- The class had more than one responsibility: orchestration and behavior definition.


### 1. `Instrument` Abstract Class

A parent abstract class called `Instrument` was created.

**Responsibilities:**
- Represent a generic instrument
- Serve as a base type for all concrete instruments

---

### 2. `Play` Interface

A dedicated interface was introduced to define the playing behavior.

**Responsibility:**
- Declare the `playInstrument()` method

--- 

### 3. Create Children Classes
Implemented Classes: `Drums`, `Guitar` and `Piano` Each class provides its own implementation of the `playInstrument()` method using method overriding. 
**Benefits:**
- Each instrument encapsulates its own behavior
- New instruments can be added without modifying existing classes

---

### 4. `Main` Class 
The `Main` class is now responsible only for application flow. 
**Responsibilities:**
- Create instances of instruments
- Invoke playInstrument() polymorphically
