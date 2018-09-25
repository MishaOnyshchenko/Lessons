package com.example.demo.service;

import com.example.demo.dao.BirdEntity;
import com.example.demo.dao.repository.BirdRepository;
import com.example.demo.dto.BirdDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class BirdServiceImpl implements BirdService  {

    @Autowired
    private BirdRepository birdRepository;

    @Override
    public BirdDto getOne(int weight) {

        BirdEntity birdEntity = birdRepository.findByWeight(weight);

        BirdDto birdDto = new BirdDto();
//        birdDto.setAmmount(birdEntity.getAmount());
        birdDto.setName(birdEntity.getBirdType());
        birdDto.setPricePerUnit(birdEntity.getPricePerUnit());

        return birdDto;
    }

    @Override
    public List<BirdDto> getAllBirds() {

        List <BirdDto> birdDtoList = new ArrayList<>();

        for (BirdEntity birdEntity: birdRepository.findAll()) {
            BirdDto birdDto = new BirdDto();
            birdDto.setName(birdEntity.getBirdType());
            birdDto.setPricePerUnit(birdEntity.getPricePerUnit());
            birdDtoList.add(birdDto);
        }
        return birdDtoList;
    }
}
