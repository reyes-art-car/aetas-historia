package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Ventana10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField boton_busqueda;
	private JTextField rellenar_NombreDelDocumento;
	private JTextField rellenar_NombreDelAutor;
	private JTextField rellenar_Descripcion;
	private JTextField rellenar_Ano;
	private JTextField rellenar_Coleccion;
	private JTextField rellenar_Formato;

	

	/**
	 * Create the frame.
	 */
	public Ventana10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAetasHistoria = new JLabel("Aetas Historia");
		lblAetasHistoria.setForeground(Color.WHITE);
		lblAetasHistoria.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblAetasHistoria.setBounds(223, 0, 300, 60);
		contentPane.add(lblAetasHistoria);
		
		JLabel lblAetasHistoria_1 = new JLabel("Aetas Historia");
		lblAetasHistoria_1.setForeground(Color.WHITE);
		lblAetasHistoria_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAetasHistoria_1.setBounds(354, 43, 300, 60);
		contentPane.add(lblAetasHistoria_1);
		
		boton_busqueda = new JTextField();
		boton_busqueda.setColumns(10);
		boton_busqueda.setBounds(510, 66, 226, 19);
		contentPane.add(boton_busqueda);
		
		JButton boton_Categorias = new JButton("Categoria");
		boton_Categorias.setForeground(Color.WHITE);
		boton_Categorias.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_Categorias.setFocusPainted(false);
		boton_Categorias.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_Categorias.setBorderPainted(false);
		boton_Categorias.setBackground(Color.GRAY);
		boton_Categorias.setBounds(624, 113, 158, 38);
		contentPane.add(boton_Categorias);
		
		JButton boton_EtapasHistoricas = new JButton("Etapas historicas");
		boton_EtapasHistoricas.setForeground(Color.WHITE);
		boton_EtapasHistoricas.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_EtapasHistoricas.setFocusPainted(false);
		boton_EtapasHistoricas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_EtapasHistoricas.setBorderPainted(false);
		boton_EtapasHistoricas.setBackground(Color.GRAY);
		boton_EtapasHistoricas.setBounds(467, 113, 158, 38);
		contentPane.add(boton_EtapasHistoricas);
		
		JButton boton_Autores = new JButton("Autores");
		boton_Autores.setForeground(Color.WHITE);
		boton_Autores.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_Autores.setFocusPainted(false);
		boton_Autores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_Autores.setBorderPainted(false);
		boton_Autores.setBackground(Color.GRAY);
		boton_Autores.setBounds(309, 113, 158, 38);
		contentPane.add(boton_Autores);
		
		JButton boton_Documentos = new JButton("Documentos");
		boton_Documentos.setForeground(Color.WHITE);
		boton_Documentos.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_Documentos.setFocusPainted(false);
		boton_Documentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_Documentos.setBorderPainted(false);
		boton_Documentos.setBackground(Color.GRAY);
		boton_Documentos.setBounds(153, 113, 158, 38);
		contentPane.add(boton_Documentos);
		
		JButton boton_Inicio = new JButton("Inicio");
		boton_Inicio.setForeground(Color.WHITE);
		boton_Inicio.setFont(new Font("Times New Roman", Font.BOLD, 16));
		boton_Inicio.setFocusPainted(false);
		boton_Inicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_Inicio.setBorderPainted(false);
		boton_Inicio.setBackground(Color.GRAY);
		boton_Inicio.setBounds(0, 113, 158, 38);
		contentPane.add(boton_Inicio);
		
		JLabel titulo_NombreDelDocumento = new JLabel("Nombre del documento");
		titulo_NombreDelDocumento.setForeground(Color.WHITE);
		titulo_NombreDelDocumento.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_NombreDelDocumento.setBounds(10, 158, 300, 60);
		contentPane.add(titulo_NombreDelDocumento);
		
		JLabel titulo_NombreDelAutor = new JLabel("Nombre del Autor");
		titulo_NombreDelAutor.setForeground(Color.WHITE);
		titulo_NombreDelAutor.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_NombreDelAutor.setBounds(11, 194, 300, 60);
		contentPane.add(titulo_NombreDelAutor);
		
		JLabel titulo_Descripcion = new JLabel("Descripcion");
		titulo_Descripcion.setForeground(Color.WHITE);
		titulo_Descripcion.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_Descripcion.setBounds(11, 233, 300, 60);
		contentPane.add(titulo_Descripcion);
		
		JLabel titulo_Ano = new JLabel("Año");
		titulo_Ano.setForeground(Color.WHITE);
		titulo_Ano.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_Ano.setBounds(11, 288, 300, 60);
		contentPane.add(titulo_Ano);
		
		JLabel titulo_Coleccion = new JLabel("Coleccion");
		titulo_Coleccion.setForeground(Color.WHITE);
		titulo_Coleccion.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_Coleccion.setBounds(11, 323, 300, 60);
		contentPane.add(titulo_Coleccion);
		
		rellenar_NombreDelDocumento = new JTextField();
		rellenar_NombreDelDocumento.setColumns(10);
		rellenar_NombreDelDocumento.setBounds(354, 181, 226, 19);
		contentPane.add(rellenar_NombreDelDocumento);
		
		rellenar_NombreDelAutor = new JTextField();
		rellenar_NombreDelAutor.setColumns(10);
		rellenar_NombreDelAutor.setBounds(354, 217, 226, 19);
		contentPane.add(rellenar_NombreDelAutor);
		
		rellenar_Descripcion = new JTextField();
		rellenar_Descripcion.setColumns(10);
		rellenar_Descripcion.setBounds(354, 256, 226, 19);
		contentPane.add(rellenar_Descripcion);
		
		rellenar_Ano = new JTextField();
		rellenar_Ano.setColumns(10);
		rellenar_Ano.setBounds(354, 298, 226, 19);
		contentPane.add(rellenar_Ano);
		
		rellenar_Coleccion = new JTextField();
		rellenar_Coleccion.setColumns(10);
		rellenar_Coleccion.setBounds(354, 343, 226, 19);
		contentPane.add(rellenar_Coleccion);
		
		JLabel titulo_Formato = new JLabel("Formato");
		titulo_Formato.setForeground(Color.WHITE);
		titulo_Formato.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titulo_Formato.setBounds(11, 361, 300, 60);
		contentPane.add(titulo_Formato);
		
		rellenar_Formato = new JTextField();
		rellenar_Formato.setColumns(10);
		rellenar_Formato.setBounds(354, 372, 226, 19);
		contentPane.add(rellenar_Formato);
		
		JLabel fotoFondo = new JLabel("New label");
		fotoFondo.setIcon(new ImageIcon("C:\\Users\\manzano\\Desktop\\FOTOS\\biblioteca.png"));
		fotoFondo.setBounds(-81, 0, 863, 520);
		contentPane.add(fotoFondo);
	}
}
