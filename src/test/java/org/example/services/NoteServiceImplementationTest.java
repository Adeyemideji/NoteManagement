package org.example.services;

import org.example.Data.models.Note;
import org.example.dto.request.CreateNoteRequest;
import org.example.dto.response.CreateNoteResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import  static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class NoteServiceImplementationTest {
    @Autowired
    private NoteService noteService;

    @Test
    public void testThatNoteCanBeCreated(){
        CreateNoteRequest createNoteRequest = new CreateNoteRequest();
        createNoteRequest.setContent("content");
        createNoteRequest.setTitle("title");
        createNoteRequest.setDateAndTimeCreated(LocalDateTime.now());

        CreateNoteResponse createNoteResponse = noteService.createNote(createNoteRequest);
        createNoteResponse.setMessage("Note created successfully");
        assertEquals(createNoteResponse.getMessage(), "Note created successfully");
        assertThat( noteService.getTotalNotes().intValue()).isEqualTo(1);




    }


}