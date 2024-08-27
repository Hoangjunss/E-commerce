package com.baconbao.e_commerce.responsitory;

import com.baconbao.e_commerce.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewsRepository extends JpaRepository<Reviews,Integer> {
    Optional<Reviews> findById(Integer id);
    List<Reviews> findByCarId(Integer id);
    List<Reviews> findByUserId(Integer user_id);
}
