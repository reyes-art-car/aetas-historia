// src/vista/Ventana2.java
package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import modelo.ConexionMySQL;

public class Ventana2 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final ConexionMySQL conexion;
    private JPanel contentPane;

    public Ventana2(ConexionMySQL conexion) {
        this.conexion = conexion;

        setTitle("Aetas Historia Administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 786, 442);

        contentPane = new JPanel(null);
        contentPane.setBackground(new Color(139, 69, 19));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Título 1
        JLabel titulo1 = new JLabel("Aetas Historia");
        titulo1.setForeground(Color.WHITE);
        titulo1.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo1.setBounds(253, 10, 300, 60);
        contentPane.add(titulo1);

        // Título 2
        JLabel titulo2 = new JLabel("Administrador");
        titulo2.setForeground(Color.WHITE);
        titulo2.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo2.setBounds(253, 80, 300, 60);
        contentPane.add(titulo2);

        // Botón "Regístrate"
        JButton btnRegistrate = new JButton("Regístrate");
        btnRegistrate.setForeground(Color.WHITE);
        btnRegistrate.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnRegistrate.setBackground(Color.GRAY);
        btnRegistrate.setFocusPainted(false);
        btnRegistrate.setBorderPainted(false);
        btnRegistrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegistrate.setBounds(291, 169, 145, 62);
        btnRegistrate.addActionListener(e -> {
            new Ventana3(conexion).setVisible(true);
            dispose();
        });
        contentPane.add(btnRegistrate);

        // Botón "Accede"
        JButton btnAccede = new JButton("Accede");
        btnAccede.setForeground(Color.WHITE);
        btnAccede.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnAccede.setBackground(Color.GRAY);
        btnAccede.setFocusPainted(false);
        btnAccede.setBorderPainted(false);
        btnAccede.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAccede.setBounds(291, 267, 145, 62);
        btnAccede.addActionListener(e -> {
            // Usamos el constructor que recibe la conexión
            new Ventana9(conexion).setVisible(true);
            dispose();
        });
        contentPane.add(btnAccede);

        // Imagen administrador
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/Fotos/administrador.png"));
        Image imgRed = iconoOriginal.getImage().getScaledInstance(150, 160, Image.SCALE_SMOOTH);
        JLabel foto1 = new JLabel(new ImageIcon(imgRed));
        foto1.setBounds(95, 10, 150, 160);
        foto1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(foto1);

        // Botón "Retroceso"
        JButton btnRetroceso = new JButton("Retroceso");
        btnRetroceso.setForeground(Color.WHITE);
        btnRetroceso.setFont(new Font("Arial", Font.BOLD, 16));
        btnRetroceso.setBackground(Color.GRAY);
        btnRetroceso.setFocusPainted(false);
        btnRetroceso.setBorderPainted(false);
        btnRetroceso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRetroceso.setBounds(10, 332, 139, 62);
        btnRetroceso.addActionListener(e -> {
            // Por ejemplo, volver a Ventana1
            new Ventana1(conexion).setVisible(true);
            dispose();
        });
        contentPane.add(btnRetroceso);

        // Fondo
        JLabel fotoFondo = new JLabel(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
        fotoFondo.setBounds(-118, -34, 929, 666);
        contentPane.add(fotoFondo);
        contentPane.setComponentZOrder(fotoFondo, contentPane.getComponentCount() - 1);
    }

    public static void main(String[] args) {
        ConexionMySQL cn = new ConexionMySQL("localhost","3306","root","","aetas_historia");
        EventQueue.invokeLater(() -> new Ventana2(cn).setVisible(true));
    }
}
