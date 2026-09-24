import java.io.IOException;

public class Lanzador {

    public static int lanzar(String numero) {

        try {
            ProcessBuilder pb = new ProcessBuilder("factor", numero);
            pb.inheritIO();

            Process proceso = pb.start();

            return proceso.waitFor();

        } catch (IOException | InterruptedException e) {
            return -1;
        }
    }

    public static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}