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

public class VentanaAccesoAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAccesoAdministrador frame = new VentanaAccesoAdministrador();
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
	//////////////////////////////////////////////////// FONDO///////////////////////////////////////////////////////////////////////////////////////////////////
	public VentanaAccesoAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		///////////////////////////////////////// BOTON ACCEDE
		///////////////////////////////////////// ADMINISTRADOR/////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton botonAccedeAdministrador = new JButton("Accede");
		botonAccedeAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonAccedeAdministrador.setBounds(172, 161, 115, 42);
		contentPane.add(botonAccedeAdministrador);

		////////////////////////////////////////// BOTON REGISTRATE
		////////////////////////////////////////// ADMINISTRADOR////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Botón "Registrate"
		JButton botonRegistroAdministrador = new JButton("Registrate");
		botonRegistroAdministrador.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Abrir la nueva ventana de Registro
		        VentanaAccesoAdministrador registroAdmin = new VentanaAccesoAdministrador();
		        registroAdmin.setVisible(true);

		        // Opcional: ocultar esta ventana actual
		        setVisible(false);
		    }
		});
		botonRegistroAdministrador.setBounds(172, 89, 115, 42);

		// Estilo del botón - igual al botón "Administrador"
		botonRegistroAdministrador.setBackground(new Color(244, 164, 96)); // Fondo Sandy Brown
		botonRegistroAdministrador.setForeground(Color.WHITE);             // Texto blanco
		botonRegistroAdministrador.setFont(new Font("Arial", Font.BOLD, 14));
		botonRegistroAdministrador.setOpaque(false);
		botonRegistroAdministrador.setContentAreaFilled(false); // Hacer fondo transparente
		botonRegistroAdministrador.setBorderPainted(true);
		botonRegistroAdministrador.setFocusPainted(false);
		botonRegistroAdministrador.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado

		contentPane.add(botonRegistroAdministrador);
		// Acción del botón
		botonRegistroAdministrador.addActionListener(new java.awt.event.ActionListener() {
				    public void actionPerformed(java.awt.event.ActionEvent evt) {
				    	administradorRegistro ventanaAdmin = new administradorRegistro();
				        ventanaAdmin.setVisible(true);
				    }
				});
		///////////////////////////////////// TEXTO
		///////////////////////////////////// ADMINISTRADOR/////////////////////////////////////
		JLabel enunciado1_1 = new JLabel("Administrador");
		enunciado1_1.setBounds(142, 26, 181, 53);
		contentPane.add(enunciado1_1);
		////////////// FONTS
		///// FONTS FUENTES//////
		enunciado1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		enunciado1_1.setForeground(Color.WHITE);
		enunciado1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(enunciado1_1);
		/////////////////////////////// BOTON DE
		/////////////////////////////// RETROCESO/////////////////////////////////////////////////////////////////
/////////////////////////////// BOTON DE RETROCESO /////////////////////////////////////////////////////////////////////
		JButton botonRetrocesoventanaPrincipal = new JButton("🢀");
		botonRetrocesoventanaPrincipal.setBounds(10, 211, 55, 42);

//Acción del botón: ir hacia atrás a VentanaPrincipal
		botonRetrocesoventanaPrincipal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
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
