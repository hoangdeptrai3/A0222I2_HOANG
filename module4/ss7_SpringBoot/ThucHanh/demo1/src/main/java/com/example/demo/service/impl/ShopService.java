package com.example.demo.service.impl;

import com.example.demo.model.Shop;
import com.example.demo.repository.ShopRepository;
import com.example.demo.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("shop")
public class ShopService implements IShopService {
    @Autowired
    private ShopRepository shopRepository;
    @Override
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }
}
