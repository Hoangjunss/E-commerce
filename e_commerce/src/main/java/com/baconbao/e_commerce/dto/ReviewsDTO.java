package com.baconbao.e_commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewsDTO {
    private Integer id;
    private Integer user_id;
    private Integer car_id;
    private Integer rating;
    private String comment;
    private LocalDateTime review_date;
}
