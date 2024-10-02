package service;

import model.Classroom;
import model.Student;
import java.util.HashMap;
import java.util.Map;

public class ClassroomService {
    private Map<String, Classroom> classrooms = new HashMap<>();

    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            System.out.println("Classroom " + className + " has been created.");
        } else {
            System.out.println("Classroom " + className + " already exists.");
        }
    }

    public Classroom getClassroom(String className) {
        return classrooms.get(className);
    }

    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            for (String className : classrooms.keySet()) {
                System.out.println("Classroom: " + className);
            }
        }
    }

    public void removeClassroom(String className) {
        if (classrooms.containsKey(className)) {
            classrooms.remove(className);
            System.out.println("Classroom " + className + " has been removed.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }
}
