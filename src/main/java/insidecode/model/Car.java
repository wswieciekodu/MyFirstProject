package insidecode.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Car {
    Integer id;
    String producer;
    String type;
    OffsetDateTime timeOfProduction;
}
