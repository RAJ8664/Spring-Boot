package roy.raj.demo.practice.CourseDatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private long EmployeeId;
    private String EmployeeName;
    private long EmployeeIncome;

    public Employee() {}

    public Employee(long EmployeeId, String EmployeeName, long EmployeeIncome)  {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.EmployeeIncome = EmployeeIncome;
    }
    public long getEmployeeId() {
        return this.EmployeeId;
    }
    public String getEmployeeName() {
        return this.EmployeeName;
    }
    public long getEmployeeIncome() {
        return this.EmployeeIncome;
    }
    public void setEmployeeId(long EmployeeId) {
        this.EmployeeId = EmployeeId;
    } 
    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }
    public void setEmployeeIncome(long EmployeeIncome) {
        this.EmployeeIncome = EmployeeIncome;
    }
    public String toString() {
        return "(" + EmployeeId + " " + EmployeeName + " " + EmployeeIncome + ")";
    }
}
