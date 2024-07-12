package roy.raj.Spring_Boot1;

public class Students {
    public long Roll_Number;
    public String Name;
    public Course Course_Taken;

    public Students(long Roll_Number, String Name, Course Course_Taken) {
        this.Roll_Number = Roll_Number;
        this.Name = Name;
        this.Course_Taken = Course_Taken;
    }

    @Override
    public String toString() {
        return "(" + "Roll Number = " + Roll_Number + " Name = " + Name + " Course Taken = " + Course_Taken + ")";
    }

    public long GetRoll() {return Roll_Number;}
    public String GetName() {return Name;}
    public Course GetCourse() {return Course_Taken;}
}
