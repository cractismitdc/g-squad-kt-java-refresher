package main.java.com.refresher;

public enum Course {
	IT("Information Technology"),
	NURSING("Nursing"),
	DENTISTRY("Dentistry");
	
	private final String name;
	
	Course(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
