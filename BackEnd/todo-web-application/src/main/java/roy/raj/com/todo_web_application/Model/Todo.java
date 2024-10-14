package roy.raj.com.todo_web_application.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int Id;
	private String Description;
	private String is_Done;
	private LocalDate targetDate;
	
	public Todo() {}
	public Todo(int Id, String Description, String is_Done, LocalDate targetDate) {
		this.Id = Id;
		this.Description = Description;
		this.is_Done = is_Done;
		this.targetDate = targetDate;
	}

	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getIs_Done() {
		return this.is_Done;
	}

	public void setIs_Done(String is_Done) {
		this.is_Done = is_Done;
	}

	public LocalDate getTargetDate() {
		return this.targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	@Override
	public String toString() {
		return "{" +
			" Id='" + getId() + "'" +
			", Description='" + getDescription() + "'" +
			", is_Done='" + getIs_Done() + "'" +
			", targetDate='" + getTargetDate() + "'" +
			"}";
	}
}

	
