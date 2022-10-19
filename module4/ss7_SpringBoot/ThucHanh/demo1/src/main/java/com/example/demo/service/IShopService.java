package com.example.demo.service;

import com.example.demo.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IShopService {
    List<Shop> findAll();

}
