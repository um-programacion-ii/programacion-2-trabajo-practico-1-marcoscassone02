package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;

public class Camion extends Vehiculo {
    private boolean tieneAcoplado;
 
    public Camion(String patente, String marca, int año, double costo, boolean tieneAcoplado) {
        super(patente, marca, año, costo);
        this.tieneAcoplado = tieneAcoplado;
    }
 
    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }
 }
