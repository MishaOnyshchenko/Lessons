package com.example.demo.dao.repository;


import com.example.demo.dao.BirdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<BirdEntity,Long> {

    BirdEntity findByWeight(int weight);
}
