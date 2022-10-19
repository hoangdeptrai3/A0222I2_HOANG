package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> getAll();

    void save(Music student);
    void delete(int id);
    Music getStudentById(int id);
}
