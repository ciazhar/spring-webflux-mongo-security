package com.ciazhar.springwebflux.router;

import com.ciazhar.springwebflux.model.mongo.Person;
import com.ciazhar.springwebflux.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

/**
 * Created by ciazhar on 11/6/17.
 * <p>
 * [ Documentation Here ]
 */

@Configuration
public class PersonRouter {

    @Bean
    RouterFunction<?> routerFunction(PersonHandler handler){
        return RouterFunctions
                .route(RequestPredicates.GET("/person/all"),handler::findAll);
    }

    @Component
    @RequiredArgsConstructor
    static class PersonHandler {
        private final PersonRepository repository;

        Mono<ServerResponse> findAll(ServerRequest request){
            return ServerResponse.ok().body(repository.findAll(),Person.class);
        }
    }

}
