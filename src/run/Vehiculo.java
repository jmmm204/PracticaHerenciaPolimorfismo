package run;

// Clase que define la estructura basica de un vehiculo
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo abstracto que cada subclase debe implementar
    public abstract void mover();

    // Metodo comun para mostrar informacion
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}