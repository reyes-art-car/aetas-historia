// src/vista/Ventana9.java
package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import modelo.ConexionMySQL;

public class Ventana9 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final ConexionMySQL conexion;
    private JPanel contentPane;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    /** Lanza la ventana de login */
    public static void main(String[] args) {
        // Ajusta estos parámetros de conexión según tu configuración
        ConexionMySQL conexion = new ConexionMySQL("localhost","3306","root","","aetas_historia");
        EventQueue.invokeLater(() -> {
            Ventana9 frame = new Ventana9(conexion);
            frame.setVisible(true);
        });
    }

    public Ventana9(ConexionMySQL conexion) {
        this.conexion = conexion;
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 370);

        // Panel principal
        contentPane = new JPanel(null);
        setContentPane(contentPane);

        // --- Fondo ---
        ImageIcon fondoIcon = new ImageIcon(getClass().getResource("/Fotos/biblioteca.png"));
        JLabel fondo = new JLabel(fondoIcon);
        fondo.setBounds(0, 0, getWidth(), getHeight());
        contentPane.add(fondo);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                fondo.setSize(getSize());
            }
        });

        // --- Etiquetas y campos ---
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblUsuario.setBounds(100, 100, 100, 30);
        contentPane.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        txtUsuario.setBounds(210, 100, 200, 30);
        contentPane.add(txtUsuario);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblPassword.setBounds(100, 150, 100, 30);
        contentPane.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        txtPassword.setBounds(210, 150, 200, 30);
        contentPane.add(txtPassword);

        // --- Botón Entrar ---
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setBackground(Color.GRAY);
        btnEntrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEntrar.setBounds(210, 210, 100, 35);
        contentPane.add(btnEntrar);

        btnEntrar.addActionListener(e -> {
            String user = txtUsuario.getText().trim();
            String pass = new String(txtPassword.getPassword());
            boolean ok = conexion.logging(user, pass);
            if (ok) {
                JOptionPane.showMessageDialog(this, "¡Login exitoso!");
                // Tras login abre Ventana5 (por ejemplo) y cierra este
                new Ventana5().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.",
                                              "Error de login",
                                              JOptionPane.ERROR_MESSAGE);
            }
        });

        // Enter dispara el login
        getRootPane().setDefaultButton(btnEntrar);

        // Envía el fondo al fondo del z-order
        contentPane.setComponentZOrder(fondo, contentPane.getComponentCount() - 1);
    }
}
