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

		@Column(name = "author")
		public String author;

		@Column(name = "Price")
		public long Price;

		public Course() {}
		public Course(long Id, String Name, String author, long Price) {
			super();
			this.Id = Id;
			this.Name = Name;
			this.author = author;
			this.Price = Price;
		}

		//Getters and Setters;
		public long getId() {
			return Id;
		}
		public void setId(long Id) {
			Id = Id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String Name) {
			Name = Name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String Author) {
			Author = Author;
		}
		public long getPrice() {
			return Price;
		}
		public void setPrice(long Price) {
			Price = Price;
		}

		@Override
		public String toString() {
			return "(" + " id = " + Id + ", name = " + Name + ", author = " + author + ", price = " + Price + ")";
		}
	}
