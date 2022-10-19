package com.codegym.repository.impl;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MusicRepository implements IMusicRepository {
    static List<Music> musicList = new ArrayList<>();
    @Override
    public List<Music> getAll() {
        List<Music> musicList = BaseRepository.entityManager
                .createQuery("select s from music s", Music.class).getResultList();
        return musicList;
    }

    @Override
    public void save(Music student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Music getStudentById(int id) {
        return null;
    }
}
