class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1, 85.5);
        Student student2 = new Student("Bob", 2, 92.0);
        Student student3 = new Student("Charlie", 3, 78.3);

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        System.out.println("\nStudent 3 Details:");
        student3.displayDetails();
    }
}
