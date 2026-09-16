import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora miCalculadora = new Calculadora("Calculadora Básica POO");
        int opcion = 0;

        String[] funciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        System.out.println("Funciones disponibles en esta calculadora:");
        for (int i = 0; i < funciones.length; i++) {
            System.out.println("- " + funciones[i]);
        }
        System.out.println(); // Salto de línea

        do {
            System.out.println("=================================");
            System.out.println("	SISTEMA DE CALCULADORA");
            System.out.println("=================================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Mostrar historial");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = Double.parseDouble(scanner.nextLine());

                    switch (opcion) {
                        case 1:
                            System.out.println("Resultado: " + miCalculadora.sumar(num1, num2));
                            break;
                        case 2:
                            System.out.println("Resultado: " + miCalculadora.restar(num1, num2));
                            break;
                        case 3:
                            System.out.println("Resultado: " + miCalculadora.multiplicar(num1, num2));
                            break;
                        case 4:
                            // Error 2: atrapar la excepción personalizada
                            try {
                                System.out.println("Resultado: " + miCalculadora.dividir(num1, num2));
                            } catch (DivisionPorCeroException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                } else if (opcion == 5) {
                    miCalculadora.mostrarHistorial();
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }

        } while (opcion != 6);

        System.out.println("Saliendo de la calculadora...");
        scanner.close();
    }
}

    
 