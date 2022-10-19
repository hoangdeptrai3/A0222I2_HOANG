package com.example.demo4.service;

import com.example.demo4.model.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    void save(Car car);
    void delete(Long id);
}
