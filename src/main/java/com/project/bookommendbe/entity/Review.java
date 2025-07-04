package com.project.bookommendbe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    private String content;

    private LocalDateTime createdAt;
    private String reviewDate;
    @Enumerated(EnumType.STRING)
    private RatingEnum rating;
}
