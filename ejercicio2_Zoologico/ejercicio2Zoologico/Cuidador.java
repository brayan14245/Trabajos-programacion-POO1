
public class Cuidador {
    private String bloqueAdministrado;
    private String especializacion;

    public Cuidador(String bloqueAdministrado, String especializacion) {
        this.bloqueAdministrado = bloqueAdministrado;
        this.especializacion = especializacion;
    }

    public void alimentarAnimal() {
        System.out.println("Cuidador del bloque " + bloqueAdministrado + " está alimentando animales...");
    }

    public void cuidarAnimal() {
        System.out.println("Cuidador especializado en " + especializacion + " está cuidando animales...");
    }

    public String getBloqueAdministrado() { return bloqueAdministrado; }
    public void setBloqueAdministrado(String bloqueAdministrado) { this.bloqueAdministrado = bloqueAdministrado; }
    public String getEspecializacion() { return especializacion; }
    public void setEspecializacion(String especializacion) { this.especializacion = especializacion; }
}