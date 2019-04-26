package com.igu.developer.demo;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    // private final CarRepository carRepository;
    @Autowired
    private CarRepository carRepository;
    // public CarService(CarRepository carRepository) {
    // this.carRepository = carRepository;
    // }

    @GraphQLQuery(name = "cars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @GraphQLQuery(name = "car")
    public Optional<Car> getCarById(@GraphQLArgument(name = "id") Long id) {
        return carRepository.findById(id);
    }

    @GraphQLMutation(name = "saveCar")
    public Car saveCar(@GraphQLArgument(name = "car") Car car) {
        return carRepository.save(car);
    }

    @GraphQLMutation(name = "deleteCar")
    public void deleteCar(@GraphQLArgument(name = "id") Long id) {
        carRepository.deleteById(id);
    }

}
