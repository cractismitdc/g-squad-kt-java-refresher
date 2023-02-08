package main.java.com.refresher.classes;

import java.util.ArrayList;
import java.util.List;

import main.java.com.refresher.Course;
import main.java.com.refresher.students.IStudent;

public abstract class Class {

	private final List<IStudent> students = new ArrayList<>();
	
	protected abstract List<Course> getAllowedCourses();
	
	protected boolean isCourseAllowed(IStudent student) {
		//TODO: implement
		return true;
	}
	
	public void addStudent(IStudent student) {
		//TODO: implement
	}
	
	public List<String> getStudentNames() {
		//TODO: implement
		return null;
	}
}
