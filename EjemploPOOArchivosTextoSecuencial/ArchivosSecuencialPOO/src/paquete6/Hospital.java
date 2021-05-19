package paquete6;

public class Hospital {

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String n, int nc, double pr) {
        nombre = n;
        numeroCamas = nc;
        presupuesto = pr;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumCamas(int nc) {
        numeroCamas = nc;
    }

    public void establecerPresupuesto(double pr) {
        presupuesto = pr;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
