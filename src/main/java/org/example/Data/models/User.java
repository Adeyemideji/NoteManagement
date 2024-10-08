package org.example.Data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private List<Note> noteList;
}
