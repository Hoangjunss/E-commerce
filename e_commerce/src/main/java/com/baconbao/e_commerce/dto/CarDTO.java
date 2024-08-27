package com.baconbao.e_commerce.dto;

import com.baconbao.e_commerce.model.Image;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private Integer id;
    private Integer user_id;
    private String name;
    private String make;
    private String model;
    private String price;
    private String description;
    private String status;
    private ImageDTO imageDTO;
    private List<ReviewsDTO> reviewsDTO;

}
