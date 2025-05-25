package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel boton_AetasHistoria = new JLabel("Aetas Historia");
		boton_AetasHistoria.setForeground(Color.WHITE);
		boton_AetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
		boton_AetasHistoria.setBounds(247, 10, 300, 60);
		contentPane.add(boton_AetasHistoria);
		
		JButton boton_AnadirDocumento = new JButton("Añadir Documento");
		boton_AnadirDocumento.setForeground(Color.WHITE);
		boton_AnadirDocumento.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_AnadirDocumento.setFocusPainted(false);
		boton_AnadirDocumento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_AnadirDocumento.setBorderPainted(false);
		boton_AnadirDocumento.setBackground(Color.GRAY);
		boton_AnadirDocumento.setBounds(29, 185, 166, 62);
		contentPane.add(boton_AnadirDocumento);

		// Acción del botón: abrir Ventana5
		boton_AnadirDocumento.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Ventana5 ventana5 = new Ventana5();   // Asegúrate de que Ventana5 exista
		        ventana5.setVisible(true);           // Mostrar la nueva ventana
		        dispose();
		    }
		});
		
		JButton boton_ActualizarDocumento = new JButton("Actualizar Documento");
		boton_ActualizarDocumento.setForeground(Color.WHITE);
		boton_ActualizarDocumento.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_ActualizarDocumento.setFocusPainted(false);
		boton_ActualizarDocumento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_ActualizarDocumento.setBorderPainted(false);
		boton_ActualizarDocumento.setBackground(Color.GRAY);
		boton_ActualizarDocumento.setBounds(205, 185, 195, 62);
		contentPane.add(boton_ActualizarDocumento);

		// Acción del botón: abrir Ventana5
		boton_ActualizarDocumento.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Ventana5 ventana5 = new Ventana5();   // Asegúrate de que exista
		        ventana5.setVisible(true);           // Mostrar la nueva ventana
		        dispose();
		    }
		});
		
		JButton boton_EliminarDocumento = new JButton("Eliminar Documento");
		boton_EliminarDocumento.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Ventana5 ventana5 = new Ventana5();   // Asegúrate de que exista
		        ventana5.setVisible(true);           // Mostrar la nueva ventana
		        dispose();
		    }
		});
		boton_EliminarDocumento.setForeground(Color.WHITE);
		boton_EliminarDocumento.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_EliminarDocumento.setFocusPainted(false);
		boton_EliminarDocumento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_EliminarDocumento.setBorderPainted(false);
		boton_EliminarDocumento.setBackground(Color.GRAY);
		boton_EliminarDocumento.setBounds(410, 185, 183, 62);
		contentPane.add(boton_EliminarDocumento);
		
		JButton boton_BuscarDocumento = new JButton("Buscar Documento");
		boton_BuscarDocumento.setForeground(Color.WHITE);
		boton_BuscarDocumento.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_BuscarDocumento.setFocusPainted(false);
		boton_BuscarDocumento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_BuscarDocumento.setBorderPainted(false);
		boton_BuscarDocumento.setBackground(Color.GRAY);
		boton_BuscarDocumento.setBounds(603, 185, 158, 62);
		contentPane.add(boton_BuscarDocumento);

		// Acción del botón: abrir Ventana5
		boton_BuscarDocumento.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Ventana5 ventana5 = new Ventana5();   // Asegúrate de que exista
		        ventana5.setVisible(true);           // Mostrar la nueva ventana
		        dispose();
		    }
		});
		
		JLabel fotoFondo = new JLabel("New label");
		fotoFondo.setIcon(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
		fotoFondo.setBounds(-97, 0, 935, 574);
		contentPane.add(fotoFondo);
	}

}
