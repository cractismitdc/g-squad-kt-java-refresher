package main.java.com.refresher;

import java.util.ArrayList;
import java.util.List;

import main.java.com.refresher.students.DentistryStudent;
import main.java.com.refresher.students.IStudent;
import main.java.com.refresher.students.ITStudent;
import main.java.com.refresher.students.NursingStudent;

public class School {

	public static void main(String[] args) {
		List<IStudent> students = new ArrayList<>();
		students.add(new ITStudent(2023100000, "Carl", "Makati City", 18));
		students.add(new ITStudent(2023100001, "Sean", "Manila City", 20));
		students.add(new ITStudent(2023100002, "JC", "Quezon City", 18));
		students.add(new ITStudent(2023100003, "Justfer", "Muntinlupa City", 18));
		students.add(new DentistryStudent(2023100004, "Daxz", "Caloocan City", 18));
		students.add(new DentistryStudent(2023100005, "Gio", "Taguig City", 20));
		students.add(new DentistryStudent(2023100006, "Daryll", "San Jose Del Monte City", 18));
		students.add(new NursingStudent(2023100007, "Jordan", "Pateros City", 18));
		students.add(new NursingStudent(2023100008, "Alex", "Calamba City", 20));
		students.add(new NursingStudent(2023100009, "Ricky", "Bacoor City", 18));
	}

}
