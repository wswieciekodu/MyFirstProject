package insidecode;

import insidecode.model.Address;
import insidecode.model.Car;
import insidecode.model.Owner;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CarRegistrationService {
    private CarDatabase carDataBase;
    private CarNumberGenerator carNumberGenerator;

    public String registerCar(Owner person, Car car) {
        String number = carNumberGenerator.generateNumber(person.getAddress().getState());

        // add user
//        Address address = new Address(1, "Krakow", 23, "MAL");
//        Owner owner = new Owner(2, "name", "surname", 23, address);

        carDataBase.add(person, car, number);

        return number;
    }

    public List<Car> getCars(Owner person) {

        return carDataBase.getCars(person);
    }
}
