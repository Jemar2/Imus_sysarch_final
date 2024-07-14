package com.bangkas.sysarchbangkas.controller;

import com.bangkas.sysarchbangkas.model.Bangka;
import com.bangkas.sysarchbangkas.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping("/addBangka")
    public String addBangka(@RequestParam String id, @RequestParam String bangkaName, @RequestParam String destination) {
        return activityService.addBangka(id, bangkaName, destination);
    }

    @GetMapping("/getAllBangka")
    public List<Bangka> getAllBangka() {
        return activityService.getAllBangka();
    }

    @GetMapping("/getBangkaById")
    public Optional<Bangka> getBangkaById(@RequestParam String id) {
        return activityService.getBangkaById(id);
    }
}
