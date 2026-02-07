package school.management;

public class Teacher {
    private String name;
    private int age;
    private String TeacherId;
    private double salary;

    public Teacher(String name, int age, String TeacherId, double salary) {
        setName(name);
        setAge(age);
        setTeacherId(TeacherId);
        setSalary(salary);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 25) {
            throw new IllegalArgumentException("Must be above 25");
        }
        this.age = age;
    }

    public void setTeacherId(String TeacherId) {
        if (TeacherId == null || TeacherId.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot be null or empty");
        }
        this.TeacherId = TeacherId;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Must be greater than 0");
        }
    } 

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeacherId() {
        return TeacherId;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

}