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

public class Assignment {

    private String title;
    private String description;
    private LocalDate submissionDateTime;
    private int oralMark;
    private int totalMark;

    public Assignment(String title, String description, LocalDate submissionDateTime) {
        this.title = title;
        this.description = description;
        this.submissionDateTime = submissionDateTime;
        PrivateSchool.assignmentList.add(this);
        
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubmissionDateTime() {
        return submissionDateTime;
    }

    public void setSubmissionDateTime(LocalDate submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "\nAssignment{" + "title=" + title + ", description=" + description + ", submissionDateTime=" + submissionDateTime + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}';
    }

}