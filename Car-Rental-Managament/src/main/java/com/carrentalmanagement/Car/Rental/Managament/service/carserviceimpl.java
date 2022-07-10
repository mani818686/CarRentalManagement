package com.carrentalmanagement.Car.Rental.Managament.service;

import com.carrentalmanagement.Car.Rental.Managament.Entity.Car;
import com.carrentalmanagement.Car.Rental.Managament.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class carserviceimpl implements  CarService{
    @Autowired
    private CarRepository carRepository;


    @Override
    public Car savecar(Car car) {
        return carRepository.save(car);
    }
    public List<Car> getallcars(){
        return  carRepository.findAll();
    }

    @Override
    public Car getcarbyID(String Id) {
        Optional<Car> car=carRepository.findByCarId(Id);
        return car.get();
    }

    @Override
    public String deletecarById(String Id) {
        carRepository.deleteByCarId(Id);
        return "Car with Id "+Id+" is Deleted Successfully!!";
    }

    @Override
    public Car UpdateCarById(String Id, Car car) {
        Car car1=carRepository.findByCarId(Id).get();
        if(Objects.nonNull(car.getCarModel()) && !"".equalsIgnoreCase(car.getCarModel()))
            car1.setCarModel(car.getCarModel());
        if(Objects.nonNull(car.getCarNo()) && !"".equalsIgnoreCase(car.getCarNo()))
            car1.setCarNo(car.getCarNo());
        if(Objects.nonNull(car.getStatus()) && !"".equalsIgnoreCase(car.getStatus()))
            car1.setStatus(car.getStatus());
        return  carRepository.save(car1);
    }




}