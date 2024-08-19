package org.example.dto.request;

import lombok.Data;
import org.example.Data.models.Note;
import org.springframework.data.annotation.Id;

import java.util.List;
@Data
public class CreateUserRequest {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private List<Note> noteList;
}

