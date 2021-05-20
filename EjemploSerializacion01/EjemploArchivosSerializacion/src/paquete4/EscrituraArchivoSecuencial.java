package paquete4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Hospital registroHos;
    private ArrayList<Hospital> listaHos;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaHos();

        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));

            if (obtenerListaHos().size() > 0) {
                for (int i = 0; i < obtenerListaHos().size(); i++) {
                    establecerRegistroHos(obtenerListaHos().get(i));
                    establecerSalida();
                }
            }
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroHos(Hospital h) {
        registroHos = h;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroHos);

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaHos() {
        LecturaArchivoSecuencial h = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        h.establecerHospitales();
        listaHos = h.obtenerHospitales();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Hospital> obtenerListaHos() {
        return listaHos;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        }
    }

}
