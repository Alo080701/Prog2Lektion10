package opgave02.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void calculateFine(){
        Loan loan = new Loan(LocalDate.of(2024,1,31));

        int actualAnswer = loan.calculateFine(loan.getReturnDate(),LocalDate.of(2024, 2, 13), true);
        assertEquals(60, actualAnswer);
    }
}