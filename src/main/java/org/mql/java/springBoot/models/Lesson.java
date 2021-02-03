package org.mql.java.springBoot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



//here JPA knows to create a table called Topic
@Entity
public class Lesson {

	//with this annotation i entity my primary key of the topic table
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Course course;
	
	
	
	public Lesson() {
		
	}




	public Course getCourse() {
		return course;
	}




	public void setCourse(Course course) {
		this.course = course;
	}




	public Lesson(String id, String name, String description, String courseId ) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.course = new Course(courseId, "", "", 0, true, "", 0, "");
	}

	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
}
