package roy.raj.demo.practice;

public class Course {
    private String CourseName;
    private int CourseCost;
    private String CourseT;

    public Course(String CourseName, int CourseCost, String CourseT) {
        this.CourseName = CourseName;
        this.CourseCost = CourseCost;
        this.CourseT = CourseT;
    }

    public String getCourseName() {
        return this.CourseName;
    }
    public int getCourseCost() {
        return this.CourseCost;
    }
    public String getCourseT() {
        return this.CourseT;
    }

    public void setCouresName(String CourseName) {
        this.CourseName = CourseName;
    }
    public void setCourseCost(int CourseCost) {
        this.CourseCost = CourseCost;
    }
    public void setCouresT(String CourseT) {
        this.CourseT = CourseT;
    } 

    @Override   
    public String toString() {
        return "(" + CourseName + " " + CourseCost + " " + CourseT + ")";
    }
}
