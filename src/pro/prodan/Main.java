package pro.prodan;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
      // задача 1
    var craft = 7;
    byte me = 126;
    int girl = 21474;
    float boat = 1.5f;
    long hair = 3L;
    double weight = 1.35;
    char coalGrill = 78;
    short skirt = 32766;

    // задача 2
    float boxer1Weight = 78.2f;
    float boxer2Weight = 82.7f;
    float totalBoxerWeight = boxer1Weight + boxer2Weight;
        System.out.println("Total boxer weight is " + totalBoxerWeight + "kg");
    float weightDifference = boxer1Weight - boxer2Weight;
        System.out.println("Weight difference is " + weightDifference + " kg");

        // задача 3
    var bananas =5;
    var bananaWeight = 80;
    var milk = 2;
    var milkWeigt = 105;
    var plombir = 2;
    var plombirWeight = 100;
    var eggs = 4;
    var eggWeight = 70;
    float totalBreakfastWeight = bananas*bananaWeight + milk*milkWeigt + plombir*plombirWeight + eggs*eggWeight;
    float totalBreakfastWeightKg = totalBreakfastWeight/1000;
        System.out.println("Total breakfast weight is " + totalBreakfastWeightKg + " kg");

    // задача 4
    var weightLossMin = 250;
    var weightLossMax = 500;
    var requiredWeightLoss = 7000;
    var daysMinWeightLoss = requiredWeightLoss/weightLossMin;
        System.out.println("The boxer will need " + daysMinWeightLoss + " days if he loses 250 gramms per day");
    var daysMaxWeightLoss = requiredWeightLoss/weightLossMax;
        System.out.println("The boxer will need " + daysMaxWeightLoss + " days if he loses 500 gramms per day");
    var averageDaysOfWeightLoss = (daysMaxWeightLoss + daysMinWeightLoss)/2;
        System.out.println("The boxer will need " + averageDaysOfWeightLoss + " days in average to lose 7 kg");

     // задача 5

    var salaryMasha = 67760;
    var salaryDenis = 83690;
    var salaryChristina = 76230;
    var salaryMashaTopUp = salaryMasha*1.1;
    var salaryDenisTopUp = salaryDenis*1.1;
    var salaryChristinaTopUp = salaryChristina*1.1;
    var salaryMashaYearDifference = salaryMasha + salaryMasha*0.2;
        System.out.println("Masha now has " + salaryMashaTopUp + " rubles per month. Her annual income increased on " + salaryMashaYearDifference + " rubles.");
    var salaryDenisYearDifference = salaryDenis + salaryDenis*0.2;
        System.out.println("Denis now has " + salaryDenisTopUp + " rubles per month. His annual income increased on " + salaryDenisYearDifference + " rubles.");
    var salaryChristinaYearCurrent = salaryChristina*12;
    var salaryChristinaYearDifference = salaryChristina + salaryChristina*0.2;
        System.out.println("Christina now has " + salaryChristinaTopUp + " rubles per month. Her annual income increase on " + salaryChristinaYearDifference + " rubles");
    }
}
