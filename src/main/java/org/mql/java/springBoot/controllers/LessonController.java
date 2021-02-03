package org.mql.java.springBoot.controllers;

import java.util.List;

import org.mql.java.springBoot.models.Course;
import org.mql.java.springBoot.models.Lesson;
import org.mql.java.springBoot.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;

	@RequestMapping("/topics/{topicId}/courses/{courseId}/lessons")
	public List<Lesson> getAllLessons(@PathVariable String courseId) {
		return lessonService.getAllLessons(courseId);
	}
	
	
	@GetMapping("/topics/{topicId}/courses/{CourseId}/lessons/{id}")
	public Lesson getCourse(@PathVariable String id) {
	     return lessonService.getLesson(id);
	}
	
	
	//@RequestMapping(value = "/topics" , method = RequestMethod.POST )
	@PostMapping("/topics/{topicId}/courses/{courseId}/lessons")
	public void addCourse(@RequestBody Lesson lesson,@PathVariable String courseId) {
		lesson.setCourse(new Course(courseId, "", "", 0, true, "", 0, ""));
		lessonService.addLesson(lesson);
	}
	
	
	//@RequestMapping(value = "/topics/{id}" , method = RequestMethod.PUT )
	@PutMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void updateCourse(@RequestBody Lesson lesson, @PathVariable String id,  @PathVariable String courseId ) {
		lesson.setCourse(new Course(courseId, "", "", 0, true, "", 0, ""));
		lessonService.updateLesson(lesson);
	}
	
	
	//@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void deleteCourse(@PathVariable String id) {
		lessonService.deleteLesson(id);
	}
}



