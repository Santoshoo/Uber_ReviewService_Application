package com.example.UberReviewService.dtos;

import lombok.*;

import java.util.Date;


@AllArgsConstructor
@Getter
@Setter
@Builder
@NoArgsConstructor
public class ReviewDto {
    private Long id;
    private String content;
    private Double rating;
    private Long booking;
    private Date createdAt;
    private Date updatedAt;
}
