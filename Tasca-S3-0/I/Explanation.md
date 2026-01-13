## Changes Implemented

### Switchable Interface

- Added the `Switchable` interface to represent power control behavior.
- Implemented `Switchable` in:
  - `AirConditioner`
  - `WashingMachine`

This ensures that power-related behavior is expressed through a dedicated abstraction rather than implicit logic.

---

### Wash Interface

- Introduced a new `Wash` interface  and implemented in `WashingMachine` to represent washing behavior. 

By isolating washing functionality, the `WashingMachine` now exposes only the behaviors it actually supports.

---

### Temperature Control Interface

- Added the `TemperatureControl` interface to represent heating and cooling behavior and implemented in `AirConditioner`

---

### Removed Redundant Interfaces
- remove unnecessary interfaces in `WashingMachine` and `AirConditioner`
