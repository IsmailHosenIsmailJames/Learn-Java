package Job.job_5;

class Student {
    // Instance variables
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class InstanceVeriable {
    public static void main(String[] args) {
        // Create two student objects
        Student student1 = new Student("Alice", 15, 95.5);
        Student student2 = new Student("Bob", 16, 88.0);

        // Print the information of each student
        student1.printInfo();
        student2.printInfo();
    }
}
