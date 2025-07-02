package universidad.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) {
        if (!estudiantes.contains(e))
            estudiantes.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public String toString() {
        return nombre + " (" + estudiantes.size() + " estudiantes)";
    }
}
