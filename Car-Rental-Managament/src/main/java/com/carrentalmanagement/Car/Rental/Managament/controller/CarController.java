
package com.carrentalmanagement.Car.Rental.Managament.controller;

import com.carrentalmanagement.Car.Rental.Managament.Entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private com.carrentalmanagement.Car.Rental.Managament.service.CarService CarService;

    @PostMapping("/saveCar")
    public Car savecar(@Validated @RequestBody Car car) {
        return CarService.savecar(car);
    }

    @GetMapping("/getCars")
    public List<Car> getcars() {
        return CarService.getallcars();
    }

    @RequestMapping(value = "/getCar", method = RequestMethod.GET)
    public Car getCarById(@RequestParam("id") String Id) {
        return CarService.getcarbyID(Id);
    }

    @DeleteMapping("/deleteCar")
    public String deleteCarById(@RequestParam("id") String id) {

        return CarService.deletecarById(id);
    }


    @PutMapping("/editCar")
    public Car UpdateCarById(@RequestParam("id") String id, @RequestBody Car car) {
        return CarService.UpdateCarById(id, car);
    }
}