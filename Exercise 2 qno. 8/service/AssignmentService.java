package service;

import model.Assignment;
import model.Classroom;
import model.Student;

public class AssignmentService {

    public void scheduleAssignment(String className, Classroom classroom, String assignmentDetails) {
        Assignment assignment = new Assignment(assignmentDetails);
        classroom.addAssignment(assignment);
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, Classroom classroom, String assignmentDetails) {
        for (Assignment assignment : classroom.getAssignments()) {
            if (assignment.getDetails().equals(assignmentDetails) && !assignment.isSubmitted()) {
                assignment.submit();
                System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
                return;
            }
        }
        System.out.println("Assignment not found or already submitted.");
    }
}
