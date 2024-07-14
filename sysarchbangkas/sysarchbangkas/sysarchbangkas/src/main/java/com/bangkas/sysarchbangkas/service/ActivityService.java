package com.bangkas.sysarchbangkas.service;

import com.bangkas.sysarchbangkas.model.Bangka;
import com.bangkas.sysarchbangkas.repository.BangkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {

    @Autowired
    private BangkaRepository bangkaRepository;

    public String addBangka(String id, String bangkaName, String destination) {
        Bangka bangka = new Bangka(bangkaName, destination);
        bangka.setId(id);
        bangkaRepository.save(bangka);
        return "Bangka " + bangkaName + " with destination " + destination + " added successfully!";
    }

    public List<Bangka> getAllBangka() {
        return bangkaRepository.findAll();
    }

    public List<Bangka> getBangkaByDestination(String destination) {
        return bangkaRepository.findByDestination(destination);
    }

    public Optional<Bangka> getBangkaById(String id) {
        return bangkaRepository.findById(id);
    }
}
