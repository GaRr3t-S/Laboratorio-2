// Universidad del valle Guatemala
// Programación orientada a objetos
// Gabriel Soto 23900

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la ruta del archivo: ");
        String ruta = scanner.nextLine(); // Aquí se guarda la ruta ingresada en la variable "ruta"

        // Puedes usar la variable "ruta" en tu programa según sea necesario

        // Por ejemplo, para mostrar la ruta ingresada:
        System.out.println("Ruta ingresada: " + ruta);

        // Cerrar el Scanner al finalizar
        scanner.close();
    }
}



