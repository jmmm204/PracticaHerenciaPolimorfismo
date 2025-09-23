package run;

public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de Vehiculos
        Vehiculo[] vehiculos = {
                new Carro("Toyota", "Corolla"),
                new Moto("Yamaha", "MT-07"),
                new Camion("Volvo", "FH16")
        };

        // Invocar métodos polimórficamente
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            v.mover();

            // Verificar si implementa la interfaz Combustible
            if (v instanceof Combustible) {
                ((Combustible) v).recargar();
            }

            System.out.println("-------------------------");
        }
    }
}