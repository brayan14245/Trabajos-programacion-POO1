

public class MainZoo {
    public static void main(String[] args) {
    
        Cuidador cuidador = new Cuidador("Bloque A", "Mamíferos");
        cuidador.alimentarAnimal();
        cuidador.cuidarAnimal();

        Director director = new Director("Juan Pérez", "Director General");
        director.administrarZoo();
        director.darInstrucciones();

        Leones leon = new Leones("León africano", "Panthera leo", "Zona Sur", "Caliente", true, 4);
        leon.rugir();
        leon.cazar();
        leon.comerComida();

        Osos oso = new Osos("Oso Pardo", "Ursus arctos", "Zona Norte", "Caliente", true, 7);
        oso.desplazarse();
        oso.comerComida();

        Tortugas tortuga = new Tortugas("Tortuga Marina", "Chelonioidea", "Acuario", "Fría", 
                                      "Queratinosas", 25.5, true);
        tortuga.termoregularse();
        tortuga.interactuarConOtros();

        Serpientes serpiente = new Serpientes("Serpiente Cascabel", "Crotalus", "Terrario", 
                                            "Fría", "Escuteladas", 28.0);
        serpiente.arrastrarse();
        serpiente.generarSonido();
    }
}