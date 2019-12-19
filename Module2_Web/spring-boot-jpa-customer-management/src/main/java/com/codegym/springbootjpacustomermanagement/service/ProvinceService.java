package com.codegym.springbootjpacustomermanagement.service;

import com.codegym.springbootjpacustomermanagement.model.Province;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ProvinceService {

    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
