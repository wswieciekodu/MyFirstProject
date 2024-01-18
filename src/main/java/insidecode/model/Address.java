package insidecode.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Address {
    private Integer id;
    private String city;
    private Integer number;
    private String state;
}
