package org.mql.java.springBoot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.mql.java.springBoot.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
    private TopicRepository topicRepository;
	
	private List<Topic> topics =new ArrayList<>( Arrays.asList(	
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java core", "Java Core Description"),
			new Topic("javaScript", "Javascipt vanilla", "javascript Description"),
			new Topic("vueJs", "vusJs Framework", "vueJs Framework Description")
			));
	
	public List<Topic> getAllTopics(){
		//return topics;
		//findAll()is an iterable so i need to convert it to a List
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().
		forEach (topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		//a way to filter by Id
		//this is a lambda expression
	  //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	  return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {	
	  //topics.add(topic);
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		 Topic topic = getTopic(id);
//		 topics.remove(topic);
		// topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}

	public void updateTopic(Topic topic, String id) {
		
//		  for (int i = 0; i < topics.size(); i++) {
//			Topic T = topics.get(i);
//			if(T.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}}
       	/*
       	 Topic t = getTopic(id);
		t.setDescription(topic.getDescription());
		t.setId(topic.getId());
		t.setName(topic.getName());*/
		//topicRepository.save(topic);
		Topic t = topicRepository.findById(id).get();
		t.setId(topic.getId());
		t.setName(topic.getName());
		t.setDescription(topic.getDescription());
		topicRepository.save(t);
	}

	
}
