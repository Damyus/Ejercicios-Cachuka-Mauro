import java.util.Scanner;

public class AdivinaelNumero {
    private Scanner Entrada = new Scanner(System.in);
    private boolean juegoactivo = true;

    public void jugar() {
        System.out.println("Hola, cuál es tu nombre?");
        String nombrejugador = Entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n");

        while(juegoactivo);
        int min = 0;
        int max = 100;
        int numerojuego = (int) Math.random() * ((max - min) + 1);

        System.out.println(juegoactivo);
        juegoactivo = false;

    }
}
