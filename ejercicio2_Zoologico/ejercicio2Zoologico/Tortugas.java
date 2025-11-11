

public class Tortugas extends Reptiles {
    private boolean territorial;

    public Tortugas(String nombre, String raza, String centroDeResguardo, String tipoDeSangre, 
                   String tipoDeEscamas, double temperaturaCorporal, boolean territorial) {
        super(nombre, raza, centroDeResguardo, tipoDeSangre, tipoDeEscamas, temperaturaCorporal);
        this.territorial = territorial;
    }

    public void termoregularse() {
        System.out.println("La tortuga " + getNombre() + " se está termorregulando...");
    }

    public void interactuarConOtros() {
        System.out.println("La tortuga " + getNombre() + " está interactuando con otros animales...");
    }

    public boolean isTerritorial() { return territorial; }
    public void setTerritorial(boolean territorial) { this.territorial = territorial; }
}