import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Figuras 2D");
            System.out.println("2. Figuras 3D");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    procesarFiguras2D(scanner);
                    break;
                case 2:
                    System.out.println("Opción no implementada (Figuras 3D)");
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        }
    }

    private static void procesarFiguras2D(Scanner scanner) {
        while (true) {
            System.out.println("Seleccione una opción para Figuras 2D:");
            System.out.println("1. Regulares");
            System.out.println("2. Irregulares");
            System.out.println("3. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    procesarFigurasRegulares(scanner);
                    break;
                case 2:
                    System.out.println("Opción no implementada (Figuras Irregulares 2D)");
                    break;
                case 3:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        }
    }

    private static void procesarFigurasRegulares(Scanner scanner) {
        while (true) {
            System.out.println("Seleccione una opción para Figuras Regulares 2D:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Volver al menú de Figuras 2D");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado:");
                    double ladoCuadrado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    cuadrado.mostrarInformacion();
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    rectangulo.mostrarInformacion();
                    break;
                case 3:
                    return; // Volver al menú de Figuras 2D
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        }
    }
}