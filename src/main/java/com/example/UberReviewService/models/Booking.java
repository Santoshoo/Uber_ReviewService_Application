package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModels{




    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date StartTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date EndTime;

    private Long totalDistance;


    @ManyToOne
    private Driver driver;


    @ManyToOne
    private Passenger passenger;



}
