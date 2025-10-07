public class SpeedConverter {
    static double oneMileInKilometers = 1.609;
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return (long) Math.round((kilometersPerHour / oneMileInKilometers));

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        };

        long milesPerHour = toMilesPerHour(kilometersPerHour);
//        String conversionMsg = String.format("%f km/h = %d mi/h", kilometersPerHour, milesPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static void main(String[] args) {
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-1);
        SpeedConverter.printConversion(0);

    }
}
