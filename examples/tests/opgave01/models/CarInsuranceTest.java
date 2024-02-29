package opgave01.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    @Test
    void calculatePremium() {
        CarInsurance carInsurance = new CarInsurance(50);

        double actualanswer = carInsurance.calculatePremium(23, true, 5);
        assertEquals(55, actualanswer);
    }

}