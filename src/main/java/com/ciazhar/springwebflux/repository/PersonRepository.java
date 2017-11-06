package com.ciazhar.springwebflux.repository;

import com.ciazhar.springwebflux.model.mongo.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by ciazhar on 11/6/17.
 * <p>
 * [ Documentation Here ]
 */

public interface PersonRepository extends ReactiveMongoRepository<Person,String>{
}
