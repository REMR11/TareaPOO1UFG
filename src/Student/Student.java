package Student;

public class Student {
	private int student_Id;
	private String fName;
	private String lName;
	private int age;
	private int listNumber;
	
	
	public Student() {
		super();
	}
	public Student(int student_Id, String fName, String lName, int age, int listNumber) {
		super();
		this.student_Id = student_Id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.listNumber = listNumber;
	}
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getListNumber() {
		return listNumber;
	}
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	@Override
	public String toString() {
		return "Estudiante [Id=" + student_Id + ", nombre=" + fName + lName + ", edad=" + age
				+ ", N° Lista=" + listNumber + "]";
	}
}
