package org.mql.java.springBoot.service;

import org.mql.java.springBoot.models.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String> {


	//we can get All the CRUD method of Topic using this interface that spring data jpa provide
}
