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


public class TrainersPerCourse {
    private Course course;
    private List<Trainer> trainersPerCourseList;

    public TrainersPerCourse(Course course) {
        this.course = course;
        trainersPerCourseList = new ArrayList<Trainer>();
        
    }

    
    public List<Trainer> getTrainersPerCourseList() {
        return trainersPerCourseList;
    }

    public void addTrainer(Trainer trainer) {
        this.trainersPerCourseList.add(trainer);
    }

    @Override
    public String toString() {
        return course.getTitle() + " Trainers " + trainersPerCourseList ;
    } 
    
}
