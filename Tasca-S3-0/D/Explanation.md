## Changes Made

### 1. Introduced `Save` Interface

- Create a `Save` interface to define a contract for saving a `Person`.
- Implements in `MySQL`

---

### 2. Applied Dependency Inversion in PersonService

The direct instantiation of `MySQL` was removed from `PersonService`.

**Before:**

- `PersonService` created a new instance of `MySQL`  
- Strong coupling between service and database

**After:**

- `PersonService` depends on the `Save` interface  
- The dependency is injected from outside (constructor injection)
