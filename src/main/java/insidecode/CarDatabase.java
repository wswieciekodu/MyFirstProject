package insidecode;

import insidecode.model.Car;
import insidecode.model.CarToNumber;
import insidecode.model.Owner;
import insidecode.model.Registration;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDatabase {
    private final List<Registration> registrations = new LinkedList<>();

    public void add(Owner person, Car car, String number) {
        registrations.add(Registration
                .builder()
                .carToNumber(CarToNumber
                        .builder()
                        .car(car)
                        .number(number)
                        .build())
                .person(person)
                .build()
        );
    }

    public List<Car> getCars(Owner person) {
        return registrations
                .stream()
                .filter(r -> r.getPerson().equals(person))
                .map(Registration::getCarToNumber)
                .map(CarToNumber::getCar)
                .collect(Collectors.toList());
    }

    public Car getCar(int carId) {
        return Car.builder().build();
    }
}
