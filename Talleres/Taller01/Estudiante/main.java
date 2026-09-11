package Estudiante;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" CREAR ESTUDIANTE ");

        System.out.print("Ingrese el codigo del estudiante: ");
        String studentID = scanner.nextLine();

        System.out.print("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese la calificacion 1: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Ingrese la calificacion 2: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Ingrese la calificacion 3: ");
        double grade3 = scanner.nextDouble();

        student estudiante = new student(
                studentID,
                name,
                grade1,
                grade2,
                grade3
        );

        System.out.println("\n INFORMACION DEL ESTUDIANTE ");
        System.out.println("Codigo: " + estudiante.getStudentID());
        System.out.println("Nombre: " + estudiante.getName());
        System.out.println("Calificacion 1: " + estudiante.getGrade1());
        System.out.println("Calificacion 2: " + estudiante.getGrade2());
        System.out.println("Calificacion 3: " + estudiante.getGrade3());
        System.out.println("Promedio: " + estudiante.getAverage());


        scanner.nextLine();

        System.out.println("\n MODIFICAR NOMBRE ");

        System.out.print("Ingrese el nuevo nombre: ");
        String newName = scanner.nextLine();

        boolean resultado = estudiante.setName(newName);

        if (resultado) {
            System.out.println("Nombre modificado correctamente.");
        } else {
            System.out.println("Nombre rechazado. No puede estar vacio.");
        }

        System.out.println("Nombre actual: " + estudiante.getName());


        System.out.println("\n MODIFICAR CALIFICACION 1 ");

        System.out.print("Ingrese la nueva calificacion 1: ");
        double newGrade1 = scanner.nextDouble();

        resultado = estudiante.setGrade1(newGrade1);

        if (resultado) {
            System.out.println("Calificacion modificada correctamente.");
        } else {
            System.out.println("Calificacion rechazada. Debe estar entre 0.0 y 5.0.");
        }

        System.out.println("Calificacion 1 actual: " + estudiante.getGrade1());
        System.out.println("Promedio actual: " + estudiante.getAverage());


        System.out.println("\n MODIFICAR CALIFICACION 2 ");

        System.out.print("Ingrese la nueva calificacion 2: ");
        double newGrade2 = scanner.nextDouble();

        resultado = estudiante.setGrade2(newGrade2);

        if (resultado) {
            System.out.println("Calificacion modificada correctamente.");
        } else {
            System.out.println("Calificacion rechazada. Debe estar entre 0.0 y 5.0.");
        }

        System.out.println("Calificacion 2 actual: " + estudiante.getGrade2());
        System.out.println("Promedio actual: " + estudiante.getAverage());


        System.out.println("\n MODIFICAR CALIFICACION 3 ");

        System.out.print("Ingrese la nueva calificacion 3: ");
        double newGrade3 = scanner.nextDouble();

        resultado = estudiante.setGrade3(newGrade3);

        if (resultado) {
            System.out.println("Calificacion modificada correctamente.");
        } else {
            System.out.println("Calificacion rechazada. Debe estar entre 0.0 y 5.0.");
        }

        System.out.println("Calificacion 3 actual: " + estudiante.getGrade3());
        System.out.println("Promedio actual: " + estudiante.getAverage());


        System.out.println("\n=== INFORMACION FINAL ===");
        System.out.println("Codigo: " + estudiante.getStudentID());
        System.out.println("Nombre: " + estudiante.getName());
        System.out.println("Calificacion 1: " + estudiante.getGrade1());
        System.out.println("Calificacion 2: " + estudiante.getGrade2());
        System.out.println("Calificacion 3: " + estudiante.getGrade3());
        System.out.println("Promedio final: " + estudiante.getAverage());

        scanner.close();
    }
}