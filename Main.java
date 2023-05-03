import java.util.*;

class Student {
    String name;
    int rollNumber;
    boolean[] attendance;
    int totalClasses;

    Student(String name, int rollNumber, int totalClasses) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalClasses = totalClasses;
        this.attendance = new boolean[totalClasses];
        Arrays.fill(this.attendance, false);
    }

    void markAttendance(int classNumber) {
        if (classNumber < 1 || classNumber > totalClasses) {
            System.out.println("Invalid class number. Please enter a number between 1 and " + totalClasses);
            return;
        }
        attendance[classNumber-1] = true;
        System.out.println("Attendance marked for " + name + " in class " + classNumber);
    }

    float getAttendancePercentage() {
        int attendedClasses = 0;
        for (boolean present : attendance) {
            if (present) {
                attendedClasses++;
            }
        }
        return (float)attendedClasses/totalClasses*100;
    }

    void displayAttendanceReport() {
        System.out.println("Attendance report for " + name + ":");
        for (int i = 0; i < totalClasses; i++) {
            System.out.println("Class " + (i+1) + ": " + (attendance[i] ? "Present" : "Absent"));
        }
        System.out.println("Attendance percentage: " + getAttendancePercentage() + "%");
    }
}

class AttendanceManagementSystem {
    ArrayList<Student> studentList;
    int totalClasses;

    AttendanceManagementSystem(int totalClasses) {
        studentList = new ArrayList<>();
        this.totalClasses = totalClasses;
    }

    void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();
        Student newStudent = new Student(name, rollNumber, totalClasses);
        studentList.add(newStudent);
        System.out.println("New student added.");
    }

    void markAttendance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class number:");
        int classNumber = sc.nextInt();
        for (Student student : studentList) {
            student.markAttendance(classNumber);
        }
    }

    void displayAttendanceReport() {
        for (Student student : studentList) {
            student.displayAttendanceReport();
        }
    }

    void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name or roll number:");
        String query = sc.nextLine();
        for (Student student : studentList) {
            if (student.name.equalsIgnoreCase(query) || student.rollNumber == Integer.parseInt(query)) {
                student.displayAttendanceReport();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of classes:");
        int totalClasses = sc.nextInt();
        AttendanceManagementSystem ams = new AttendanceManagementSystem(totalClasses);

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Mark attendance");
            System.out.println("3. Display attendance report");
            System.out.println("4. Search for a student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                ams.addStudent();
                break;
                case 2:
                ams.markAttendance();
                break;
                case 3:
                ams.displayAttendanceReport();
                break;
                case 4:
                ams.searchStudent();
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
                }
                }
                }

