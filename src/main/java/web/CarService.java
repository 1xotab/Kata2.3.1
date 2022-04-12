package web;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    List<Car> cars = List.of(
            new Car(1, 22151, "bmv"),
            new Car(2, 52153, "dodge"),
            new Car(3, 62613, "mercedes"),
            new Car(4, 31253, "mazda"),
            new Car(5, 78513, "lada"));

    public List<Car> getCars(int quantity) {
        return cars.stream().limit(quantity).toList();
    }
}
