

public class Osos extends Mamiferos {

    public Osos(String nombre, String raza, String centroDeResguardo, String tipoDeSangre, 
               boolean tienePelaje, int tiempoDeGestacion) {
        super(nombre, raza, centroDeResguardo, tipoDeSangre, tienePelaje, tiempoDeGestacion);
    }

    public void desplazarse() {
        System.out.println("El oso " + getNombre() + " se está desplazando...");
    }
}