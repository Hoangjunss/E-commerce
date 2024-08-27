package com.baconbao.e_commerce.services.service;

import com.baconbao.e_commerce.dto.ReviewsDTO;

import java.util.List;

public interface ReviewsService {
    ReviewsDTO findById(Integer id);
    ReviewsDTO createReview(ReviewsDTO reviewsDTO);
    List<ReviewsDTO> getReviewByCar(Integer id);
    List<ReviewsDTO> getReviewByUser(Integer user_id);
}
