package universidad.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private Profesor profesor;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Estudiante> getTodosEstudiantes() {
        return estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return nombre + " (prof: " + (profesor != null ? profesor.getNombre() : "Sin Profesor") + ")";
    }
}
