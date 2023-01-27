package fundamentals_of_programming.data_structures.arrays;

public class Student {
	private String name;
	private String surname;
	
	public Student(String name,String surname) {
		this.name=name;
		this.surname=surname;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String toString() {
		return name + " " + surname;
	}
}
