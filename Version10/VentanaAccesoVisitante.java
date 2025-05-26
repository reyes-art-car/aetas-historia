package Proyecto;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAccesoVisitante extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                VentanaAccesoVisitante frame = new VentanaAccesoVisitante();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public VentanaAccesoVisitante() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // Panel principal
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ///////////////////////////// BOTON ACCEDE - VISITANTE /////////////////////////////////////////////////
        JButton botonAccedeVisitante = new JButton("Accede");
        botonAccedeVisitante.addActionListener(e -> {
            // Aquí puedes abrir otra ventana si lo deseas
        });
        botonAccedeVisitante.setBounds(172, 161, 115, 42);
        contentPane.add(botonAccedeVisitante);

        ///////////////////////////// BOTON REGISTRATE - VISITANTE /////////////////////////////////////////////////
        JButton botonRegistroVisitante = new JButton("Registrate");
        botonRegistroVisitante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Abrir la nueva ventana de RegistroVisitante
                VentanaAccesoVisitante registroVisitante = new  VentanaAccesoVisitante();
                registroVisitante.setVisible(true);

                // Opcional: ocultar esta ventana actual
                setVisible(false);
            }
        });
        botonRegistroVisitante.setBounds(172, 89, 115, 42);

        // Estilo del botón - igual al botón "Administrador"
        botonRegistroVisitante.setBackground(new Color(244, 164, 96)); // Fondo Sandy Brown
        botonRegistroVisitante.setForeground(Color.WHITE);             // Texto blanco
        botonRegistroVisitante.setFont(new Font("Arial", Font.BOLD, 14));
        botonRegistroVisitante.setOpaque(false);
        botonRegistroVisitante.setContentAreaFilled(false); // Hacer fondo transparente
        botonRegistroVisitante.setBorderPainted(true);
        botonRegistroVisitante.setFocusPainted(false);
        botonRegistroVisitante.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado

        contentPane.add(botonRegistroVisitante);

        //////////////////////////// TEXTO TITULO - VISITANTE /////////////////////////////////////////////////
        JLabel enunciadoVisitante = new JLabel("Visitante");
        enunciadoVisitante.setHorizontalAlignment(SwingConstants.CENTER);
        enunciadoVisitante.setForeground(Color.WHITE);
        enunciadoVisitante.setFont(new Font("Times New Roman", Font.BOLD, 18));
        enunciadoVisitante.setBounds(142, 26, 181, 53);
        enunciadoVisitante.setOpaque(false);
        contentPane.add(enunciadoVisitante);

        /////////////////////////////// BOTÓN DE RETROCESO ////////////////////////////////////////////////
        JButton botonRetrocesoventanaPrincipal = new JButton("🢀");
        botonRetrocesoventanaPrincipal.setBounds(10, 211, 55, 42);

        // Acción del botón: ir hacia atrás a VentanaPrincipal
        botonRetrocesoventanaPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar esta ventana actual
                setVisible(false);
                dispose();

                // Abrir la ventana principal
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            }
        });

        contentPane.add(botonRetrocesoventanaPrincipal);
    }
}