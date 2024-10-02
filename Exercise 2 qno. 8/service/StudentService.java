package service;

import model.Classroom;
import model.Student;

public class StudentService {

    public void addStudentToClassroom(String studentId, Classroom classroom) {
        Student student = new Student(studentId);
        classroom.addStudent(student);
        System.out.println("Student " + studentId + " has been enrolled in " + classroom.getClassName() + ".");
    }

    public void listStudents(Classroom classroom) {
        if (classroom.getStudents().isEmpty()) {
            System.out.println("No students enrolled in " + classroom.getClassName() + ".");
        } else {
            for (Student student : classroom.getStudents()) {
                System.out.println("Student ID: " + student.getStudentId());
            }
        }
    }
}
