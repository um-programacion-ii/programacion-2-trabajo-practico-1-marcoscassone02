package programacion_2_trabajo_practico_1_marcoscassone02.tp1.src;

public class Vehiculo {
    private String patente;
    private String marca;
    private int año;
    private double capacidadCargaKg;
 
    public Vehiculo(String var1, String var2, int var3, double var4) {
       this.patente = var1;
       this.marca = var2;
       this.año = var3;
       this.capacidadCargaKg = var4;
    }
 
    public String getPatente() {
       return this.patente;
    }
 
    public void setPatente(String var1) {
       this.patente = var1;
    }
 
    public String getMarca() {
       return this.marca;
    }
 
    public void setMarca(String var1) {
       this.marca = var1;
    }
 
    public int getAño() {
       return this.año;
    }
 
    public void setAño(int var1) {
       this.año = var1;
    }
 
    public double getCapacidadCargaKg() {
       return this.capacidadCargaKg;
    }
 
    public void setCapacidadCargaKg(double var1) {
       this.capacidadCargaKg = var1;
    }
 
    public void mostrarInformacion() {
       System.out.println("Vehículo:");
       System.out.println("Patente: " + this.patente);
       System.out.println("Marca: " + this.marca);
       System.out.println("Año: " + this.año);
       System.out.println("Capacidad de carga: " + this.capacidadCargaKg + " kg");
    }
 }
 
