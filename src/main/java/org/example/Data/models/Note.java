package org.example.Data.models;
import org.springframework.data.annotation.Id;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.time.LocalDateTime;
@Data
@Document
public class Note {

    @Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime dateAndTimeCreated;
}
