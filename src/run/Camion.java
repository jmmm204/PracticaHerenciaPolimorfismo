package run;

// Clase camion que hereda de Vehiculo e implementa la interfaz Combustible
public class Camion extends Vehiculo implements Combustible{
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El camion transporta carga pesada por la autopista.");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando diesel en el camión.");
    }
}