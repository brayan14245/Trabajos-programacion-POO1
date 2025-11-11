

public class Animales {
    private String nombre;
    private String raza;
    private String centroDeResguardo;
    private String tipoDeSangre;

    public Animales(String nombre, String raza, String centroDeResguardo, String tipoDeSangre) {
        this.nombre = nombre;
        this.raza = raza;
        this.centroDeResguardo = centroDeResguardo;
        this.tipoDeSangre = tipoDeSangre;
    }

    public void generarSonido() {
        System.out.println("Generando sonido...");
    }

    public void comerComida() {
        System.out.println("Comiendo comida...");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    public String getCentroDeResguardo() { return centroDeResguardo; }
    public void setCentroDeResguardo(String centroDeResguardo) { this.centroDeResguardo = centroDeResguardo; }
    public String getTipoDeSangre() { return tipoDeSangre; }
    public void setTipoDeSangre(String tipoDeSangre) { this.tipoDeSangre = tipoDeSangre; }
}