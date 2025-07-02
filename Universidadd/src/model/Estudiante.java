package universidad.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Curso> cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void inscribirEnCurso(Curso c) {
        if (!cursos.contains(c))
            cursos.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return nombre + " inscrito en " + cursos.size() + " cursos";
    }
}

