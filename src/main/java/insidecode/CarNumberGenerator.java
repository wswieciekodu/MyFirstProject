package insidecode;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CarNumberGenerator {

    private Integer startNumber = 0;

    public String generateNumber(String state) {
        NumberFormat formatter = new DecimalFormat("000000");
        String numberInSixDigitsFormat = formatter.format(++startNumber);
        return state + " " + numberInSixDigitsFormat;
    }
}
