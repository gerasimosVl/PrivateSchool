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


public class Course {

    private String title;
    private String stream;
    private Boolean type;
    private LocalDate startDate;
    private LocalDate endDate;
    public TrainersPerCourse courseTrainers;
    public StudentsPerCourse courseStudents;
    public AssignmentsPerCourse courseAssignments;

    public Course(String title, String stream, Boolean type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        PrivateSchool.courseList.add(this);
        courseTrainers = new TrainersPerCourse(this);
        courseStudents = new StudentsPerCourse(this);
        courseAssignments = new AssignmentsPerCourse(this);
        

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        if (this.type) {
            return "FullTime";
        } else {
            return "PartTime";
        }
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "\nCourse{" + "title=" + title + ", stream=" + stream + ", type=" + getType() + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

}
