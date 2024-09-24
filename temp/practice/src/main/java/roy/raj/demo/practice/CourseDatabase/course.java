package roy.raj.demo.practice.CourseDatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {
    @Id
    private int id;
    private String name;
    private int cost;

    public course() {}
    
    public course (int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getcost() {
        return this.cost;
    }
    public void setid(int id) {
        this.id = id;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setcost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "(" + id + " " + name + " " + cost + ")";
    }
}
