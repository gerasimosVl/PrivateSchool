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

public class StudentsPerCourse {

    private Course course;
    private List<Student> studentsPerCourseList;

    public StudentsPerCourse(Course course) {
        this.course = course;
        studentsPerCourseList = new ArrayList<Student>();

    }

    public List<Student> getStudentsPerCourseList() {
        return studentsPerCourseList;
    }

    public void addStudent(Student student) {
        this.studentsPerCourseList.add(student);
    }
    
    @Override
    public String toString() {
        return course.getTitle() + " Students " + studentsPerCourseList ;
    }

}