package termometro;
public class main {

    public static void main(String[] args) {

        thermometer thermometer = new thermometer(20);

        System.out.println("Temperatura actual: "
                + thermometer.getTemperature() + " °C");

        boolean result = thermometer.setTemperature(30);

        if (result) {
            System.out.println("Temperatura aceptada.");
        } else {
            System.out.println("Temperatura rechazada.");
        }

        System.out.println("Temperatura actual: "
                + thermometer.getTemperature() + " °C");


        result = thermometer.setTemperature(120);

        if (result) {
            System.out.println("Temperatura aceptada.");
        } else {
            System.out.println("Temperatura rechazada.");
        }

        System.out.println("Temperatura actual: "
                + thermometer.getTemperature() + " °C");


        result = thermometer.setTemperature(-40);

        if (result) {
            System.out.println("Temperatura aceptada.");
        } else {
            System.out.println("Temperatura rechazada.");
        }

        System.out.println("Temperatura actual: "
                + thermometer.getTemperature() + " °C");


        result = thermometer.setTemperature(-60);

        if (result) {
            System.out.println("Temperatura aceptada.");
        } else {
            System.out.println("Temperatura rechazada.");
        }

        System.out.println("Temperatura actual: "
                + thermometer.getTemperature() + " °C");
    }
}