

public class Director {
    private String nombre;
    private String rol;

    public Director(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void administrarZoo() {
        System.out.println("Director " + nombre + " está administrando el zoo...");
    }

    public void modificarPreciosDeBoleto() {
        System.out.println("Modificando precios de boleto...");
    }

    public void darInstrucciones() {
        System.out.println("Director " + nombre + " está dando instrucciones...");
    }

    public void peticionDeAnimalesNuevos() {
        System.out.println("Solicitando animales nuevos...");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}