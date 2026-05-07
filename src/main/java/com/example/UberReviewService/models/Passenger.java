package com.example.UberReviewService.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModels{

    private String name;

    @OneToMany(mappedBy = "passenger")// one passenger can have multiple bookings
    private List<Booking> bookings=new ArrayList<>();// one passenger can have multiple bookings
}
