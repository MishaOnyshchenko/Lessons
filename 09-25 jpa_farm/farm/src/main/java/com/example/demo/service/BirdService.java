package com.example.demo.service;

import com.example.demo.dto.BirdDto;

import java.util.List;

/**
 * Created by java on 25.09.2018.
 */
public interface BirdService {

    BirdDto getOne(int weight);

    List<BirdDto> getAllBirds();
}
