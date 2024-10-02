import model.Classroom;
import service.AssignmentService;
import service.ClassroomService;
import service.StudentService;
import util.Logger;

import java.util.Scanner;

public class VirtualClassroomManager {

    private static ClassroomService classroomService = new ClassroomService();
    private static StudentService studentService = new StudentService();
    private static AssignmentService assignmentService = new AssignmentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger.log("Virtual Classroom Manager started.");
        boolean running = true;
        while (running) {
            System.out.println("Please enter a command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "add_classroom":
                    if (parts.length == 2) {
                        classroomService.addClassroom(parts[1]);
                    } else {
                        System.out.println("Invalid input. Usage: add_classroom <class_name>");
                    }
                    break;
                case "add_student":
                    if (parts.length == 3) {
                        Classroom classroom = classroomService.getClassroom(parts[2]);
                        if (classroom != null) {
                            studentService.addStudentToClassroom(parts[1], classroom);
                        } else {
                            System.out.println("Classroom " + parts[2] + " does not exist.");
                        }
                    } else {
                        System.out.println("Invalid input. Usage: add_student <student_id> <class_name>");
                    }
                    break;
                case "schedule_assignment":
                    if (parts.length == 3) {
                        Classroom classroom = classroomService.getClassroom(parts[1]);
                        if (classroom != null) {
                            assignmentService.scheduleAssignment(parts[1], classroom, parts[2]);
                        } else {
                            System.out.println("Classroom " + parts[1] + " does not exist.");
                        }
                    } else {
                        System.out.println("Invalid input. Usage: schedule_assignment <class_name> <assignment_details>");
                    }
                    break;
                case "submit_assignment":
                    if (parts.length == 4) {
                        Classroom classroom = classroomService.getClassroom(parts[2]);
                        if (classroom != null) {
                            assignmentService.submitAssignment(parts[1], parts[2], classroom, parts[3]);
                        } else {
                            System.out.println("Classroom " + parts[2] + " does not exist.");
                        }
                    } else {
                        System.out.println("Invalid input. Usage: submit_assignment <student_id> <class_name> <assignment_details>");
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        Logger.log("Virtual Classroom Manager stopped.");
    }
}
