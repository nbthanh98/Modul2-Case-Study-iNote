package com.codegym.repository.Impl;

import com.codegym.model.Note;
import com.codegym.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class NoteRepositoryImpl implements NoteRepository {

    @Autowired
    private EntityManager em;

    @Override
    public List<Note> findAll() {
        return null;
    }

    @Override
    public Note findById(int id) {
        return null;
    }

    @Override
    public void save(Note note) {
        if(note.getType_id() != null){
            em.merge(note);
        }else{
            em.persist(note);
        }
    }

    @Override
    public void remove(int id) {

    }
}
