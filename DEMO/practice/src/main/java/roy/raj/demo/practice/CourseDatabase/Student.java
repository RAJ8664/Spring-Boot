package roy.raj.demo.practice.CourseDatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int StudentId;
    private String StudentName;
    private String StudentBranch;
    
    public Student() {}

    public Student(int StudentId, String StudentName, String StudentBranch) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentBranch = StudentBranch;
    }

    public int getStudentId() {
        return this.StudentId;
    }
    public String getStudentName() {
        return this.StudentName;
    } 
    public String getStudentBranch() {
        return this.StudentBranch;
    }
    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    public void setStudentBranch(String StudentBranch) {
        this.StudentBranch = StudentBranch;
    }
    @Override
    public String toString() {
        return "(" + StudentId + " " + StudentName + " " + StudentBranch + ")";
    }
}
