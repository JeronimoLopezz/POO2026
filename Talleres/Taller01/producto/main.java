package producto;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir información inicial del producto
        System.out.println("=== CREAR PRODUCTO ===");

        System.out.print("Ingrese el nombre del producto: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double price = scanner.nextDouble();

        System.out.print("Ingrese la cantidad disponible: ");
        int stock = scanner.nextInt();

        // Crear el producto
        product producto = new product(name, price, stock);

        System.out.println("\n=== PRODUCTO CREADO ===");
        System.out.println("Nombre: " + producto.getName());
        System.out.println("Precio: $" + producto.getPrice());
        System.out.println("Stock: " + producto.getStock());


        // Modificar nombre
        System.out.println("\n=== MODIFICAR NOMBRE ===");

        scanner.nextLine();

        System.out.print("Ingrese el nuevo nombre: ");
        String newName = scanner.nextLine();

        boolean resultado = producto.setName(newName);

        if (resultado) {
            System.out.println("Nombre modificado correctamente.");
        } else {
            System.out.println("Nombre rechazado. No puede estar vacío.");
        }

        System.out.println("Nombre actual: " + producto.getName());


        // Modificar precio
        System.out.println("\n=== MODIFICAR PRECIO ===");

        System.out.print("Ingrese el nuevo precio: ");
        double newPrice = scanner.nextDouble();

        resultado = producto.setPrice(newPrice);

        if (resultado) {
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("Precio rechazado. Debe ser mayor que 0.");
        }

        System.out.println("Precio actual: $" + producto.getPrice());


        // Modificar stock
        System.out.println("\n=== MODIFICAR STOCK ===");

        System.out.print("Ingrese el nuevo stock: ");
        int newStock = scanner.nextInt();

        resultado = producto.setStock(newStock);

        if (resultado) {
            System.out.println("Stock modificado correctamente.");
        } else {
            System.out.println("Stock rechazado. No puede ser negativo.");
        }

        System.out.println("Stock actual: " + producto.getStock());

        scanner.close();
    }
}