package Proyecto;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class administradorRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administradorRegistro frame = new administradorRegistro();
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
	public administradorRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(154, 71, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 119, 200, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 164, 200, 30);
		contentPane.add(textField_2);
		//////////////////////////////TEXTO TITULO 1 DE REGISTRATE//////////////////////////////////////////////////////////////////////
		JLabel registrateTitulo = new JLabel("Registrate");
		registrateTitulo.setHorizontalAlignment(SwingConstants.CENTER); // Centra el texto
		registrateTitulo.setForeground(Color.WHITE);                    // Color del texto
		registrateTitulo.setFont(new Font("Times New Roman", Font.BOLD, 18)); // Fuente elegida
		registrateTitulo.setBounds(154, 10, 131, 61);                  // Mismo lugar (ajusté el tamaño)
		registrateTitulo.setOpaque(false);                             // Fondo transparente (importante si hay imagen o fondo)
		contentPane.add(registrateTitulo);
		//////////////////////////////TEXTO NORMAL NOMBRE//////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel nombreTexto = new JLabel("Nombre");
		nombreTexto.setHorizontalAlignment(SwingConstants.CENTER); // Centra el texto
		nombreTexto.setForeground(Color.WHITE);                  // Texto en blanco
		nombreTexto.setFont(new Font("Times New Roman", Font.BOLD, 18)); // Fuente elegante
		nombreTexto.setBounds(10, 53, 131, 61);                 // Tamaño más claro para leer bien
		nombreTexto.setOpaque(false);                            // Fondo transparente
		contentPane.add(nombreTexto);
		/////////////////////////////TEXTO NORMAL APELLIDO//////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel ApellidosTexto = new JLabel("Apellidos");
		ApellidosTexto.setHorizontalAlignment(SwingConstants.CENTER); // Centrado horizontal
		ApellidosTexto.setForeground(Color.WHITE);                    // Texto blanco
		ApellidosTexto.setFont(new Font("Times New Roman", Font.BOLD, 18)); // Fuente elegante
		ApellidosTexto.setBounds(10, 101, 131, 61);                   // Ajustamos tamaño para que se vea bien
		ApellidosTexto.setOpaque(false);                              // Fondo transparente
		contentPane.add(ApellidosTexto);
		//////////////////////////////TEXTO NORMAL CORREO ELECTRONICO//////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel correoElectronicoTexto = new JLabel("CorreoElectronico");
		correoElectronicoTexto.setHorizontalAlignment(SwingConstants.CENTER); // Centra el texto
		correoElectronicoTexto.setForeground(Color.WHITE);                    // Color del texto
		correoElectronicoTexto.setFont(new Font("Times New Roman", Font.BOLD, 18)); // Estilo elegante
		correoElectronicoTexto.setBounds(10, 146, 148, 61);                   // Más espacio para leer bien
		correoElectronicoTexto.setOpaque(false);                              // Fondo transparente
		contentPane.add(correoElectronicoTexto);
		
		JButton botonRetrocesoventanaPrincipal = new JButton("🢀");
		botonRetrocesoventanaPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRetrocesoventanaPrincipal.setBounds(10, 211, 55, 42);
		contentPane.add(botonRetrocesoventanaPrincipal);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(213, 222, 85, 21);
		contentPane.add(btnNewButton);
	}

}
