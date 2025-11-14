public class Hipoteca {
    private int monto;
    private int anios;
    private int tasaInteres; // anual

    public Hipoteca(int monto, int anios, int tasaInteres) {
        this.monto = monto;
        this.anios = anios;
        this.tasaInteres = tasaInteres;
    }

    public double calcularPagoMensual() {
        double P = monto;
        double i = (tasaInteres / 100.0) / 12;
        int n = anios / 12;
        double M = P * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);

        return M;
    }

    public double calcularCostoTotal() {
        double pagoMensual = calcularPagoMensual();
        int n = anios/12;

        return pagoMensual * n;
    }
    public void evaluarRiesgo() {
        if (monto > 500.000 | anios > 30) {
            System.out.println("Alto Riesgo");
        } else if (monto > 200.000 & anios > 15) {
            System.out.println("Riesgo Moderado");
        } else {
            System.out.println("Bajo Riesgo");
        }
    }
}

