
class Estudiante extends Usuario {
    private String nombre;
    private int id;
    private String grupo;
    private Horario horarioClases;

    public Estudiante(String nombre, int id, String password, String grupo) {
        super(nombre, id, password);
        this.nombre = nombre;
        this.id = id;
        this.grupo = grupo;
    }

    public void setHorarioClases(Horario horario) {
        this.horarioClases = horario;
    }

    @Override
    public void logear() {
        System.out.println("Estudiante " + nombre + " inició sesión.");
    }

    @Override
    public void leerNota() {
        System.out.println("Estudiante " + nombre + " está leyendo su nota.");
    }

    public void subirTrabajos() {
        System.out.println("Estudiante " + nombre + " subió un trabajo.");
    }

    public void actualizarInformacion() {
        System.out.println("Estudiante " + nombre + " actualizó su información.");
    }

    @Override
    public String toString() {
        String horarioStr = (horarioClases != null) ? horarioClases.toString() : "N/A";
        return "Estudiante nombre=" + nombre + ", id=" + id + ", grupo=" + grupo + ", horario=" + horarioStr;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }
}
