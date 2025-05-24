// src/vista/Ventana1.java
package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import modelo.ConexionMySQL;

public class Ventana1 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final ConexionMySQL conexion;
    private JPanel contentPane;

    public Ventana1(ConexionMySQL conexion) {
        this.conexion = conexion;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 440);

        contentPane = new JPanel(null);
        contentPane.setBackground(new Color(139, 69, 19));
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);

        // Título principal
        JLabel titulo1 = new JLabel("Aetas Historia");
        titulo1.setForeground(Color.WHITE);
        titulo1.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo1.setBounds(285, 45, 300, 60);
        contentPane.add(titulo1);

        // Subtítulo
        JLabel titulo2 = new JLabel("Acceso");
        titulo2.setForeground(Color.WHITE);
        titulo2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        titulo2.setHorizontalAlignment(SwingConstants.CENTER);
        titulo2.setBounds(297, 83, 200, 50);
        contentPane.add(titulo2);

        // Botón Administrador
        JButton btnAdmin = new JButton("Administrador");
        estiloBoton(btnAdmin);
        btnAdmin.setBounds(317, 143, 145, 62);
        btnAdmin.addActionListener(e -> {
            new Ventana2(conexion).setVisible(true);
            dispose();
        });
        contentPane.add(btnAdmin);

        // Botón Investigador
        JButton btnInvest = new JButton("Investigador");
        estiloBoton(btnInvest);
        btnInvest.setBounds(317, 214, 145, 62);
        btnInvest.addActionListener(e -> {
            new Ventana6().setVisible(true);
            dispose();
        });
        contentPane.add(btnInvest);

        // Botón Visitante (sin logeo) → abre Ventana11
        JButton btnVisitante = new JButton("Visitante (sin logeo)");
        estiloBoton(btnVisitante);
        btnVisitante.setBounds(317, 285, 145, 62);
        btnVisitante.addActionListener(e -> {
            new Ventana11().setVisible(true);
            dispose();
        });
        contentPane.add(btnVisitante);

        // Imagen pergamino
        ImageIcon icono = new ImageIcon(getClass().getResource("/Fotos/pergamino1.png"));
        Image img = icono.getImage().getScaledInstance(460, 250, Image.SCALE_SMOOTH);
        JLabel foto1 = new JLabel(new ImageIcon(img));
        foto1.setHorizontalAlignment(SwingConstants.CENTER);
        foto1.setBounds(165, 10, 460, 250);
        contentPane.add(foto1);

        // Fondo
        JLabel fotoFondo = new JLabel(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
        fotoFondo.setBounds(-113, -51, 982, 659);
        contentPane.add(fotoFondo);
        contentPane.setComponentZOrder(fotoFondo, contentPane.getComponentCount() - 1);
    }

    private void estiloBoton(JButton b) {
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b.setBackground(new Color(128, 128, 128));
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}
