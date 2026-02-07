package school.management;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    
    public Student(String name, int age, String studentId, double gpa){
        setName(name);
        setAge(age);
        setStudentId(studentId);
        setGpa(gpa);
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Must be above 18");
        }
        this.age = age;
    }

    public void setStudentId(String studentId){
        if (studentId == null || studentId.trim().isEmpty()){
            throw new IllegalArgumentException("Cannot be null or empty");
        }
        this.studentId = studentId;
    }

    public void setGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA Must be between 0.0 and 4.0");
        }
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getStudentId(){
        return studentId;
    }
    public double getGpa(){
        return gpa;
    }
    public boolean isHonorStudent(){
        return gpa >= 3.5;
    }

}
