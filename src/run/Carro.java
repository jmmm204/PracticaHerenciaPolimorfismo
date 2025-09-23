package run;

// Clase carro que hereda de la clase Vehiculo e implementa la interfaz Combustible
public class Carro extends Vehiculo implements Combustible {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El carro se desplaza por la carretera.");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando gasolina en el carro.");
    }
}