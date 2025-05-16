package Proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.JLabel;

public class buscador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscador frame = new buscador();
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
	public buscador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Documentos");
		btnNewButton.setBounds(82, 65, 96, 21);
		contentPane.add(btnNewButton);
		
		JButton btnAutores = new JButton("Autores");
		btnAutores.setBounds(175, 65, 85, 21);
		contentPane.add(btnAutores);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(0, 65, 85, 21);
		contentPane.add(btnInicio);
		
		JButton btnNewButton_1_1 = new JButton("Epocas Historicas");
		btnNewButton_1_1.setBounds(258, 65, 96, 21);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Categoria");
		btnNewButton_1_1_1.setBounds(351, 65, 85, 21);
		contentPane.add(btnNewButton_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(258, 36, 154, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Busqueda");
		lblNewLabel.setBounds(203, 42, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel logoAetasHistoria = new JLabel("Aetas Historia");
		logoAetasHistoria.setBounds(192, 10, 132, 13);
		contentPane.add(logoAetasHistoria);
		
		JLabel lblNombreDelDocumento = new JLabel("Nombre del Documento");
		lblNombreDelDocumento.setBounds(10, 112, 132, 13);
		contentPane.add(lblNombreDelDocumento);
		
		JLabel lblIdentificacionDelDocumento = new JLabel("Identificacion del documento");
		lblIdentificacionDelDocumento.setBounds(10, 135, 132, 13);
		contentPane.add(lblIdentificacionDelDocumento);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 156, 132, 13);
		contentPane.add(lblAutor);
		
		JLabel lblEpocaHisytorica = new JLabel("Epoca Historica");
		lblEpocaHisytorica.setBounds(10, 179, 132, 13);
		contentPane.add(lblEpocaHisytorica);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 202, 132, 13);
		contentPane.add(lblCategoria);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 109, 154, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 132, 154, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(181, 153, 154, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(181, 176, 154, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(181, 199, 154, 19);
		contentPane.add(textField_5);
	}
}
