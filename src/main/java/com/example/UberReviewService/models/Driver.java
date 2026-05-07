package com.example.UberReviewService.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModels{

    private String name;


    @Column(nullable = false, unique = true)
    private String licenseNumber;

    @OneToMany(mappedBy = "driver",fetch = FetchType.LAZY) // Assuming Booking has a 'driver' field for the relationship
    @Fetch(FetchMode.SUBSELECT) // To optimize fetching of bookings
    private List<Booking> bookings=new ArrayList<>();// One-to-many relationship with Booking
}
