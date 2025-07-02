package universidad.report;

import universidad.model.*;

public class GeneradorReporte {
    public static String generar(Universidad u) {
        StringBuilder sb = new StringBuilder("=== Reporte Universidad ===\n");
        for (Departamento d : u.getDepartamentos()) {
            sb.append("- ").append(d).append("\n");
            for (Curso c : d.getCursos()) {
                sb.append("    * ").append(c).append("\n");
                for (Estudiante e : c.getEstudiantes()) {
                    sb.append("       -> ").append(e.getNombre()).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
