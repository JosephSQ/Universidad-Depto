package universidad.model;

import java.util.ArrayList;
import java.util.List;
import universidad.report.GeneradorReporte;

public class Universidad {
    private List<Departamento> departamentos;
    private List<Estudiante> estudiantes; // mantiene registro global de estudiantes

    public Universidad() {
        this.departamentos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    // Composición: Universidad crea departamentos con profesor
    public void agregarDepartamentoConProfesor(String nombreDepto, String nombreProfesor) {
        Departamento depto = new Departamento(nombreDepto);
        depto.asignarProfesor(new Profesor(nombreProfesor));
        departamentos.add(depto);
    }

    // Agregación explícita: profesor a depto ya existente
    public void asignarProfesorADepartamento(String nombreDepto, String nombreProfesor) {
        Departamento depto = buscarDepartamento(nombreDepto);
        if (depto != null) {
            depto.asignarProfesor(new Profesor(nombreProfesor));
        }
    }

    // Asociación: crear estudiante aislado
    public void agregarEstudiante(String nombreEstudiante) {
        estudiantes.add(new Estudiante(nombreEstudiante));
    }

    // Asociación: agregar curso a depto
    public void agregarCursoADepartamento(String nombreDepto, String nombreCurso) {
        Departamento depto = buscarDepartamento(nombreDepto);
        if (depto == null) {
            depto = new Departamento(nombreDepto);
            departamentos.add(depto);
        }
        depto.agregarCurso(new Curso(nombreCurso));
    }

    // Asociación bidireccional
    public void inscribirEstudianteEnCurso(String nombreEst, String nombreCurso) {
        Estudiante estudiante = buscarOcrearEstudiante(nombreEst);
        Curso curso = buscarOcrearCurso(nombreCurso);

        estudiante.inscribirEnCurso(curso);
        curso.inscribirEstudiante(estudiante);
    }

    // Dependencia
    public String generarReporte() {
        return GeneradorReporte.generar(this);
    }

    // Métodos auxiliares
    private Departamento buscarDepartamento(String nombre) {
        for (Departamento d : departamentos)
            if (d.getNombre().equalsIgnoreCase(nombre))
                return d;
        return null;
    }

    private Estudiante buscarOcrearEstudiante(String nombre) {
        for (Estudiante e : estudiantes)
            if (e.getNombre().equalsIgnoreCase(nombre))
                return e;
        Estudiante nuevo = new Estudiante(nombre);
        estudiantes.add(nuevo);
        return nuevo;
    }

    private Curso buscarOcrearCurso(String nombreCurso) {
        for (Departamento d : departamentos)
            for (Curso c : d.getCursos())
                if (c.getNombre().equalsIgnoreCase(nombreCurso))
                    return c;
        if (departamentos.isEmpty()) {
            Departamento depto = new Departamento("Depto Default");
            departamentos.add(depto);
        }
        Curso nuevo = new Curso(nombreCurso);
        departamentos.get(0).agregarCurso(nuevo);
        return nuevo;
    }

    // Getters
    public List<Departamento> getDepartamentos() { return departamentos; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}
