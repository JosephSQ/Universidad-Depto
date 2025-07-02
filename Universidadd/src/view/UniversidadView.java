package universidad.view;

import universidad.viewmodel.UniversidadViewModel;

import javax.swing.*;
import java.awt.*;

public class UniversidadView extends JFrame {
    private UniversidadViewModel viewModel;
    private JTextArea textArea;

    public UniversidadView(UniversidadViewModel viewModel) {
        this.viewModel = viewModel;
        setTitle("Sistema de Universidad");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setEditable(false);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttons = new JPanel(new GridLayout(3, 2, 10, 10));

        JButton btnAgregarDepto = new JButton("Agregar Depto con Profesor");
        btnAgregarDepto.addActionListener(e -> {
            String depto = JOptionPane.showInputDialog("Nombre del Depto:");
            String prof = JOptionPane.showInputDialog("Nombre del Profesor:");
            viewModel.agregarDepartamentoConProfesor(depto, prof);
            mostrar("Departamento con Profesor agregado.");
        });

        JButton btnAsignarProf = new JButton("Asignar Profesor a Depto");
        btnAsignarProf.addActionListener(e -> {
            String depto = JOptionPane.showInputDialog("Nombre del Depto:");
            String prof = JOptionPane.showInputDialog("Nombre del Profesor:");
            viewModel.asignarProfesorADepartamento(depto, prof);
            mostrar("Profesor asignado.");
        });

        JButton btnAgregarCurso = new JButton("Agregar Curso");
        btnAgregarCurso.addActionListener(e -> {
            String depto = JOptionPane.showInputDialog("Nombre del Depto:");
            String curso = JOptionPane.showInputDialog("Nombre del Curso:");
            viewModel.agregarCursoADepartamento(depto, curso);
            mostrar("Curso agregado.");
        });

        JButton btnAgregarEst = new JButton("Agregar Estudiante");
        btnAgregarEst.addActionListener(e -> {
            String est = JOptionPane.showInputDialog("Nombre del Estudiante:");
            viewModel.agregarEstudiante(est);
            mostrar("Estudiante agregado.");
        });

        JButton btnInscribirEst = new JButton("Inscribir Estudiante en Curso");
        btnInscribirEst.addActionListener(e -> {
            String est = JOptionPane.showInputDialog("Nombre del Estudiante:");
            String curso = JOptionPane.showInputDialog("Nombre del Curso:");
            viewModel.inscribirEstudianteEnCurso(est, curso);
            mostrar("Estudiante inscrito en curso.");
        });

        JButton btnReporte = new JButton("Generar Reporte Universidad");
        btnReporte.addActionListener(e -> mostrar(viewModel.generarReporteUniversidad()));

        buttons.add(btnAgregarDepto);
        buttons.add(btnAsignarProf);
        buttons.add(btnAgregarCurso);
        buttons.add(btnAgregarEst);
        buttons.add(btnInscribirEst);
        buttons.add(btnReporte);

        panel.add(buttons, BorderLayout.SOUTH);
        add(panel);
        setVisible(true);
    }

    private void mostrar(String msg) {
        textArea.append(msg + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UniversidadView(new UniversidadViewModel()));
    }
}
