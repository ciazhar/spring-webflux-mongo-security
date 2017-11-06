package com.ciazhar.springwebflux.model.mongo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ciazhar on 11/6/17.
 * <p>
 * [ Documentation Here ]
 */

@Builder
@Data
@Document
public class Person {
    @Id
    private String id;
    private String name;
}
