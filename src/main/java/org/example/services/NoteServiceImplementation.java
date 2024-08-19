package org.example.services;

import org.example.Data.models.Note;
import org.example.Data.repository.NoteRepository;
import org.example.dto.request.CreateNoteRequest;
import org.example.dto.response.CreateNoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImplementation implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Long countNumberOfNotes() {
        return noteRepository.count();
    }

    @Override
    public CreateNoteResponse createNote(CreateNoteRequest createNoteRequest) {
        Note note = new Note();
        note.setTitle(createNoteRequest.getTitle());
        note.setContent(createNoteRequest.getContent());
        note.setDateAndTimeCreated(createNoteRequest.getDateAndTimeCreated());
        noteRepository.save(note);
        CreateNoteResponse createNoteResponse = new CreateNoteResponse();
        createNoteResponse.setMessage("Note created successfully");
        return createNoteResponse;
    }

    @Override
    public Long getTotalNotes() {
        return noteRepository.count();
    }
}
