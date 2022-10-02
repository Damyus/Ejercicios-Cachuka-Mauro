public class Variables {
    public static void main (String[] args) {
        int hamburguesas = 6;
        int personas = 2;
        int hamburguesasPorpersonas = hamburguesas / personas;

        System.out.printf("Si hay %d hamburguesas y %d personas, entonces le tocan %d de hamburguesas a cada persona\n", hamburguesas, personas, hamburguesasPorpersonas);

        String auto = "Lamborghini";
        Double velocidad = 90.3;

        System.out.printf("el %s se desplaza a %f km/h\n", auto, velocidad);

        int precioleche = 14;
        double preciojamon = 20.5;
        int precioqueso= 15;

        double preciototal = precioleche + preciojamon + precioqueso;
        System.out.printf("el precio total de las compras es de %s", preciototal);


    }
}
