// src/vista/Ventana3.java
package vista;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import modelo.ConexionMySQL;
import modelo.Usuario;

public class Ventana3 extends JFrame {
    private final ConexionMySQL conexion;

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField rellenar_Nombre;
    private JTextField rellenar_Apellidos;
    private JTextField rellenar_CorreoElectronico;

    /**
     * Create the frame.
     */
    public Ventana3(ConexionMySQL conexion) {
        this.conexion = conexion;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 440);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel titulo_AetasHistoria = new JLabel("Aetas Historia");
        titulo_AetasHistoria.setForeground(Color.WHITE);
        titulo_AetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo_AetasHistoria.setBounds(246, 22, 300, 60);
        contentPane.add(titulo_AetasHistoria);

        JLabel titulo_Registarte = new JLabel("Regístrate");
        titulo_Registarte.setForeground(Color.WHITE);
        titulo_Registarte.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo_Registarte.setBounds(275, 78, 300, 60);
        contentPane.add(titulo_Registarte);

        JLabel titulo_Nombre = new JLabel("Usuario");
        titulo_Nombre.setForeground(Color.WHITE);
        titulo_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo_Nombre.setBounds(43, 134, 100, 60);
        contentPane.add(titulo_Nombre);

        JLabel titulo_Apellidos = new JLabel("Contraseña");
        titulo_Apellidos.setForeground(Color.WHITE);
        titulo_Apellidos.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo_Apellidos.setBounds(43, 194, 120, 60);
        contentPane.add(titulo_Apellidos);

        JLabel titulo_CorreoElectronico = new JLabel("Correo Electrónico");
        titulo_CorreoElectronico.setForeground(Color.WHITE);
        titulo_CorreoElectronico.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo_CorreoElectronico.setBounds(0, 246, 169, 60);
        contentPane.add(titulo_CorreoElectronico);

        rellenar_Nombre = new JTextField();
        rellenar_Nombre.setColumns(10);
        rellenar_Nombre.setBounds(178, 148, 359, 37);
        contentPane.add(rellenar_Nombre);

        rellenar_Apellidos = new JTextField();
        rellenar_Apellidos.setColumns(10);
        rellenar_Apellidos.setBounds(178, 205, 359, 37);
        contentPane.add(rellenar_Apellidos);

        rellenar_CorreoElectronico = new JTextField();
        rellenar_CorreoElectronico.setColumns(10);
        rellenar_CorreoElectronico.setBounds(179, 260, 359, 37);
        contentPane.add(rellenar_CorreoElectronico);

        JButton boton_Registrate = new JButton("Regístrate");
        boton_Registrate.setForeground(Color.WHITE);
        boton_Registrate.setFont(new Font("Times New Roman", Font.BOLD, 16));
        boton_Registrate.setFocusPainted(false);
        boton_Registrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        boton_Registrate.setBorderPainted(false);
        boton_Registrate.setBackground(Color.GRAY);
        boton_Registrate.setBounds(298, 317, 145, 62);
        contentPane.add(boton_Registrate);

        boton_Registrate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = rellenar_Nombre.getText().trim();
                String password = rellenar_Apellidos.getText().trim();
                String email = rellenar_CorreoElectronico.getText().trim();

                // Validar campos no vacíos
                if (nombre.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Por favor, rellena todos los campos.",
                        "Datos inválidos",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                // Validar formato de correo: debe contener '@'
                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(
                        null,
                        "El campo correo debe contener una '@' válida.",
                        "Error en correo",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (Usuario.validator(nombre, password, email)) {
                    if (!conexion.userExist(nombre)) {
                        conexion.register(nombre, email, password);
                        JOptionPane.showMessageDialog(
                            null,
                            "El usuario se ha registrado correctamente.",
                            "Registro exitoso",
                            JOptionPane.INFORMATION_MESSAGE
                        );
                        Ventana4 ventana4 = new Ventana4();
                        ventana4.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(
                            null,
                            "El usuario ya existe.",
                            "Error de registro",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Los datos no son válidos.",
                        "Datos inválidos",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        JLabel fotoFondo = new JLabel("");
        fotoFondo.setIcon(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
        fotoFondo.setBounds(-122, -9, 903, 584);
        contentPane.add(fotoFondo);
        contentPane.setComponentZOrder(fotoFondo, contentPane.getComponentCount() - 1);
    }
}
