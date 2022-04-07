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

    List<Car> cars = new ArrayList<>();

    Car car1 = new Car(1, 22151, "bmv");
    Car car2 = new Car(2, 52153, "dodge");
    Car car3 = new Car(3, 62613, "mercedes");
    Car car4 = new Car(4, 31253, "mazda");
    Car car5 = new Car(5, 78513, "lada");

    public List<Car> getCars(int quantity) {
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars.stream().limit(quantity).toList();
    }
}
