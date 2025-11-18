# Coffee Machine - State Pattern Example

## Overview
This project demonstrates the **State Design Pattern** using a simple **Coffee Machine** simulation in Java.  
The machine's behaviour changes depending on its internal state, avoiding complex conditional logic such as multiple `if/else` or `switch` statements.

The coffee Machines changes its states according to the state diagram.

![height:70px](images/umlstateDiagram.jpg)
---

## States Overview

### 1. `NoCoinState`
Represents the machine waiting for a coin.  
- Accepts insertion of a coin  
- Rejects brewing or dispensing commands until payment is made

### 2. `HasCoinState`
Represents that a coin has been inserted and the machine is ready to brew.  
- Does not accept additional coins  
- Allows brewing initiation  
- Does not allow direct dispensing without brewing

### 3. `BrewingState`
Represents the machine currently preparing the coffee.  
- Does not accept new coins
- Does not allow button presses
- Dispenses coffee once brewing is finished

---

## Pattern Summary

The **State Pattern** allows an object to alter its behaviour when its internal state changes.  
It provides a clean and scalable alternative to replacing long conditional logic by delegating behaviour to state-specific classes.

**Key benefits:**
- Improved readability and maintainability  
- Easier extension of new states  
- Eliminates tight coupling of behaviours inside a single class  

---

## File Structure
```
CoffeeMachineState.java   -> Interface defining behaviour
NoCoinState.java          -> Concrete state (no money inserted)
HasCoinState.java         -> Concrete state (ready to brew)
BrewingState.java         -> Concrete state (coffee in preparation)
CoffeeMachine.java        -> Context holding reference to current state
Main.java                 -> Simple execution test

```
It has the following class Diagram

![height:70px](images/umlClassDiagram.jpg)
---


