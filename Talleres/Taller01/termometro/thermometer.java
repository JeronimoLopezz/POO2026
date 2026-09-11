package termometro;
/*Se requiere representar un termómetro digital que mantiene la temperatura actual (temperature) 
expresada en grados Celsius. El dispositivo solamente puede registrar temperaturas entre -50 °C y 100 °C.
La temperatura puede ser consultada en cualquier momento. Cuando se intenta registrar una nueva temperatura, 
el dispositivo debe verificar que se encuentre dentro del rango permitido. 
Si el valor no es válido, la temperatura almacenada debe conservarse sin modificaciones. */

public class thermometer {

    private double temperature;

    public thermometer(double temperature) {
        if (temperature >= -50 && temperature <= 100) {
            this.temperature = temperature;
        } else {
            this.temperature = 0;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean setTemperature(double nuevaTemperatura) {

        if (nuevaTemperatura >= -50 && nuevaTemperatura <= 100) {
            temperature = nuevaTemperatura;
            return true;
        } else {
            return false;
        }
    }
}