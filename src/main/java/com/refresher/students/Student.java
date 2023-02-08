package main.java.com.refresher.students;

public abstract class Student implements IStudent {

	private final long studentNumber;
	private final String name;
	private final String address;
	private final int age;
	
	public Student(
		long studentNumber,
		String name,
		String address,
		int age
	) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public long getStudentNumber() {
		return studentNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}
}
