package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Ventana7 extends JFrame {

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
					Ventana7 frame = new Ventana7();
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
	public Ventana7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo_AetasHistoria = new JLabel("Aetas Historia");
		titulo_AetasHistoria.setForeground(Color.WHITE);
		titulo_AetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
		titulo_AetasHistoria.setBounds(223, 10, 300, 60);
		contentPane.add(titulo_AetasHistoria);
		
		JLabel titulo_Registrate = new JLabel("Registrate");
		titulo_Registrate.setForeground(Color.WHITE);
		titulo_Registrate.setFont(new Font("Times New Roman", Font.BOLD, 36));
		titulo_Registrate.setBounds(251, 66, 300, 60);
		contentPane.add(titulo_Registrate);
		
		JLabel titulo_Nombre = new JLabel("Nombre");
		titulo_Nombre.setForeground(Color.WHITE);
		titulo_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_Nombre.setBounds(10, 148, 100, 60);
		contentPane.add(titulo_Nombre);
		
		JLabel titulo_Apellidos = new JLabel("Apellidos");
		titulo_Apellidos.setForeground(Color.WHITE);
		titulo_Apellidos.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_Apellidos.setBounds(10, 206, 100, 60);
		contentPane.add(titulo_Apellidos);
		
		JLabel titulo_CorreoElectronico = new JLabel("Correo Electronico");
		titulo_CorreoElectronico.setForeground(Color.WHITE);
		titulo_CorreoElectronico.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_CorreoElectronico.setBounds(10, 261, 182, 60);
		contentPane.add(titulo_CorreoElectronico);
		
		rellenar_Nombre = new JTextField();
		rellenar_Nombre.setColumns(10);
		rellenar_Nombre.setBounds(202, 163, 415, 27);
		contentPane.add(rellenar_Nombre);
		
		rellenar_Apellidos = new JTextField();
		rellenar_Apellidos.setColumns(10);
		rellenar_Apellidos.setBounds(202, 206, 415, 27);
		contentPane.add(rellenar_Apellidos);
		
		rellenar_CorreoElectronico = new JTextField();
		rellenar_CorreoElectronico.setColumns(10);
		rellenar_CorreoElectronico.setBounds(202, 263, 415, 27);
		contentPane.add(rellenar_CorreoElectronico);
		
		JLabel fotoFondo = new JLabel("New label");
		fotoFondo.setIcon(new ImageIcon(getClass().getResource("/Fotos/biblioteca.png")));
		fotoFondo.setBounds(-152, -3, 939, 558);
		contentPane.add(fotoFondo);
	}

}
