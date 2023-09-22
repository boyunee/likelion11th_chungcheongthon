package com.example.test;

import com.example.test.dto.GymReviewDto;
import com.example.test.dto.TrainerReviewDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
public class Controller {
    @Autowired
    private Service service;
//    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public Controller(Service service) {

        this.service=service;
    }

    @GetMapping("/")
    public String test(){
//        log.info("test 메인 페이지");
        return "index";
    }

    @PostMapping("/gym")
    public String gym(@RequestBody GymReviewDto gymReviewDto) {
        service.addGymData(gymReviewDto);
        System.out.println(service.getGymList());
        return "result";
    }

    @RequestMapping("/gym/req")
    public ArrayList<GymReviewDto> gymReq() {
        return service.getGymList();
    }

    @PostMapping("/trainer")
    public String trainer(@RequestBody TrainerReviewDto trainerReviewDto) {
        service.addTrainerData(trainerReviewDto);
        System.out.println(service.getTrainerList());
        return "result1";
    }

    @RequestMapping("/trainer/req")
    public ArrayList<TrainerReviewDto> trainerReq() {
        return service.getTrainerList();
    }

}
