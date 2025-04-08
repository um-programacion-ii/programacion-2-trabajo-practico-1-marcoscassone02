package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Vehiculo var1 = new Vehiculo("ABC123", "Ford", 2020, 1500.0);
        Vehiculo var2 = new Vehiculo("XYZ789", "Chevrolet", 2021, 1200.0);
        Vehiculo var3 = new Vehiculo("LMN456", "Toyota", 2022, 1000.0);
        Vehiculo var4 = new Camion("CAM456", "Volvo", 2018, 5000.0, true);

        VehiculoPrinter printer = new VehiculoPrinter();

        printer.imprimirInformacion(var1);
        System.out.println();
        printer.imprimirInformacion(var2);
        System.out.println();
        printer.imprimirInformacion(var3);
        System.out.println();
        printer.imprimirInformacion(var4);
    }
}

