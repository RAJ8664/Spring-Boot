package roy.raj.jpa.and.hibernate.course;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


//use entity annotation to directly map the things to a database;
@Entity(name = "Course")
public class Course {

	@Id
	public long Id;

	@Column(name = "Name")
	public String Name;

	@Column(name = "Author")
	public String Author;

	@Column(name = "Price")
	public long Price;

	public Course() {}
	public Course(long Id, String Name, String Author, long Price) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Author = Author;
		this.Price = Price;
	}

	//Getters and Setters;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "(" + " id = " + Id + " name = " + Name + " author = " + Author + " price = " + Price + ")";
	}
}
