package org.mql.java.springBoot.service;

import java.util.List;

import org.mql.java.springBoot.models.Lesson;
import org.springframework.data.repository.CrudRepository;


public interface LessonRepository extends CrudRepository<Lesson, String> {


	//we can get All the CRUD method of Topic using this interface that spring data jpa provide
    
	//we need a method that takes a course id and returs lessons of that course
	public List<Lesson> findByCourseId(String courseId);
	
	//getCoursesByName
	public List<Lesson> findByName(String name);
}
