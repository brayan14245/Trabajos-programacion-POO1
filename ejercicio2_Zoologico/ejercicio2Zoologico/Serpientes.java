

public class Serpientes extends Reptiles {

    public Serpientes(String nombre, String raza, String centroDeResguardo, String tipoDeSangre, 
                     String tipoDeEscamas, double temperaturaCorporal) {
        super(nombre, raza, centroDeResguardo, tipoDeSangre, tipoDeEscamas, temperaturaCorporal);
    }

    public void arrastrarse() {
        System.out.println("La serpiente " + getNombre() + " se está arrastrando...");
    }
}