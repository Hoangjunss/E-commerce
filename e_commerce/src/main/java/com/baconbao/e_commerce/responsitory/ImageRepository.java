package com.baconbao.e_commerce.responsitory;

import com.baconbao.e_commerce.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image,Integer> {
    Optional<Image> findById(Integer integer);
}
