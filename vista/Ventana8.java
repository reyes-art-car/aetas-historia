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

public class Ventana8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana8 frame = new Ventana8();
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
	public Ventana8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo_AetasHistoria = new JLabel("Aetas Historia");
		titulo_AetasHistoria.setBounds(244, 0, 300, 60);
		titulo_AetasHistoria.setForeground(Color.WHITE);
		titulo_AetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
		contentPane.add(titulo_AetasHistoria);
		
		JLabel titulo_Visitante = new JLabel("Visitante");
		titulo_Visitante.setBounds(273, 66, 300, 60);
		titulo_Visitante.setForeground(Color.WHITE);
		titulo_Visitante.setFont(new Font("Times New Roman", Font.BOLD, 36));
		contentPane.add(titulo_Visitante);
		
		JButton boton_Registrate = new JButton("Registrate");
		boton_Registrate.setBounds(278, 161, 158, 38);
		boton_Registrate.setForeground(Color.WHITE);
		boton_Registrate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_Registrate.setFocusPainted(false);
		boton_Registrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_Registrate.setBorderPainted(false);
		boton_Registrate.setBackground(Color.GRAY);
		contentPane.add(boton_Registrate);
		
		JButton boton_AccedeConTuCorreoElectronico = new JButton("Accede con tu correo de usuario");
		boton_AccedeConTuCorreoElectronico.setBounds(225, 238, 282, 51);
		boton_AccedeConTuCorreoElectronico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton_AccedeConTuCorreoElectronico.setForeground(Color.WHITE);
		boton_AccedeConTuCorreoElectronico.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_AccedeConTuCorreoElectronico.setFocusPainted(false);
		boton_AccedeConTuCorreoElectronico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_AccedeConTuCorreoElectronico.setBorderPainted(false);
		boton_AccedeConTuCorreoElectronico.setBackground(Color.GRAY);
		contentPane.add(boton_AccedeConTuCorreoElectronico);
		
		JLabel fotoFondo = new JLabel("New label");
		fotoFondo.setBounds(0, 0, 785, 587);
		fotoFondo.setIcon(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
		contentPane.add(fotoFondo);
	}

}
