package database.connectivity.linux.demo.linux.database.connectivity.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Professor {
    @Id
    @GeneratedValue
    private int professorID;
    private String professorName;
    private String professorDept;
    private String professorEmail;

    public Professor() {
    }

    public Professor(int professorID, String professorName, String professorDept, String professorEmail) {
        this.professorID = professorID;
        this.professorName = professorName;
        this.professorDept = professorDept;
        this.professorEmail = professorEmail;
    }

    public int getProfessorID() {
        return this.professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getProfessorName() {
        return this.professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorDept() {
        return this.professorDept;
    }

    public void setProfessorDept(String professorDept) {
        this.professorDept = professorDept;
    }

    public String getProfessorEmail() {
        return this.professorEmail;
    }

    public void setProfessorEmail(String professorEmail) {
        this.professorEmail = professorEmail;
    }

    @Override
    public String toString() {
        return "{" +
                " professorID='" + getProfessorID() + "'" +
                ", professorName='" + getProfessorName() + "'" +
                ", professorDept='" + getProfessorDept() + "'" +
                ", professorEmail='" + getProfessorEmail() + "'" +
                "}";
    }
}
