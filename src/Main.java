import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("CALCULADORA DE FIGURAS GEOMETRICAS ");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("Seleccione una figura: ");
            int opcionFigura = scanner.nextInt();

            if (opcionFigura == 6) {
                continuar = false;
                System.out.println("Gracias por usar la calculadora.");
                continue;
            }

            if (opcionFigura < 1 || opcionFigura > 5) {
                System.out.println("Opción inválida.");
                continue;
            }

            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Calcular Área");
            System.out.println("2. Calcular Perímetro");
            System.out.print("Seleccione una operación: ");
            int opcionOperacion = scanner.nextInt();

            if (opcionOperacion < 1 || opcionOperacion > 2) {
                System.out.println("Opción inválida.");
                continue;
            }

            double resultado = 0;

            switch (opcionFigura) {
                case 1: // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        resultado = Math.PI * radio * radio;
                        System.out.printf("Área del círculo: %.2f\n", resultado);
                    } else {
                        resultado = 2 * Math.PI * radio;
                        System.out.printf("Perímetro del círculo: %.2f\n", resultado);
                    }
                    break;

                case 2: // Cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        resultado = lado * lado;
                        System.out.printf("Área del cuadrado: %.2f\n", resultado);
                    } else {
                        resultado = 4 * lado;
                        System.out.printf("Perímetro del cuadrado: %.2f\n", resultado);
                    }
                    break;

                case 3: // Triángulo
                    if (opcionOperacion == 1) {
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = scanner.nextDouble();
                        resultado = 0.5 * base * altura;
                        System.out.printf("Área del triángulo: %.2f\n", resultado);
                    } else {
                        System.out.print("Ingrese el primer lado del triángulo: ");
                        double lado1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo lado del triángulo: ");
                        double lado2 = scanner.nextDouble();
                        System.out.print("Ingrese el tercer lado del triángulo: ");
                        double lado3 = scanner.nextDouble();
                        resultado = lado1 + lado2 + lado3;
                        System.out.printf("Perímetro del triángulo: %.2f\n", resultado);
                    }
                    break;

                case 4: // Rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaR = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        resultado = baseR * alturaR;
                        System.out.printf("Área del rectángulo: %.2f\n", resultado);
                    } else {
                        resultado = 2 * (baseR + alturaR);
                        System.out.printf("Perímetro del rectángulo: %.2f\n", resultado);
                    }
                    break;

                case 5: // Pentágono
                    System.out.print("Ingrese el lado del pentágono: ");
                    double ladoP = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        resultado = (5 * ladoP * ladoP) / (4 * Math.tan(Math.PI / 5));
                        System.out.printf("Área del pentágono: %.2f\n", resultado);
                    } else {
                        resultado = 5 * ladoP;
                        System.out.printf("Perímetro del pentágono: %.2f\n", resultado);
                    }
                    break;
            }
        }
    }
}