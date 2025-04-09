package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("ABC123", "Toyota", 2023, 1500.0, 5));
        vehiculos.add(new Camion("DEF456", "Volvo", 2020, 5000.0, true));
        vehiculos.add(new Auto("GHI789", "Ford", 2022, 1300.0, 4));

        VehiculoPrinter printer = new VehiculoPrinter();

        for (Vehiculo v : vehiculos) {
            printer.imprimirInformacion(v);
            System.out.println();
        }
    }
}


