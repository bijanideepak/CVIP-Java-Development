import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

class FeeStructure {
    private String courseId;
    private double tuitionFee;

    public FeeStructure(String courseId, double tuitionFee) {
        this.courseId = courseId;
        this.tuitionFee = tuitionFee;
    }

    public String getCourseId() {
        return courseId;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }
}

class FeesManagementSystem {
    private List<Student> students;
    private List<FeeStructure> feeStructures;

    public FeesManagementSystem() {
        this.students = new ArrayList<>();
        this.feeStructures = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addFeeStructure(FeeStructure feeStructure) {
        feeStructures.add(feeStructure);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }

    public void displayFeeStructures() {
        for (FeeStructure feeStructure : feeStructures) {
            System.out.println("Course ID: " + feeStructure.getCourseId() + ", Tuition Fee: " + feeStructure.getTuitionFee());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FeesManagementSystem system = new FeesManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Taking user input for students
        System.out.print("Enter student ID: ");
        String studentId = scanner.next();
        System.out.print("Enter student name: ");
        String studentName = scanner.next();

        // Adding the student to the system
        system.addStudent(new Student(studentId, studentName));

        // Taking user input for fee structures
        System.out.print("Enter course ID: ");
        String courseId = scanner.next();
        System.out.print("Enter tuition fee: ");
        double tuitionFee = scanner.nextDouble();

        // Adding the fee structure to the system
        system.addFeeStructure(new FeeStructure(courseId, tuitionFee));

        // Displaying students and fee structures
        System.out.println("\nStudents:");
        system.displayStudents();

        System.out.println("\nFee Structures:");
        system.displayFeeStructures();

        // Close the scanner
        scanner.close();
    }
}
