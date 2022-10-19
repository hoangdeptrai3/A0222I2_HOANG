package com.codegym.service.impl;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("musicService")
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository musicRepository;
    @Override
    public List<Music> getAll() {
        return musicRepository.getAll();
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
