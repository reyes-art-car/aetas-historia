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

public class crudd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crudd frame = new crudd();
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
	public crudd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//////////////////////////AETAS HISTORIA TEXTO/////////////////////////////////////////////
		JLabel lblNewLabel = new JLabel("Aetas Historia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centrado horizontal
		lblNewLabel.setForeground(Color.WHITE);                    // Texto blanco
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18)); // Fuente elegante
		lblNewLabel.setBounds(139, 10, 131, 61);                  // Tamaño y posición iguales a enunciado1
		lblNewLabel.setOpaque(false);                            // Fondo transparente
		lblNewLabel.setBackground(new Color(244, 164, 96));       // Opcional: fondo suave si no es transparente
		contentPane.add(lblNewLabel);
		/////////////////////////Anadir Documento/////////////////////////////////////////////
		JButton btnNewButton = new JButton("Añadir documento");
		btnNewButton.setBounds(139, 65, 135, 42);

		// Estilo idéntico al botón "Accede"
		btnNewButton.setBackground(new Color(244, 164, 96)); // Sandy Brown
		btnNewButton.setForeground(Color.WHITE);              // Texto blanco
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false); // Fondo transparente
		btnNewButton.setBorderPainted(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Esquinas redondeadas
		contentPane.add(btnNewButton);
		/////////////////////////Actualizar Documento/////////////////////////////////////////////
		JButton btnActualizarDocumento = new JButton("Actualizar Documento");
		btnActualizarDocumento.setBounds(139, 112, 135, 42);
		btnActualizarDocumento.setBackground(new Color(244, 164, 96)); // Sandy Brown
		btnActualizarDocumento.setForeground(Color.WHITE);             // Texto blanco
		btnActualizarDocumento.setFont(new Font("Arial", Font.BOLD, 14));
		btnActualizarDocumento.setOpaque(false);
		btnActualizarDocumento.setContentAreaFilled(false); // Fondo transparente
		btnActualizarDocumento.setBorderPainted(true);
		btnActualizarDocumento.setFocusPainted(false);
		btnActualizarDocumento.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado

		contentPane.add(btnActualizarDocumento);
		/////////////////////////Eliminar Documento/////////////////////////////////////////////
		JButton btnNewButton_1_1 = new JButton("Eliminar documento");
		btnNewButton_1_1.setBounds(139, 159, 135, 42);
		btnNewButton_1_1.setBackground(new Color(244, 164, 96)); // Fondo Sandy Brown
		btnNewButton_1_1.setForeground(Color.WHITE);             // Texto blanco
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setContentAreaFilled(false); // Hacer fondo transparente
		btnNewButton_1_1.setBorderPainted(true);
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado
		contentPane.add(btnNewButton_1_1);
		/////////////////////////Buscar Documento/////////////////////////////////////////////
		JButton btnNewButton_1_2 = new JButton("Buscar Documento");
		btnNewButton_1_2.setBounds(139, 211, 135, 42);

	
		btnNewButton_1_2.setBackground(new Color(244, 164, 96)); // Fondo Sandy Brown
		btnNewButton_1_2.setForeground(Color.WHITE);             // Texto blanco
		btnNewButton_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setContentAreaFilled(false); // Hacer fondo transparente
		btnNewButton_1_2.setBorderPainted(true);
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado
		contentPane.add(btnNewButton_1_2);
		
	}

}
