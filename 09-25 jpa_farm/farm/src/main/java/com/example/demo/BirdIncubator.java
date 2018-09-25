package com.example.demo;

import com.example.demo.dao.BirdEntity;
import com.example.demo.dao.repository.BirdRepository;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.SortComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by java on 25.09.2018.
 */
@Component
@Log4j2
public class BirdIncubator {

    @Autowired
    private BirdRepository birdRepository;

    @PostConstruct
    public void incubator() {

        for (int i = 0; i < 10; i++) {
            BirdEntity birdEntity = new BirdEntity();
            birdEntity.setBirdHealth((i + 23) + "");
            birdEntity.setBirdType("duck");
            birdEntity.setWeight(5 + i);
            birdEntity.setPricePerUnit(25);
            birdRepository.save(birdEntity);
        }

        for (int i = 0; i < 10; i++) {
            BirdEntity birdEntity = new BirdEntity();
            birdEntity.setBirdHealth((i + 30) + "");
            birdEntity.setBirdType("eagle");
            birdEntity.setWeight(10 + i);
            birdEntity.setPricePerUnit(40);
            birdRepository.save(birdEntity);

        }
    }


}
