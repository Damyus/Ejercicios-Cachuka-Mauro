import java.util.Scanner;

public class AdivinaelNumero {
    private Scanner Entrada = new Scanner(System.in);
    private boolean juegoactivo = true;

    public void jugar() {
        System.out.println("Hola, cuál es tu nombre?");
        String nombrejugador = Entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n", nombrejugador);

        while(juegoactivo) {
            int intentos = 0;
            int min = 0;
            int max = 100;
            int numerojuego = (int) (Math.random() * ((max - min) + 1));

            System.out.printf("%s, he esogido un numero entre %d y %d, adivinalo\n", nombrejugador, min, max);
            int numerojugador;
            do {
                System.out.println("escoge un numero");
                numerojugador = Entrada.nextInt();
                if (numerojuego < numerojugador) {
                    System.out.println("muy alto, adivina otra vez");
                } else if(numerojuego > numerojugador) {
                    System.out.println("muy bajo, adivina otra vez");
                }
                intentos++;
            } while (numerojuego != numerojugador);




            juegoactivo = false;
        }

    }
}
