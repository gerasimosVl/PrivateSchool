/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

/**
 *
 * @author gerasimos vlahopoulos
 */
import java.util.ArrayList;
import java.util.List;

public class PrivateSchool {

    public static List<Course> courseList;
    public static List<Student> studentList;
    public static List<Trainer> trainerList;
    public static List<Assignment> assignmentList;
    
    

    public PrivateSchool() {
        courseList = new ArrayList<Course>();
        studentList = new ArrayList<Student>();
        trainerList = new ArrayList<Trainer>();
        assignmentList = new ArrayList<Assignment>();
        System.out.println("----- Private School App created -----");
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourseToList(Course course) {
        PrivateSchool.courseList.add(course);
    }

    public  List<Student> getStudentList() {
        return studentList;
    }

    public  void addStudentToList(Student student) {
        this.studentList.add(student);
    }

    public  List<Trainer> getTrainerList() {
        return trainerList;
    }

    public  void setTrainerList(Trainer trainer) {
        this.trainerList.add(trainer);
    }

    public  List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public  void setAssignmentList(Assignment assignment) {
        this.assignmentList.add(assignment);
    }

    @Override
    public String toString() {
        return "PrivateSchool{" + "courseList=" + courseList + '}';
    }
    
    

}