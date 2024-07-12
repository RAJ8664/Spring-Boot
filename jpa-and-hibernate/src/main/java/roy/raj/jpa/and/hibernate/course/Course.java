package roy.raj.jpa.and.hibernate.course;



public class Course {
	public long Id;
	public String Name;
	public String Author;
	public long Price;
	
	public Course(long Id, String Name, String Author, long Price) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Author = Author;
		this.Price = Price;
	}
	
	@Override
	public String toString() {
		return "(" + " id = " + Id + " name = " + Name + " author = " + Author + " price = " + Price + ")";
	}

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
	
	
}
