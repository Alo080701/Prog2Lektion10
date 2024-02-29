package opgave02.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
        int takst = 0;
        int antalDage = (int) ChronoUnit.DAYS.between(calculatedDate, actualDate);
        if (antalDage <= 7) {
            if (adult == true) {
                takst += 20;
            } else {
                takst += 10;
            }
        } else if (antalDage >= 8 || antalDage <= 14) {
            if (adult == true){
                takst += 60;
            } else{
                takst += 30;
            }

        } else {
            if (adult == true){
                takst += 90;
            } else{
                takst += 45;
            }
        }
        return takst;
    }

}
