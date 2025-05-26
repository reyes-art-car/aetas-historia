package Proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class busquedaDocumentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel tituloPrincipal;
	private JTextField rellenar1;
	private JTextField rellenar2;
	private JTextField rellenar3;
	private JTextField rellenar4;
	private JTextField rellenar5;
	private JTextField busqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					busquedaDocumentos frame = new busquedaDocumentos();
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
	public busquedaDocumentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		tituloPrincipal = new JPanel();
		tituloPrincipal.setBackground(new Color(222, 184, 135));
		tituloPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(tituloPrincipal);
		tituloPrincipal.setLayout(null);
		//////////////////////////////////BOTON INICIO///////////////////////////////////////////////////////////////
		JButton botonInicio = new JButton("Inicio");
		botonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonInicio.setBounds(0, 49, 85, 21);
		tituloPrincipal.add(botonInicio);
		//////////////////////////////////BOTON DOCUMENTOS///////////////////////////////////////////////////////////////
		JButton btnDocumentos = new JButton("Documentos");
		btnDocumentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDocumentos.setBounds(84, 49, 85, 21);
		tituloPrincipal.add(btnDocumentos);
		//////////////////////////////////BOTON AUTORES///////////////////////////////////////////////////////////////
		JButton btnNewButton_1_1 = new JButton("Autores");
		btnNewButton_1_1.setBounds(171, 49, 85, 21);
		tituloPrincipal.add(btnNewButton_1_1);
		//////////////////////////////////BOTONPOCAS HISTORICAS///////////////////////////////////////////////////////////////
		JButton btnNewButton_1_1_1 = new JButton("Epocas Historicas");
		btnNewButton_1_1_1.setBounds(255, 49, 85, 21);
		tituloPrincipal.add(btnNewButton_1_1_1);
		//////////////////////////////////BOTON POCAS CATEGORIAS///////////////////////////////////////////////////////////////
		JButton btnNewButton_1_1_1_1 = new JButton("Epocas Historicas");
		btnNewButton_1_1_1_1.setBounds(341, 49, 95, 21);
		tituloPrincipal.add(btnNewButton_1_1_1_1);
		
		
		
		////////////////////////////////////////////////////TEXTO///////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////NOMBRE PRINCIPAL TITULO 1 : AETAS HISTORIA///////////////////////////////////////////////////////////////
		JLabel textoLogo = new JLabel("Aetas Historia");
		textoLogo.setBounds(171, 10, 85, 13);
		tituloPrincipal.add(textoLogo);
		///////////////////////////////////////TEXTO BUSQUEDA////////////////////////////////////////////////////////////////////////////////////777
		JLabel textoBusqueda = new JLabel("Busqueda");
		textoBusqueda.setBounds(240, 26, 85, 13);
		tituloPrincipal.add(textoBusqueda);
		///////////////////////////////////////BUSCADOR////////////////////////////////////////////////////////////////////////////////////777
		busqueda = new JTextField();
		busqueda.setColumns(10);
		busqueda.setBounds(291, 23, 145, 19);
		tituloPrincipal.add(busqueda);
		//////////////////////////////////////NOMBRE DOCUMENTO  TEXTO///////////////////////////////////////////////////////////////////////////////////
		JLabel texto1 = new JLabel("Nombre del documento");
		texto1.setBounds(20, 91, 130, 13);
		tituloPrincipal.add(texto1);
		//////////////////////////////////////IDENTIFICADOR DOCUMENTO TEXTO////////////////////////////////////////////////////////////////////////////////////
		JLabel titulo2 = new JLabel("Identificador Documento");
		titulo2.setBounds(20, 114, 130, 13);
		tituloPrincipal.add(titulo2);
		//////////////////////////////////////IDENTIFICADOR DOCUMENTO TEXTO////////////////////////////////////////////////////////////////////////////////////
		JLabel titulo3 = new JLabel("Autor");
		titulo3.setBounds(20, 135, 45, 13);
		tituloPrincipal.add(titulo3);
		//////////////////////////////////////EPOCA HISTORICA TEXTO///////////////////////////////////////////////////////////////////////////////////
		JLabel titulo4 = new JLabel("Epoca Historica");
		titulo4.setBounds(20, 157, 105, 13);
		tituloPrincipal.add(titulo4);
		//////////////////////////////////////CATEGORIA TEXTO////////////////////////////////////////////////////////////////////////////////////
		JLabel titulo5 = new JLabel("Categoria");
		titulo5.setBounds(20, 181, 45, 13);
		tituloPrincipal.add(titulo5);
		
		
		/////////////////////////////////////////////////////CAMPOS RELLENAR DOCUMENOS//////////////////////////////////////////////////////////////////////////////////////7
		rellenar1 = new JTextField();
		rellenar1.setBounds(181, 88, 234, 19);
		tituloPrincipal.add(rellenar1);
		rellenar1.setColumns(10);
		
		rellenar2 = new JTextField();
		rellenar2.setColumns(10);
		rellenar2.setBounds(181, 111, 234, 19);
		tituloPrincipal.add(rellenar2);
		
		rellenar3 = new JTextField();
		rellenar3.setColumns(10);
		rellenar3.setBounds(181, 132, 234, 19);
		tituloPrincipal.add(rellenar3);
		
		rellenar4 = new JTextField();
		rellenar4.setColumns(10);
		rellenar4.setBounds(181, 154, 234, 19);
		tituloPrincipal.add(rellenar4);
		
		rellenar5 = new JTextField();
		rellenar5.setColumns(10);
		rellenar5.setBounds(181, 178, 234, 19);
		tituloPrincipal.add(rellenar5);
		
		
	}
}
