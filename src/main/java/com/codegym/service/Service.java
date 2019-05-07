package com.codegym.service;

import com.codegym.model.Note;

import java.util.List;

public interface Service<T> {
    List<T> findAll();
    T findById(int id);
    void save(T model);
    void remove(int id);
}
