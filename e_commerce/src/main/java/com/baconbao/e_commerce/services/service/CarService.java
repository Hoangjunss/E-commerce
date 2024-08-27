package com.baconbao.e_commerce.services.service;

import com.baconbao.e_commerce.dto.CarDTO;
import com.baconbao.e_commerce.model.Car;

import java.util.List;

public interface CarService {
    CarDTO findById(Integer id);
    CarDTO deleteCar(Integer id);
    CarDTO updateCar(CarDTO carDTO);
    List<CarDTO> getAllCars();
}
