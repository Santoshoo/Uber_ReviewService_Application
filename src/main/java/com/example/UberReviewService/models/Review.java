package com.example.UberReviewService.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.util.Date;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="bookingreview")
public class Review extends BaseModels {


    @Column(nullable = false)
    protected String content;

    private  Double rating;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(nullable = false)
    private Booking booking;





    @Override
    public String toString() {
        return "Review{" +
                "Id=" + Id +
                ", content='" + content + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


}
