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
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /////////Create methods
    public void createCourse() {
        System.out.println("Enter course name: ");
        String title = sc.next();
        System.out.println("Enter course subject: ");
        String stream = sc.next();
        System.out.println("Is the course full time? (1 = Yes/2 = No)");
        Boolean type;
        if (sc.nextInt() == 1) {
            type = Boolean.TRUE;
        } else {
            type = Boolean.FALSE;
        }
        LocalDate enarksi = getFormattedDate("start date");
        LocalDate liksi = getFormattedDate("end date");

        Course c = new Course(title, stream, type, enarksi, enarksi);

    }

    public void createStudent() {
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        LocalDate gennisi = getFormattedDate("date of birth");
        System.out.println("Enter fees: ");
        Integer fees = sc.nextInt();

        Student s = new Student(firstName, lastName, gennisi, fees);

    }

    public void createTrainer() {
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        System.out.println("Enter subject");
        String subject = sc.next();

        Trainer t = new Trainer(firstName, lastName, subject);

    }

    public void createAssignment() {
        System.out.println("Enter title: ");
        String title = sc.next();
        System.out.println("Enter description: ");
        String description = sc.next();
        LocalDate deadline = getFormattedDate("submission date");

        Assignment a = new Assignment(title, description, deadline);

    }

    public LocalDate getFormattedDate(String type) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = null;
        boolean isFalse = true;
        do {
            System.out.printf("Enter %s (dd/mm/yyyy) : ", type);
            try {
                String date = sc.next();
                d = LocalDate.parse(date, df);
                isFalse = false;
            } catch (DateTimeParseException e) {
            }
        } while (isFalse);

        return d;
    }
////////////// set methods

    public void setStudentToCourse() {
        printStudentList();
        int studentChoice = sc.nextInt();
        printCourseList();
        int courseChoice = sc.nextInt();
        Main.setStudentToCourse(PrivateSchool.courseList.get(courseChoice - 1),
                PrivateSchool.studentList.get(studentChoice - 1));

    }

    public void setTrainerToCourse() {
        printTrainerList();
        int trainerChoice = sc.nextInt();
        printCourseList();
        int courseChoice = sc.nextInt();
        Main.setTrainerToCourse(PrivateSchool.courseList.get(courseChoice - 1),
                PrivateSchool.trainerList.get(trainerChoice - 1));
    }

    public void setAssignmentToCourse() {
        printAssignmentList();
        int assignmentChoice = sc.nextInt();
        printCourseList();
        int courseChoice = sc.nextInt();

        Main.setAssignmentToCourse(PrivateSchool.courseList.get(courseChoice - 1),
                PrivateSchool.assignmentList.get(courseChoice - 1));

    }

    //////////////// Print methods
    public void printCoursesPerStudent() {
        printStudentList();
        int studentChoice = sc.nextInt();
        Main.printCoursesPerStudent(PrivateSchool.studentList.get(studentChoice - 1));
    }

    public void printAssignmentsPerStudent() {
        printStudentList();
        int studentChoice = sc.nextInt();
        Main.printAssignmentsPerStudent(PrivateSchool.studentList.get(studentChoice - 1));
    }

    public List<LocalDate> getSubmissionDates() {
        List<LocalDate> array = new ArrayList();
        LocalDate date = getFormattedDate("date");
        switch (date.getDayOfWeek()) {
            case MONDAY:
                array.add(date.minusDays(1));
                array.add(date.plusDays(5));
                return array;
            case TUESDAY:
                array.add(date.minusDays(2));
                array.add(date.plusDays(4));
                return array;
            case WEDNESDAY:
                array.add(date.minusDays(3));
                array.add(date.plusDays(3));
                return array;
            case THURSDAY:
                array.add(date.minusDays(4));
                array.add(date.plusDays(2));
                return array;
            case FRIDAY:
                array.add(date.minusDays(5));
                array.add(date.plusDays(1));
                return array;
            case SATURDAY:
                array.add(date.minusDays(6));
                array.add(date);
                return array;
            case SUNDAY:
                array.add(date.minusDays(7));
                array.add(date.minusDays(1));
                return array;

        }
        return null;

    }

    public void printStudentList() {
        for (int i = 0; i < PrivateSchool.studentList.size(); i++) {
            System.out.println((i + 1) + PrivateSchool.studentList.get(i).toString());
        }
        System.out.println("Choose student by number: ");

    }

    public void printCourseList() {
        for (int i = 0; i < PrivateSchool.courseList.size(); i++) {
            System.out.println((i + 1) + PrivateSchool.courseList.get(i).toString());
        }
        System.out.println("Choose course by number: ");

    }

    public void printTrainerList() {
        for (int i = 0; i < PrivateSchool.trainerList.size(); i++) {
            System.out.println((i + 1) + PrivateSchool.trainerList.get(i).toString());
        }
        System.out.println("Choose trainer by number: ");

    }

    public void printAssignmentList() {
        for (int i = 0; i < PrivateSchool.assignmentList.size(); i++) {
            System.out.println((i + 1) + PrivateSchool.assignmentList.get(i).toString());
        }
        System.out.println("Choose assignment by number: ");

    }

}
