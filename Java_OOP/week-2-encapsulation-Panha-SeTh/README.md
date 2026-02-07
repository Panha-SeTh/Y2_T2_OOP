[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/9AFwzysD)
# School Management Mini-System (Encapsulation & Class Usage)

## Learning Objectives
- Identify classes from a real-world scenario
- Design encapsulated classes
- Use constructors, getters, setters
- Implement rules and behavior inside classes
- Use objects correctly in a `main` program


## Scenario
A school wants a simple system to manage students and teachers.

Each person in the school has:
- `a name`
- `an age`

Students and teachers share some common data, but they also have their own responsibilities.


## Part 1: Student Class

**Class name**:
```
Student
```

**Fields (must be in `private`)**:
| **Field**   | **Type**   |  **Description** |
| --------- | ------ | ----------------------- |
| name      | `String` | Student’s full name     |
| age       | `int`    | Student’s age           |
| studentId | `String` | Unique student ID       |
| gpa       | `double` | Student GPA (0.0 – 4.0) |


**Costructor**:
```java
public Student(String name, int age, String studentId, double gpa)
```
- Must use setter methods
- Must validate all data

**Validation Rules**:

| **Field** | **Rule**                    |
| --------- | --------------------------- |
| name      | Cannot be null or empty     |
| age       | Must be ≥ 18                |
| studentId | Cannot be empty             |
| gpa       | Must be between 0.0 and 4.0 |


`Throw IllegalArgumentException if invalid`

**Required Methods**:
```java
public String getName()
public int getAge()
public String getStudentId()
public double getGpa()
```

```java
public boolean isHonorStudent()
```
- Returns `true` if `GPA ≥ 3.5`


## Part 2: Teacher Class
**Class Name**:
```
Teacher
```
**Field (must be `private`)**:

| **Field** | **Type**|
| --------- | ------ |
| name      | `String` |
| age       | `int`    |
| teacherId | `String` |
| salary    | `double` |


**Validation Rules**:
| **Field** | **Rule**       |
| --------- | --------------- |
| name      | Cannot be empty |
| age       | Must be ≥ 25    |
| teacherId | Cannot be empty |
| salary    | Must be > 0     |

**Required Methods**:
```java
public double getAnnualSalary()
```
- Returns `salary * 12`

## Part 3: Use the Classes (Main Operation)
In main method:
- Create at least 2 students
- Create 1 teacher
- Print:
    - Student `name`, `GPA`, `honor status`
    - Teacher `name` and `annual salary`
- Update:
    - One student’s GPA
    - Teacher’s salary

- Use setter methods only

**Example Output (Not strict)**
```yaml
Student: Sokha
GPA: 3.8
Honor Student: true

Teacher: Mr. Dara
Annual Salary: 24000
```


# Happy Coding!