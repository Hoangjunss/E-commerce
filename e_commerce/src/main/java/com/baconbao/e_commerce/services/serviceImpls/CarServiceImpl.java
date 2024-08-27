package com.baconbao.e_commerce.services.serviceImpls;

import com.baconbao.e_commerce.dto.CarDTO;
import com.baconbao.e_commerce.model.Car;
import com.baconbao.e_commerce.responsitory.CarRepository;
import com.baconbao.e_commerce.services.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CarDTO findById(Integer id) {
        return convertToDTO(carRepository.findById(id).orElseThrow());
    }

    @Override
    public CarDTO deleteCar(Integer id) {
        return convertToDTO(carRepository.findById(id).orElseThrow());
    }

    @Override
    public CarDTO updateCar(CarDTO carDTO) {
        return convertToDTO(carRepository.save(convertToModel(carDTO)));
    }

    @Override
    public List<CarDTO> getAllCars() {
        return convertToDTOList(carRepository.findAll());
    }


    public CarDTO convertToDTO(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }


    public Car convertToModel(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }


    public List<CarDTO> convertToDTOList(List<Car> cars) {
        return cars.stream()
                .map(car -> convertToDTO(car))
                .collect(Collectors.toList());
    }

}
