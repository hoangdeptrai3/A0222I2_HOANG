package com.codegym.repository;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> getAll();

    void save(Music student);
    void delete(int id);
    Music getStudentById(int id);
}
