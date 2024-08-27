package com.baconbao.e_commerce.responsitory;

import com.baconbao.e_commerce.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {

}
