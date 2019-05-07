package com.codegym.service.impl;

import com.codegym.model.Note;
import com.codegym.repository.NoteRepository;
import com.codegym.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository

    @Override
    public List<Note> findAll() {
        return null;
    }

    @Override
    public Note findById(int id) {
        return null;
    }

    @Override
    public void save(Note model) {

    }

    @Override
    public void remove(int id) {

    }
}
