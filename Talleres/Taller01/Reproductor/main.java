package Reproductor;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("REPRODUCTOR MULTIMEDIA");

        System.out.print("Ingrese el volumen inicial: ");
        int volume = scanner.nextInt();

        mediaPlayer reproducer = new mediaPlayer(volume);

        int option = 0;

        while (option != 6) {

            System.out.println("\n MENU");
            System.out.println("1. Consultar estado");
            System.out.println("2. Aumentar volumen");
            System.out.println("3. Disminuir volumen");
            System.out.println("4. Reproducir");
            System.out.println("5. Detener");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();

            if (option == 1) {

                System.out.println("\nVolumen: "
                        + reproducer.getVolume());

                System.out.println("Estado: "
                        + reproducer.getPlaybackState());

            } else if (option == 2) {

                boolean result = reproducer.increaseVolume();

                if (result) {
                    System.out.println("Volumen aumentado.");
                    System.out.println("Volumen actual: "
                            + reproducer.getVolume());
                } else {
                    System.out.println(
                            "No se puede aumentar el volumen. "
                            + "Ya se encuentra en 100."
                    );
                }

            } else if (option == 3) {

                boolean result= reproducer.decreaseVolume();

                if (result) {
                    System.out.println("Volumen disminuido.");
                    System.out.println("Volumen actual: "
                            + reproducer.getVolume());
                } else {
                    System.out.println(
                            "No se puede disminuir el volumen. "
                            + "Ya se encuentra en 0."
                    );

                }

            } else if (option == 4) {

                boolean result = reproducer.play();

                if (result) {
                    System.out.println(
                            "El reproductor ha comenzado a reproducir."
                    );
                } else {
                    System.out.println(
                            "El reproductor ya se encuentra reproduciendo."
                    );
                }

            } else if (option == 5) {

                boolean result = reproducer.stop();

                if (result) {
                    System.out.println(
                            "El reproductor se ha detenido."
                    );
                } else {
                    System.out.println(
                            "El reproductor ya se encuentra detenido."
                    );

                }

            } else if (option == 6) {

                System.out.println("Programa finalizado.");

            } else {

                System.out.println("Opcion no valida.");
            }
        }

        scanner.close();
    }
}