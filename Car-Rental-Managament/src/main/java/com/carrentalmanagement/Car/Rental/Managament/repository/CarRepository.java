package com.carrentalmanagement.Car.Rental.Managament.repository;

import com.carrentalmanagement.Car.Rental.Managament.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car,Long> {

    Optional<Car> findByCarId(String id);

    String deleteByCarId(String carId);
}