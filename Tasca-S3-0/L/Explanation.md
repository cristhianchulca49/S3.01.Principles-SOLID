
## Applied Changes

### 1. Introduced Composition for Damage Handling

- Created a `Damage` abstraction to represent how damage is handled
- Implemented different behaviors:
  - `ReceivesDamage`
  - `NoDamage`

This moves the variability out of inheritance and into composition.

---

### 2. Refactored `Character` to Delegate Damage

- `Character` now contains a `Damage` dependency
- The `takeDamage()` method delegates to the injected behavior
- All characters can receive a damage event, but react differently

This keeps the contract consistent and honest.

---

### 3. Applied Dependency Inversion Principle (DIP)

- Characters no longer instantiate concrete damage implementations
- `Damage` is injected via constructor
- High-level classes depend only on abstractions

This removes tight coupling and improves testability.

---

### 4. Simplified Subclasses

- `Warrior` and `Ghost` no longer override `takeDamage()`
- Subclasses only configure which `Damage` behavior they use
- No invalid overrides or runtime exceptions

Inheritance now defines **what the character is**, not **how it behaves**.

---
