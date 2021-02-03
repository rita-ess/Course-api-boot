package org.mql.java.springBoot.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



//here JPA knows to create a table called Topic
@Entity
public class Course {

	//with this annotation i entity my primary key of the topic table
	@Id
	private String id;
	private String name;
	private String description;
	private float price;
	private boolean isCertified;
	private String category;
	private int level;

	
	@ManyToOne
	private Topic topic;
	
	
	
	public Course() {
		
	}

	public Course(String id, String name, String description, float price, boolean isCertified, String category, int level, String topicId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.isCertified = isCertified;
		this.category = category;
		this.level = level;
		this.topic = new Topic(topicId, "", "");
	}

	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isCertified() {
		return isCertified;
	}

	public void setCertified(boolean certified) {
		isCertified = certified;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
