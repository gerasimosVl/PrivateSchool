/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

/**
 *
 * @author gerasimos vlachopoulos
 */
import java.util.ArrayList;
import java.util.List;


public class AssignmentsPerCourse {
    private Course course;
    private List<Assignment> assignmentsPerCourseList;

    public AssignmentsPerCourse(Course course) {
        this.course = course;
         assignmentsPerCourseList = new ArrayList<Assignment>();
    }

    public List<Assignment> getAssignmentsPerCourseList() {
        return assignmentsPerCourseList;
    }

    public void addAssignment(Assignment assignment) {
        this.assignmentsPerCourseList.add(assignment);
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + "course=" + course + ", assignmentsPerCourseList=" + assignmentsPerCourseList + '}';
    }
    
    
}