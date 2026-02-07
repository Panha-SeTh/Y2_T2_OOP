package school.management;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Student s1 = new Student("Panha", 19, "IDTB110001", 3.8);
        Student s2 = new Student("Sokha", 19, "IDTB110002", 3.0);

        Teacher t1 = new Teacher("Mr. Dara", 28, "IDTB001", 2400.0);

        System.out.println("Student 1: " + s1.getName());
        System.out.println("GPA: " + s1.getGpa());
        System.out.println("Honor: " + s1.isHonorStudent());

        System.out.println();

        System.out.println("Student 2: " + s2.getName());
        System.out.println("GPA: " + s2.getGpa());
        System.out.println("Honor: " + s2.isHonorStudent());

        System.out.println();

        System.out.println("Teacher : " + t1.getName());
        System.out.println("Salary : " +t1.getSalary());

        System.out.println();

        s2.setGpa(3.5);
        t1.setSalary(2600.0);

        System.out.println("Updated GPA for " + s2.getName() + ": " + s2.getGpa());
        System.out.println("Updated Annual Salary: " + t1.getAnnualSalary());
    }
}