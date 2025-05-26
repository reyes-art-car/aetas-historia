package Proyecto;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
///////////////////////////////////////////////////VENTANA PRINCIPAL///////////////////////////////////////////////////////////////////////////////////////////////
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

////////////////////////////////////LABEL TITULO 1 TEXTO AETAS HISTORIA///////////////////////////////////////////////////////////////////////////
		JLabel enunciado1 = new JLabel("Aetas Historia");
		enunciado1.setHorizontalAlignment(SwingConstants.CENTER);
		enunciado1.setForeground(Color.WHITE);
		enunciado1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		enunciado1.setBounds(167, 0, 131, 61);
		contentPane.add(enunciado1);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////// LABEL TITULO 2(MAS CHICO)//////////
		JLabel enunciado2 = new JLabel("Acceso");
		enunciado2.setBounds(167, 28, 131, 61);
		contentPane.add(enunciado2);
		// FONTS FUENTES TITULO 2
		enunciado2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		enunciado2.setForeground(Color.WHITE);
		enunciado2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(enunciado2);

////////////////////////////////////////////////BOTON INVESTIGADOR/////////////////////////////////////////////////////////////////////////////////////////////////
		// Botón "Investigador"
		JButton botonVariables = new JButton("Investigador");
		botonVariables.setBounds(171, 132, 115, 42);

		// Estilo del botón
		botonVariables.setBackground(new Color(244, 164, 96)); // Fondo Sandy Brown
		botonVariables.setForeground(Color.WHITE);              // Texto blanco
		botonVariables.setFont(new Font("Arial", Font.BOLD, 14));
		botonVariables.setFocusPainted(false);                   // Quitar borde de foco

		// Efecto: borde redondeado usando LineBorder
		botonVariables.setOpaque(false);
		botonVariables.setContentAreaFilled(false); // Hacer fondo transparente
		botonVariables.setBorderPainted(true);
		botonVariables.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado

		// Acción al hacer clic (opcional)
		botonVariables.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Aquí puedes abrir otra ventana, por ejemplo:
		        // new VentanaInvestigador().setVisible(true);
		    }
		});

		// Añadir botón al panel principal
		contentPane.add(botonVariables);
////////////////////////////////////////////////BOTON VISITANTE/////////////////////////////////////////////////////////////////////////////////////////////////////

		// Botón "Visitante"
		JButton botonVisitante = new JButton("Visitante");
		botonVisitante.setBounds(171, 184, 115, 42); // Posición y tamaño igual a los demás

		// Estilo del botón
		botonVisitante.setBackground(new Color(244, 164, 96)); // Fondo Sandy Brown
		botonVisitante.setForeground(Color.WHITE);              // Texto en blanco
		botonVisitante.setFont(new Font("Arial", Font.BOLD, 14));
		botonVisitante.setFocusPainted(false);                   // Quitar borde de foco

		// Efecto: borde ligeramente redondeado
		botonVisitante.setOpaque(false);
		botonVisitante.setContentAreaFilled(false); // Hacer fondo transparente para efecto redondeado
		botonVisitante.setBorderPainted(true);
		botonVisitante.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado blanco

		// Acción al hacer clic (opcional)
		botonVisitante.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Aquí puedes abrir otra ventana si lo deseas
		        // Por ejemplo: new VentanaVisitante().setVisible(true);
		    }
		});

		// Añadir botón al panel principal
		contentPane.add(botonVisitante);
/////////////////////////////////////////////////BOTON ADMINISTRADOR/////////////////////////////////////////////////////////////////////////////////////////////////
		JButton botonAdministrador = new JButton("Administrador");
		botonAdministrador.setBounds(171, 80, 115, 42);

		// Efecto de borde redondeado (sin RoundedBorder)
		botonAdministrador.setBackground(new Color(244, 164, 96));
		botonAdministrador.setForeground(Color.WHITE);
		botonAdministrador.setFont(new Font("Arial", Font.BOLD, 14));
		botonAdministrador.setOpaque(false);
		botonAdministrador.setContentAreaFilled(false);
		botonAdministrador.setBorderPainted(true);
		botonAdministrador.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // true = esquinas redondeadas

		// Acción del botón
		botonAdministrador.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        VentanaAccesoAdministrador ventanaAdmin = new VentanaAccesoAdministrador();
		        ventanaAdmin.setVisible(true);
		    }
		});

		contentPane.add(botonAdministrador);
////////////////////////////////////////////////REDIRECCION GUIA VIRTUAL//////////////////////////////////////////////////////////////////////////////////////////////////		
		// Cargar la imagen original
		ImageIcon iconoOriginal = new ImageIcon("C:\\Users\\manzano\\Desktop\\ProyectoJavaV1Residuos\\fotoVirtual.png");

		// Redimensionar la imagen a un tamaño de icono (por ejemplo, 32x32)
		Image img = iconoOriginal.getImage();
		Image redimensionado = img.getScaledInstance(32, 32, Image.SCALE_SMOOTH); // 32x32 px
		ImageIcon iconoRedimensionado = new ImageIcon(redimensionado);

		// Crear el JLabel con el icono pequeño
		JLabel redireccionGuiaVirtual = new JLabel(iconoRedimensionado);
		redireccionGuiaVirtual.setBounds(10, 10, 32, 32); // Tamaño del JLabel igual al del icono

		// Agregar el JLabel al panel
		contentPane.add(redireccionGuiaVirtual);
			
///////////////////////////////////////////////////LABEL FOTO PERGAMINO//////////////////////////////////////////////////////////////////////////////////////////////////////
		// Cargar la imagen original
		ImageIcon iconOriginal = new ImageIcon("C:\\Users\\manzano\\Desktop\\ProyectoJavaV1Residuos\\pergaminoFoto.png");

		// Redimensionar a 32x32 píxeles (tamaño de icono)
		Image img1 = iconOriginal.getImage();
		Image imgRedimensionada = img1.getScaledInstance(190, 100, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado1 = new ImageIcon(imgRedimensionada);

		// Crear JLabel con la imagen pequeña
		JLabel fotoPergamino = new JLabel(iconoRedimensionado1);
		fotoPergamino.setBounds(142, -9, 176, 79); // Mismo lugar, tamaño pequeño

		// Añadir al panel
		contentPane.add(fotoPergamino);


	}
}
