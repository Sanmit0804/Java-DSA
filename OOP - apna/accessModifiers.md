# Access Modifiers in Java

> **Access modifiers** are the keywords used to set the visibility of classes, constructors, and variables.

---

## 1. **Public**

- Accessible from **anywhere** in the program, even outside the package.
- Can be applied to **classes**, **methods**, and **variables**.

---

## 2. **Private**

- Accessible only from the **same class** where it is declared.
- Cannot be accessed from outside of the class, even from a **subclass**.
- Can be applied to **methods** and **variables** but **not to classes** (except inner classes).

---

## 3. **Protected**

- Accessible within the **same package** (like default).
- Accessible in subclasses even if they are in different packages.

---

## 4. **Default**

- Accessible only within the **same package**.
- Not accessible outside the package, even if a class is a subclass.
