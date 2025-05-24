package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Ventana6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public Ventana6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo_AetasHistoria = new JLabel("Aetas Historia");
		titulo_AetasHistoria.setForeground(Color.WHITE);
		titulo_AetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
		titulo_AetasHistoria.setBounds(248, 10, 300, 60);
		contentPane.add(titulo_AetasHistoria);
		
		JLabel titulo_Investigador = new JLabel("Investigador");
		titulo_Investigador.setForeground(Color.WHITE);
		titulo_Investigador.setFont(new Font("Times New Roman", Font.BOLD, 36));
		titulo_Investigador.setBounds(263, 64, 300, 60);
		contentPane.add(titulo_Investigador);
		
		JButton boton_Registrate = new JButton("Registrate");
		boton_Registrate.setForeground(Color.WHITE);
		boton_Registrate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_Registrate.setFocusPainted(false);
		boton_Registrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_Registrate.setBorderPainted(false);
		boton_Registrate.setBackground(Color.GRAY);
		boton_Registrate.setBounds(288, 165, 158, 38);
		contentPane.add(boton_Registrate);

		// Acción del botón: abrir Ventana3
		boton_Registrate.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        RegistroInvestigador  RegistroInvestigador = new  RegistroInvestigador();   // Asegúrate de que exista
		        RegistroInvestigador.setVisible(true);           // Mostrar la nueva ventana
		        dispose();
		    }
		});
		
		JButton boton_AccedeConTuCorreoUsuario = new JButton("Accede con tu correo de usuario");
		boton_AccedeConTuCorreoUsuario.setForeground(Color.WHITE);
		boton_AccedeConTuCorreoUsuario.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_AccedeConTuCorreoUsuario.setFocusPainted(false);
		boton_AccedeConTuCorreoUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_AccedeConTuCorreoUsuario.setBorderPainted(false);
		boton_AccedeConTuCorreoUsuario.setBackground(Color.GRAY);
		boton_AccedeConTuCorreoUsuario.setBounds(226, 257, 282, 51);
		contentPane.add(boton_AccedeConTuCorreoUsuario);
		
		JLabel fotoFondo = new JLabel("New label");
		fotoFondo.setIcon(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
		fotoFondo.setBounds(-112, 0, 902, 558);
		contentPane.add(fotoFondo);
	}

}
