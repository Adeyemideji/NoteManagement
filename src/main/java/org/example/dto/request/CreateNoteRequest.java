package org.example.dto.request;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class CreateNoteRequest {
@Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime dateAndTimeCreated;
}
