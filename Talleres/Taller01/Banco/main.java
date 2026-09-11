package Banco;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" CREAR CUENTA ");

        System.out.print("Ingrese el numero de cuenta: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Ingrese el nombre del titular: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double balance = scanner.nextDouble();

        bankAccount cuenta = new bankAccount(
                accountNumber,
                accountHolder,
                balance
        );

        // Mostrar información de la cuenta
        System.out.println("\n INFORMACION DE LA CUENTA ");
        System.out.println("Numero de cuenta: "
                + cuenta.getAccountNumber());
        System.out.println("Titular: "
                + cuenta.getAccountHolder());
        System.out.println("Saldo: $"
                + cuenta.getBalance());


        // DEPÓSITO
        System.out.println("\nDEPOSITO ");

        System.out.print("Ingrese el valor a depositar: ");
        double depositAmount = scanner.nextDouble();

        boolean resultado = cuenta.deposit(depositAmount);

        if (resultado) {
            System.out.println("Deposito realizado correctamente.");
        } else {
            System.out.println("Deposito rechazado. "
                    + "El valor debe ser mayor que cero.");
        }

        System.out.println("Saldo actual: $"
                + cuenta.getBalance());


        System.out.println("\nRETIRO");

        System.out.print("Ingrese el valor a retirar: ");
        double withdrawAmount = scanner.nextDouble();

        resultado = cuenta.withdraw(withdrawAmount);

        if (resultado) {
            System.out.println("Retiro realizado correctamente.");
        } else {
            System.out.println("Retiro rechazado.");

            if (withdrawAmount <= 0) {
                System.out.println(
                        "El valor del retiro debe ser mayor que cero."
                );
            } else {
                System.out.println(
                        "No existe saldo suficiente."
                );
            }
        }

        System.out.println("Saldo actual: $"
                + cuenta.getBalance());

        System.out.println("\n SALDO FINAL");
        System.out.println("Titular: "
                + cuenta.getAccountHolder());
        System.out.println("Numero de cuenta: "
                + cuenta.getAccountNumber());
        System.out.println("Saldo disponible: $"
                + cuenta.getBalance());

        scanner.close();
    }
}