package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;

public class VehiculoPrinter {
    public void imprimirInformacion(Vehiculo vehiculo) {
        System.out.println("Vehículo:");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAño());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }
}
