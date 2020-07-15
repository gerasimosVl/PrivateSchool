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

public class CoursesPerStudent {

    private Student student;
    private List<Course> coursesPerStudentList;

    public CoursesPerStudent(Student student) {
        this.student = student;
        coursesPerStudentList = new ArrayList<Course>();
    }

    public void addCourse(Course courses) {
        this.coursesPerStudentList.add(courses);
    }

    public List<Course> getCoursesPerStudentList() {
        return coursesPerStudentList;
    }

  

    
}
