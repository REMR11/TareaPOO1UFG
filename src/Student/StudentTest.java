package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		ArrayList<Student> students = new ArrayList<Student>();
		int numberStudets = 0;
		System.out.println("Proporciona cantidad de estudiantes a registrar");
		numberStudets = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < numberStudets; i++) {
			System.out.println("Proporciona nombre de estudiante");
			student.setfName(scan.nextLine());

			System.out.println("Proporciona Apellido de estudiante");
			student.setlName(scan.nextLine());

			System.out.println("Proporciona edad de estudiante");
			student.setAge(Integer.parseInt(scan.nextLine()));

			System.out.println("Proporciona numero de lista de estudiante");
			student.setListNumber(Integer.parseInt(scan.nextLine()));
			student.setStudent_Id(i);
			students.add(student);
		}

		System.out.println(students.toString());

	}

}

class sortListBy implements Comparator<Student> {

	public int compareByStudent_Id(Student s1, Student s2) {
		return s1.getStudent_Id() - s2.getStudent_Id();
	}

	public int compareByListNumber(Student s1, Student s2) {
		return s1.getListNumber() - s2.getListNumber();
	}

	public int compareByName(Student s1, Student s2) {
		return s1.getfName().compareTo(s2.getfName());
	}

	public int compareByLastName(Student s1, Student s2) {
		return s1.getlName().compareTo(s2.getlName());
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
