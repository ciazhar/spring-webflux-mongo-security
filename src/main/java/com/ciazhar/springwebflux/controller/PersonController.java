package com.ciazhar.springwebflux.controller;

import com.ciazhar.springwebflux.model.mongo.Person;
import com.ciazhar.springwebflux.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

/**
 * Created by ciazhar on 11/6/17.
 * <p>
 * [ Documentation Here ]
 */

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired private PersonRepository repository;

    @GetMapping("/all")
    public Flux<Person> findAll(){
        return repository.findAll();
    }

    @PostMapping("/add")
    public Mono<Person> add(@RequestBody Person p){
        Person person = Person.builder().name(p.getName()).build();
        return repository.save(person);
    }

}

