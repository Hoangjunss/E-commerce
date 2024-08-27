package com.baconbao.e_commerce.services.serviceImpls;

import com.baconbao.e_commerce.dto.ReviewsDTO;
import com.baconbao.e_commerce.model.Reviews;
import com.baconbao.e_commerce.responsitory.ReviewsRepository;
import com.baconbao.e_commerce.services.service.ReviewsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ReviewsServiceImpl implements ReviewsService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ReviewsRepository reviewsRepository;

    @Override
    public ReviewsDTO findById(Integer id) {
        return convertToDTO(reviewsRepository.findById(id).orElseThrow());
    }

    private Reviews save(ReviewsDTO reviewsDTO){
        Reviews reviews = Reviews.builder()
                .id(reviewsDTO.getId())
                .comment(reviewsDTO.getComment())
                .review_date(reviewsDTO.getReview_date())
                .rating(reviewsDTO.getRating())
                .build();
        return reviewsRepository.save(reviews);
    }
    @Override
    public ReviewsDTO createReview(ReviewsDTO reviewsDTO) {
        return convertToDTO(save(reviewsDTO));
    }

    @Override
    public List<ReviewsDTO> getReviewByCar(Integer id) {
        return convertToDTOList(reviewsRepository.findByCarId(id));
    }

    @Override
    public List<ReviewsDTO> getReviewByUser(Integer user_id) {
        return convertToDTOList(reviewsRepository.findByUserId(user_id));
    }

    public ReviewsDTO convertToDTO(Reviews reviews){
        return modelMapper.map(reviews, ReviewsDTO.class);
    }

    public Reviews convertToModel(ReviewsDTO reviewsDTO){
        return modelMapper.map(reviewsDTO, Reviews.class);
    }
    public List<ReviewsDTO> convertToDTOList(List<Reviews> reviews){
        return reviews.stream()
                .map(review -> convertToDTO(review))
                .collect(Collectors.toList());
    }


}
