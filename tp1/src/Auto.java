package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;

public class Auto extends Vehiculo {
    private int cantidadPasajeros;
 
    public Auto(String patente, String marca, int año, double costo, int cantidadPasajeros) {
        super(patente, marca, año, costo);
        this.cantidadPasajeros = cantidadPasajeros;
    }
 
    public int CantidadPasajeros() {
        return cantidadPasajeros;
    }  

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Cantidad de pasajeros: " + cantidadPasajeros;
    }
}
