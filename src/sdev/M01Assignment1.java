package sdev;

public class M01Assignment1 {
	public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            double meters = footToMeter(i);
            double feet = meterToFoot(i);

            System.out.printf("%d\t%.3f\t|\t%d\t%.3f\n", i, meters, i, feet);
        }
    }
}

