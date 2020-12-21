public class PaymentAccordingToTiers{
    public static final double workerStartingSalary = 2500;
    public static final double tier1Bonus = 100;
    public static  double bonus;
    public static double yearsOfExperience;

    public static double tier1 () {
             bonus = workerStartingSalary + tier1Bonus;
             double tier1Payment = bonus * yearsOfExperience;
        return bonus * yearsOfExperience;
    }

}

