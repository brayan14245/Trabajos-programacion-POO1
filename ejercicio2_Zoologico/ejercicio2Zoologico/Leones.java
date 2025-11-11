

public class Leones extends Mamiferos {
    
    public Leones(String nombre, String raza, String centroDeResguardo, String tipoDeSangre, 
                 boolean tienePelaje, int tiempoDeGestacion) {
        super(nombre, raza, centroDeResguardo, tipoDeSangre, tienePelaje, tiempoDeGestacion);
    }
    
    public void rugir() {
        System.out.println("El león " + getNombre() + " está rugiendo fuertemente...");
    }
    
    public void cazar() {
        System.out.println("El león " + getNombre() + " está cazando...");
    }
}