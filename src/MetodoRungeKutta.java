public class MetodoRungeKutta {

    public static double evaluarFuncion(double x, double y) {
        return x + y;
    }

    public static double[] resolver(double x0, double y0, double xFinal, double h) {
        int nPasos = (int) Math.round((xFinal - x0) / h);

        double[] resultados = new double[nPasos + 1];
        double x = x0;
        double y = y0;

        resultados[0] = y;

        for (int i = 1; i <= nPasos; i++) {

            double k1 = evaluarFuncion(x, y);

            double k2 = evaluarFuncion(
                    x + h / 2.0,
                    y + h * k1 / 2.0);

            double k3 = evaluarFuncion(
                    x + h / 2.0,
                    y + h * k2 / 2.0);

            double k4 = evaluarFuncion(
                    x + h,
                    y + h * k3);

            y += h * (k1 + 2*k2 + 2*k3 + k4) / 6.0;

            x = x0 + i * h;
            resultados[i] = y;
        }

        return resultados;
    }

    public static double solucionExacta(double x) {
        return 2.0 * Math.exp(x) - x - 1.0;
    }

    public static void imprimirTabla(double h) {
        int n = (int) Math.round(0.3 / h);
        double[] valores = resolver(0.0, 1.0, 0.3, h);

        System.out.printf("%nMETODO RUNGE-KUTTA 4, h = %.2f%n", h);
        System.out.printf("%8s %14s %14s %14s%n",
                "x", "y RK4", "Exacta", "Error");

        for (int i = 0; i <= n; i++) {
            double x = i * h;
            double exacta = solucionExacta(x);

            System.out.printf("%8.2f %14.8f %14.8f %14.8f%n",
                    x, valores[i], exacta,
                    Math.abs(exacta - valores[i]));
        }
    }
}
