package database.connectivity.linux.demo.linux.database.connectivity.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    private String studentName;

    @Id
    @GeneratedValue
    private int studentId;
    private String studentBranch;

    public Student() {}
    public Student(String studentName, int studentId, String studentBranch) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentBranch = studentBranch;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentBranch() {
        return this.studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ", studentId='" + getStudentId() + "'" +
            ", studentBranch='" + getStudentBranch() + "'" +
            "}";
    }
    
}

   
