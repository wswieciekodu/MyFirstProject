package insidecode.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Owner {

    private Integer id;
    private String name;
    private String surname;
    private int age;
    private Address address;
}
