package org.mql.java.springBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.mql.java.springBoot.models.Course;
import org.mql.java.springBoot.models.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
    private LessonRepository lessonRepository;
	

	public List<Lesson> getAllLessons( String courseId){
		List<Lesson> lessons = new ArrayList<>();
		lessonRepository.findByCourseId(courseId).
		forEach (lessons::add);
		return lessons;
	}

	public Lesson getLesson(String id) {
	  return lessonRepository.findById(id).get();
	}

	public void addLesson(Lesson lesson) {	
		lessonRepository.save(lesson);
	}

	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
	}

	public void updateLesson(Lesson lesson) {	
		lessonRepository.save(lesson);
	}

	public List<Lesson> getLessonsByName(String name){
		return lessonRepository.findByName(name);
	}
	
}
