package paquete4;

import java.io.Serializable;

public class Hospital implements Serializable {

    String nombre;
    int numCamas;
    double presup;

    public Hospital(String n, int nc, double pr) {
        nombre = n;
        numCamas = nc;
        presup = pr;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumCamas(int nc) {
        numCamas = nc;
    }

    public void establecerPresupuesto(double pr) {
        presup = pr;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumCamas() {
        return numCamas;
    }

    public double obtenerPresupuesto() {
        return presup;
    }

}
