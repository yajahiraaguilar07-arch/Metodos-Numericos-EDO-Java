public class Main {

    public static void main(String[] args) {

        double[] pasosEuler = {0.1, 0.05, 0.01};

        System.out.println("ACTIVIDAD UNIDAD 6");
        System.out.println("RESOLUCION NUMERICA DE EDOs");

        System.out.println("\nMetodo de Euler:");
        System.out.println("y' = x - y, y(0) = 1");

        for (double h : pasosEuler) {
            MetodoEuler.imprimirTabla(h);
        }

        System.out.println("\nMetodo Runge-Kutta de cuarto orden:");
        System.out.println("y' = x + y, y(0) = 1");

        MetodoRungeKutta.imprimirTabla(0.1);
    }
}
