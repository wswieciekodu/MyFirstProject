package insidecode.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarToNumber {
    private Car car;
    private String number;
}
