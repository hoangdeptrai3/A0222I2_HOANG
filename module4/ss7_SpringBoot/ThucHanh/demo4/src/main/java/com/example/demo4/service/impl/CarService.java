package com.example.demo4.service.impl;

import com.example.demo4.model.Car;
import com.example.demo4.repository.CarRepository;
import com.example.demo4.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("car")
public class CarService implements ICarService {
    @Autowired
    private CarRepository carRepository;
    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
