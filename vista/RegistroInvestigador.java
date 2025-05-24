package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class RegistroInvestigador extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField rellenar_Nombre;
    private JTextField rellenar_Apellidos;
    private JTextField rellenar_CorreoElectronico;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegistroInvestigador frame = new RegistroInvestigador();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public RegistroInvestigador() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 440);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton boton_Registrate = new JButton("Registrate");
        boton_Registrate.setForeground(Color.WHITE);
        boton_Registrate.setFont(new Font("Times New Roman", Font.BOLD, 16));
        boton_Registrate.setFocusPainted(false);
        boton_Registrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        boton_Registrate.setBorderPainted(false);
        boton_Registrate.setBackground(Color.GRAY);
        boton_Registrate.setBounds(291, 169, 145, 62);
        contentPane.add(boton_Registrate);

        // Acción del botón: abrir Ventana4
        boton_Registrate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventana4 ventana4 = new Ventana4();   // Cambiado de Ventana4 a Ventana5
                ventana4.setVisible(true);           // Mostrar la nueva ventana
            }
        });

        boton_Registrate.setForeground(Color.WHITE);
        boton_Registrate.setFont(new Font("Times New Roman", Font.BOLD, 16));
        boton_Registrate.setFocusPainted(false);
        boton_Registrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        boton_Registrate.setBorderPainted(false);
        boton_Registrate.setBackground(Color.GRAY);
        boton_Registrate.setBounds(298, 317, 145, 62);
        contentPane.add(boton_Registrate);

        JLabel titulo_AetasHistoria = new JLabel("Aetas Historia");
        titulo_AetasHistoria.setForeground(Color.WHITE);
        titulo_AetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo_AetasHistoria.setBounds(246, 22, 300, 60);
        contentPane.add(titulo_AetasHistoria);

        JLabel titulo_Registarte = new JLabel("Registrate Investigador");
        titulo_Registarte.setForeground(Color.WHITE);
        titulo_Registarte.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titulo_Registarte.setBounds(275, 78, 300, 60);
        contentPane.add(titulo_Registarte);

        JLabel titulo_Nombre = new JLabel("Nombre");
        titulo_Nombre.setForeground(Color.WHITE);
        titulo_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo_Nombre.setBounds(43, 134, 100, 60);
        contentPane.add(titulo_Nombre);

        JLabel titulo_Apellidos = new JLabel("Apellidos");
        titulo_Apellidos.setForeground(Color.WHITE);
        titulo_Apellidos.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo_Apellidos.setBounds(43, 194, 100, 60);
        contentPane.add(titulo_Apellidos);

        JLabel titulo_CorreoElectronico = new JLabel("Correo Electronico");
        titulo_CorreoElectronico.setForeground(Color.WHITE);
        titulo_CorreoElectronico.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo_CorreoElectronico.setBounds(0, 246, 169, 60);
        contentPane.add(titulo_CorreoElectronico);

        rellenar_Nombre = new JTextField();
        rellenar_Nombre.setBounds(178, 148, 359, 37);
        contentPane.add(rellenar_Nombre);
        rellenar_Nombre.setColumns(10);

        rellenar_Apellidos = new JTextField();
        rellenar_Apellidos.setColumns(10);
        rellenar_Apellidos.setBounds(178, 205, 359, 37);
        contentPane.add(rellenar_Apellidos);

        rellenar_CorreoElectronico = new JTextField();
        rellenar_CorreoElectronico.setColumns(10);
        rellenar_CorreoElectronico.setBounds(179, 260, 359, 37);
        contentPane.add(rellenar_CorreoElectronico);

        JLabel fotoFondo = new JLabel("New label");
		fotoFondo.setIcon(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
        fotoFondo.setBounds(-122, -9, 903, 584);
        contentPane.add(fotoFondo);
    }
}