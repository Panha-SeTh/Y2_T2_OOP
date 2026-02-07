[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/1P-oB5cl)
# Java Homework – Week 3

## Library Borrowing System (Mini Project)

---

## **Overview**

This homework focuses on **object-oriented programming fundamentals** using Java.
You will implement a **Library Borrowing System** that models how books are borrowed and returned.

This is **not** a large system. The goal is to **think correctly in OOP**, not to write many classes.

---

## Learning Objectives

By completing this homework, you should be able to:

* Apply **encapsulation** using private fields, setters, and validation logic
* Clearly distinguish **primitive types** and **reference types**
* Correctly use **static vs non-static members**
* Design **small, testable classes** that interact correctly

---

## Concepts Covered

| Concept          | Where it appears                 |
| ---------------- | -------------------------------- |
| Encapsulation    | `Book`, `BorrowRecord`           |
| Primitive types  | `boolean`, `int`                 |
| Reference types  | `Book` inside `BorrowRecord`     |
| Static fields    | `totalBorrowed`                  |
| Instance methods | `returnBook()`, `markBorrowed()` |

---

## Your Tasks

### Complete `Book.java`

You must:

* Keep all fields `private`
* Validate `title` and `author`
* Control availability using methods (not direct access)

Rules:

* `title` and `author` must not be `null` or empty
* A book is **available by default**

---

### 2️⃣ Complete `BorrowRecord.java`

You must:

* Validate reference types correctly
* Prevent borrowing an unavailable book
* Track total borrowed books using a `static` field

Rules:

* `book` must not be `null`
* Book must be available before borrowing
* `days` must be greater than `0`
* Returning a book must update its availability

---

### Use `Main.java` for Testing

You must test:

* Valid borrowing
* Invalid inputs (exceptions)
* Static counter behavior
* Book availability changes

Pre-check was written there, but you can modified to be anything else.

---

## Required Test Scenarios

You must manually test **all** of the following:

| Scenario                | Expected Result          |
| ----------------------- | ------------------------ |
| Empty book title        | Exception                |
| Null book               | Exception                |
| Borrow unavailable book | Exception                |
| Days ≤ 0                | Exception                |
| Return book             | Book becomes available   |
| Multiple borrow records | Static counter increases |

---

## Design Hint (Read Carefully)

Ask yourself:

* Does this data belong to **one object** or **all objects**?
* Who should be allowed to change a book’s availability?
* Why is `totalBorrowed` static?

You may be asked these questions during review.

---

## Questions?

If something feels confusing — **that’s intentional**.
Think carefully, test your code, and reason about object behavior.

Good luck!
This homework is about **thinking like a Java developer**, not just writing code.

## Happy Coding!