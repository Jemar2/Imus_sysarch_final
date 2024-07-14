package com.bangkas.sysarchbangkas.repository;

import com.bangkas.sysarchbangkas.model.Bangka;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BangkaRepository extends MongoRepository<Bangka, String> {
    List<Bangka> findByDestination(String destination);
}
