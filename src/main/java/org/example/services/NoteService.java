package org.example.services;

import org.example.dto.request.CreateNoteRequest;
import org.example.dto.response.CreateNoteResponse;

public interface NoteService {
    Long countNumberOfNotes();

    CreateNoteResponse createNote(CreateNoteRequest createNoteRequest);
    Long getTotalNotes();
}
