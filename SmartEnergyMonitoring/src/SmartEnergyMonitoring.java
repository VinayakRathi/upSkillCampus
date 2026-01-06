import java.util.Random;

public class SmartEnergyMonitoring {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        System.out.println("Smart Energy Monitoring System Started...");
        System.out.println("---------------------------------------");

        while (true) {
            double voltage = 210 + (random.nextDouble() * 30);
            double current = 1 + (random.nextDouble() * 5);

            double power = voltage * current;
            double energy = power / 1000;

            System.out.println("Voltage: " + voltage + " V");
            System.out.println("Current: " + current + " A");
            System.out.println("Power  : " + power + " W");
            System.out.println("Energy : " + energy + " kWh");
            System.out.println("---------------------------------------");

            Thread.sleep(3000);
        }
    }
}
