package org.mql.java.springBoot.service;

import java.util.List;

import org.mql.java.springBoot.models.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, String> {


	//we can get All the CRUD method of Topic using this interface that spring data jpa provide
    
	//we need a method that takes a topic id and returs courses of that topic
	public List<Course> findByTopicId(String topicId);
	
	//getCoursesByName
	public List<Course> findByName(String name);
}
