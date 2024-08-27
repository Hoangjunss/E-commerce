package com.baconbao.e_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    @Id
    private Integer id;
    private Integer user_id;
    private String name;
    private String make;
    private String model;
    private String price;
    private String description;
    private String status;
    private Image image;


}
