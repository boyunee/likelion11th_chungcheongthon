package com.example.test;

import com.example.test.dto.GymReviewDto;
import com.example.test.dto.TrainerReviewDto;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class Service {

    private ArrayList<GymReviewDto> gym_list = new ArrayList<GymReviewDto>();

    public void addGymData(GymReviewDto gymReviewDto) {
        gym_list.add(gymReviewDto);
    }

    public ArrayList<GymReviewDto> getGymList() {
        return gym_list;
    }

    private ArrayList<TrainerReviewDto> trainer_list = new ArrayList<TrainerReviewDto>();

    public void addTrainerData(TrainerReviewDto trainerReviewDto) {
        trainer_list.add(trainerReviewDto);
    }

    public ArrayList<TrainerReviewDto> getTrainerList() {
        return trainer_list;
    }
}
