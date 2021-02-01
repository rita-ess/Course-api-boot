package org.mql.java.springBoot.controllers;

import java.util.List;

import org.mql.java.springBoot.models.Course;
import org.mql.java.springBoot.models.Topic;
import org.mql.java.springBoot.service.CourseService;
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
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}
	
	
	@GetMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
	     return courseService.getCourse(id);
	}
	
	
	//@RequestMapping(value = "/topics" , method = RequestMethod.POST )
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	
	//@RequestMapping(value = "/topics/{id}" , method = RequestMethod.PUT )
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id,  @PathVariable String topicId ) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	
	//@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}



