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
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
       
        PrivateSchool school = new PrivateSchool();
        AppMenu m = new AppMenu();
        m.startMenu();
        
        
    }

    
    // %s format specifiers used in some methods like prinf() to format the String
    public static void setTrainerToCourse(Course course, Trainer trainer) {
        course.courseTrainers.addTrainer(trainer);
        System.out.printf("%s %s was added as a trainer to course: %s %s %s\n",
                trainer.getFirstName(), trainer.getLastName(),
                course.getTitle(), course.getStream(), course.getType());
    }

    public static void setStudentToCourse(Course course, Student student) {
        course.courseStudents.addStudent(student);
        student.enrolledCourses.addCourse(course);
        System.out.printf("%s %s was added as a student to course: %s %s %s\n",
                student.getFirstName(), student.getLastName(),
                course.getTitle(), course.getStream(), course.getType());

    }

    public static void setAssignmentToCourse(Course course, Assignment assignment) {
        course.courseAssignments.addAssignment(assignment);
        System.out.printf("Assignment %s was added to course: %s %s %s\n",
                assignment.getTitle(), course.getTitle(),
                course.getStream(), course.getType());
    }


    public static void printCoursesPerStudent(Student student){
        System.out.printf("\n ----- Printing Courses of %s %s -----\n",
                     student.getFirstName(), student.getLastName());
        for (Course course : student.enrolledCourses.getCoursesPerStudentList()) {
                System.out.println(course);
            }
    }
    

    public static void printAssignmentsPerStudent(Student student) {
            System.out.printf("\n----- Printing Assignments of %s %s -----\n",
                     student.getFirstName(), student.getLastName());
            for (Course course : student.enrolledCourses.getCoursesPerStudentList()) {
                System.out.println(course.courseAssignments.getAssignmentsPerCourseList());
            }
    }
    
    public static void printStudentsInMultipleCourses(){
        for (Student student : PrivateSchool.studentList) {
            if (student.enrolledCourses.getCoursesPerStudentList().size() > 1) {
                System.out.println("----- Students in multiple courses -----");
                System.out.println(student);
                System.out.println("Enrolled in courses: ");
                printCoursesPerStudent(student);
            }
        }
    }
    
    public static void printStudentsPendingSubmissions(List<LocalDate> array){
        
        Set<Student> set = new HashSet();
        List<LocalDate> lista = array;
        System.out.println("List of students that have to submit during the "
                + "week of the requested day: \n");
        for (Student student : PrivateSchool.studentList) {
            for (Course course : student.enrolledCourses.getCoursesPerStudentList()) {
                for (Assignment assignment : course.courseAssignments.getAssignmentsPerCourseList()) {
                    if (assignment.getSubmissionDateTime().isAfter(lista.get(0))
                            && assignment.getSubmissionDateTime().isBefore(lista.get(1))){
                        set.add(student);
                        break;
                    }
                }
            }
        }
        for (Student student : set) {
            System.out.println(student);

        }
        
        
        
    }

}
