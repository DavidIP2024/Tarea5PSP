import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nivel quieres usar? (1 o 4):");
        int nivel = Integer.parseInt(sc.nextLine());

        while (true) {

            System.out.println("Introduce un número (o 'salir' para terminar):");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            int codigo = Lanzador.lanzar(entrada);

            if (nivel == 1) {
                System.out.println("Operación completada. Código de salida: " + codigo);
            } else if (nivel == 4) {

                try {
                    int numero = Integer.parseInt(entrada);

                    if (Lanzador.esPrimo(numero)) {
                        System.out.println("¡" + numero + " es primo!");
                    } else {
                        System.out.println(numero + " no es primo");
                    }

                } catch (NumberFormatException e) {
                    // No hacemos nada si la entrada no es un número.
                }

                System.out.println("Operación completada. Código de salida: " + codigo);
            }
        }

        sc.close();
    }
}