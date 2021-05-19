package paquete6;

import java.util.ArrayList;

public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.txt";
        Hospital h1 = new Hospital("Hospital General Zaruma", 150, 8000.00);
        Hospital h2 = new Hospital("Hospital Isisdro Ayora", 300, 1500.00);
        Hospital h3 = new Hospital("Hospital Alberto Santos", 100, 5000.00);

        ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
        // establecer el valor del atributo registro
        escritura.establecerRegistro(h1);
        escritura.establecerSalida();

        escritura.establecerRegistro(h2);
        escritura.establecerSalida();

        escritura.establecerRegistro(h3);
        escritura.establecerSalida();
        // estabalecer en el archivo el atributo del registro

        escritura.cerrarArchivo();

        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
