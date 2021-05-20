package paquete4;

public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.data";

        Hospital h1 = new Hospital("Hospital General Zaruma", 150, 8000.00);
        Hospital h2 = new Hospital("Hospital Isisdro Ayora", 300, 1500.00);
        Hospital h3 = new Hospital("Hospital Alberto Santos", 100, 5000.00);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        archivo.establecerRegistroHos(h1);
        archivo.establecerSalida();
        archivo.establecerRegistroHos(h2);
        archivo.establecerSalida();
        archivo.establecerRegistroHos(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);

    }
}
