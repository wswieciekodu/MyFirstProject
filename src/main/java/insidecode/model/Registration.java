package insidecode.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Registration {
    private Integer id;
    private Owner person;
    private CarToNumber carToNumber;
}
