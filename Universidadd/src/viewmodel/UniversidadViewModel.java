package universidad.viewmodel;

import universidad.model.Universidad;

public class UniversidadViewModel {
    private Universidad universidad;

    public UniversidadViewModel() {
        this.universidad = new Universidad();
    }

    public void agregarDepartamentoConProfesor(String depto, String prof) {
        universidad.agregarDepartamentoConProfesor(depto, prof);
    }

    public void asignarProfesorADepartamento(String depto, String prof) {
        universidad.asignarProfesorADepartamento(depto, prof);
    }

    public void agregarCursoADepartamento(String depto, String curso) {
        universidad.agregarCursoADepartamento(depto, curso);
    }

    public void agregarEstudiante(String nombreEstudiante) {
        universidad.agregarEstudiante(nombreEstudiante);
    }

    public void inscribirEstudianteEnCurso(String estudiante, String curso) {
        universidad.inscribirEstudianteEnCurso(estudiante, curso);
    }

    public String generarReporteUniversidad() {
        return universidad.generarReporte();
    }
}
