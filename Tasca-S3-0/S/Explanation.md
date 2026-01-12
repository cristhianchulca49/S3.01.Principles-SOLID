# Refactoring Summary

### 1. Removal of `register()` Logic from `User`
**Before:**
- The `User` class handled registration, validation, and confirmation logic.

**After:**
- `User` is now a **pure domain model**, responsible only for representing user data.

---

### 2. `EmailValidation` Class

A dedicated class was introduced to handle email validation.

**Responsibilities:**
- Receives a `User` instance
- Validates email format and business rules
- Throws validation-related exceptions when rules are violated

---

### 3. `EmailConfirmation` Class

This class encapsulates the email confirmation process.

**Responsibilities:**

- Sends a confirmation message
- Verifies whether the email has been confirmed
- Throws a custom `FailConfirmationException` if confirmation fails
  
---

### 4. `Main` Class

The Main class acts as the composition root, where all components are instantiated and orchestrated.

**Responsibilities:**

- Instantiates `User`, `EmailValidation`, and `EmailConfirmation`
- Coordinates the registration workflow
