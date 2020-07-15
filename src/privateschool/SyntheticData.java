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
import java.time.Month;


public class SyntheticData {

    
    
    public void load(){
        
        LocalDate startDate = (LocalDate.of(2020, Month.JANUARY, 07));
        LocalDate endDate = (LocalDate.of(2020, Month.SEPTEMBER, 01));

        // Create courses
        Course c1 = new Course("Lesson1", "C#", Boolean.TRUE, startDate, endDate);
        Course c2 = new Course("Lesson2", "Java", Boolean.FALSE, startDate, endDate);
                LocalDate.of(2020, Month.SEPTEMBER, 07);
                LocalDate.of(2020, Month.NOVEMBER, 06);
        
        //Create trainers
        Trainer t1 = new Trainer("Trainer1", "Dr. Strange", "Java");
        Trainer t2 = new Trainer("Trainer2", "Dr. Octopus", "C#");
        Trainer t3 = new Trainer("Trainer3", "Dr. X", "Java");
        Trainer t4 = new Trainer("Trainer4", "Dr. Doom", "C#");
       
        //Create Students
        Student s1 = new Student("Student1", "Ksefteris", endDate, 2500);
        Student s2 = new Student("Student2", "Spirtoulis", startDate, 2500);
        Student s3 = new Student("Student3", "Aetopoulos", endDate, 2500);
        Student s4 = new Student("Student4", "Eksipnopoulos", startDate, 2500);
  
        //Create Assignments
        Assignment a1 = new Assignment("Assignment1", "Create a Game ", startDate);
        Assignment a2 = new Assignment("Assignment2", "Create a Database", endDate);
        Assignment a3 = new Assignment("Assignment3", "Create a Web Site", startDate.plusMonths(1));
        Assignment a4 = new Assignment("Assignment4", "Create an Applet ", startDate.plusWeeks(2));
        
        //Set Students to courses
        Main.setStudentToCourse(c1, s1);
        Main.setStudentToCourse(c2, s2);
        Main.setStudentToCourse(c1, s4);
        
        //Set Assignments to courses
        Main.setAssignmentToCourse(c1, a1);
        Main.setAssignmentToCourse(c2, a2);
        Main.setAssignmentToCourse(c1, a4);
        
        //Set Trainers to courses
        Main.setTrainerToCourse(c1, t1);
        Main.setTrainerToCourse(c2, t2);
    }
    
}