package org.example.Data.repository;

import org.example.Data.models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note,String>{
}
