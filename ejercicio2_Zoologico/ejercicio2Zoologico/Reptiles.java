

public class Reptiles extends Animales {
    private String tipoDeEscamas;
    private double temperaturaCorporal;

    public Reptiles(String nombre, String raza, String centroDeResguardo, String tipoDeSangre, 
                   String tipoDeEscamas, double temperaturaCorporal) {
        super(nombre, raza, centroDeResguardo, tipoDeSangre);
        this.tipoDeEscamas = tipoDeEscamas;
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getTipoDeEscamas() { return tipoDeEscamas; }
    public void setTipoDeEscamas(String tipoDeEscamas) { this.tipoDeEscamas = tipoDeEscamas; }
    public double getTemperaturaCorporal() { return temperaturaCorporal; }
    public void setTemperaturaCorporal(double temperaturaCorporal) { this.temperaturaCorporal = temperaturaCorporal; }
}