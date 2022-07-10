
package com.carrentalmanagement.Car.Rental.Managament.service;

import com.carrentalmanagement.Car.Rental.Managament.Entity.Car;
import java.util.List;
import java.util.Optional;

public interface CarService {
     Car savecar(Car car) ;
     List<Car> getallcars();
    Car getcarbyID(String Id) ;
    String deletecarById(String Id);
    Car UpdateCarById(String Id,Car car);
}