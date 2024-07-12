package roy.raj.Spring_Boot1;

public class Course {

    public long Id;
    public String Name;
    public long Price;

    public Course(long Id, String Name, long Price) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "(" + "Id = " + Id + " Name = " + Name + " Price = " + Price + ")";
    }

    public long GetId() {return Id;}
    public String GetName() {return Name;}
    public long GetPrice() {return Price;}
}
