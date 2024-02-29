package opgave01.models;

import com.sun.source.doctree.ThrowsTree;

public class CarInsurance {
    private final double basisPremium; // invariant: basisPremium > 0.
    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */
    public CarInsurance (double basisPremium) {
        this.basisPremium = basisPremium;
    }
    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis premium is reduced with 5%,
     * - if the person have been driving without damages for:
     * - 0 to 2 years, the basis premium is reduced with 0%,
     * - 3 to 5 years, the basis premium is reduced with 15%,
     * - 6 to 8 years, the basis premium is reduced with 25%,
     * - more than 8 years, the basis premium is reduced with 35%.
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */
    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage) {
        double resultat = basisPremium;
        if (age < 25){
            resultat += 25;
        }
        if (isWoman==true){
            resultat -= 5;
        }
        if (yearsWithoutDamage<=2){
            resultat += 0;
        }
        else if (yearsWithoutDamage>=3 || yearsWithoutDamage<=5){
            resultat -= 15;
        } else if (yearsWithoutDamage>=6 || yearsWithoutDamage<=8){
            resultat -= 25;
        }else {
            resultat-=35;
        }
        if (age<18 || yearsWithoutDamage < 0 || yearsWithoutDamage > age-18){
            throw new RuntimeException("Kan ikke Leje bil");
        }
        return resultat;
    }
}

