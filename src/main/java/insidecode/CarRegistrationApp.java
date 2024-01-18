package insidecode;

import insidecode.model.Address;
import insidecode.model.Car;
import insidecode.model.Owner;

import java.time.OffsetDateTime;

public class CarRegistrationApp {

    public static void main(String[] args) {
        CarDatabase carDatabase = new CarDatabase();
        CarNumberGenerator carNumberGenerator = new CarNumberGenerator();

        CarRegistrationService carRegistrationService = new CarRegistrationService(carDatabase, carNumberGenerator);

        Owner magda = Owner.builder()
                .age(18)
                .name("Magda")
                .surname("W Swiecie Kodu")
                .address(Address.builder()
                        .city("Krakow")
                        .state("KR")
                        .number(25)
                        .build())
                .build();

        Car audi = Car.builder()
                .producer("Audi")
                .type("A4")
                .timeOfProduction(OffsetDateTime.MIN)
                .build();

        String carRegistrationNumber = carRegistrationService.registerCar(magda, audi);

        System.out.println("Congratz, you registered you car! Your registration number: " + carRegistrationNumber);
    }
}
