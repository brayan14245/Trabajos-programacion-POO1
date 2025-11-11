

public class Mamiferos extends Animales {
    private boolean tienePelaje;
    private int tiempoDeGestacion;

    public Mamiferos(String nombre, String raza, String centroDeResguardo, String tipoDeSangre, 
                    boolean tienePelaje, int tiempoDeGestacion) {
        super(nombre, raza, centroDeResguardo, tipoDeSangre);
        this.tienePelaje = tienePelaje;
        this.tiempoDeGestacion = tiempoDeGestacion;
    }

    public boolean isTienePelaje() { return tienePelaje; }
    public void setTienePelaje(boolean tienePelaje) { this.tienePelaje = tienePelaje; }
    public int getTiempoDeGestacion() { return tiempoDeGestacion; }
    public void setTiempoDeGestacion(int tiempoDeGestacion) { this.tiempoDeGestacion = tiempoDeGestacion; }
}