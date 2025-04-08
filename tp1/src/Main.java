package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;

public class Main {
    public Main() {
    }
 
    public static void main(String[] var0) {
       Vehiculo var1 = new Vehiculo("ABC123", "Ford", 2020, 1500.0);
       Vehiculo var2 = new Vehiculo("XYZ789", "Chevrolet", 2021, 1200.0);
       Vehiculo var3 = new Vehiculo("LMN456", "Toyota", 2022, 1000.0);
       var1.mostrarInformacion();
       System.out.println();
       var2.mostrarInformacion();
       System.out.println();
       var3.mostrarInformacion();
    }
 }
