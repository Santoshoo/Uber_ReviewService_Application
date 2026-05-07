package com.example.UberReviewService.adapters;

import com.example.UberReviewService.dtos.CreateReviewDto;
import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.BookingRepository;


import java.util.Optional;

public class CreateReviewDtoToReviewAdapterImpl implements CreateReviewDtoToReviewAdapter {
    public BookingRepository bookingRepository;
    public CreateReviewDtoToReviewAdapterImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Review convertDto(CreateReviewDto createReviewDto) {
       Optional<Booking> booking= bookingRepository.findById(createReviewDto.getBookingId());
       return booking.map(value->Review.builder()
               .booking(value) 
               .rating(createReviewDto.getRating())
               .content(createReviewDto.getContent())
               .build()).orElse(null);

}
}
