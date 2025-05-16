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
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class investigadorRegistro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    investigadorRegistro frame = new investigadorRegistro();
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
    public investigadorRegistro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registro - Investigador");
        setBounds(100, 100, 450, 300);

        // Panel principal
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Campos de texto
        textField = new JTextField();
        textField.setBounds(226, 42, 200, 30);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(226, 82, 200, 30);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(226, 167, 200, 30);
        contentPane.add(textField_2);

        //////////////////////////////TEXTO TITULO REGISTRATE//////////////////////////////////////////////////////////////////////
        JLabel registrateTitulo = new JLabel("Registrate");
        registrateTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        registrateTitulo.setForeground(Color.WHITE);
        registrateTitulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
        registrateTitulo.setBounds(154, 0, 131, 61);
        registrateTitulo.setOpaque(false);
        contentPane.add(registrateTitulo);

        //////////////////////////////TEXTO NOMBRE//////////////////////////////////////////////////////////////////////////////////////////////////
        JLabel nombreTexto = new JLabel("Nombre");
        nombreTexto.setHorizontalAlignment(SwingConstants.CENTER);
        nombreTexto.setForeground(Color.WHITE);
        nombreTexto.setFont(new Font("Times New Roman", Font.BOLD, 18));
        nombreTexto.setBounds(-12, 24, 131, 61);
        nombreTexto.setOpaque(false);
        contentPane.add(nombreTexto);

        /////////////////////////////TEXTO APELLIDOS//////////////////////////////////////////////////////////////////////////////////////////////////
        JLabel ApellidosTexto = new JLabel("Apellidos");
        ApellidosTexto.setHorizontalAlignment(SwingConstants.CENTER);
        ApellidosTexto.setForeground(Color.WHITE);
        ApellidosTexto.setFont(new Font("Times New Roman", Font.BOLD, 18));
        ApellidosTexto.setBounds(-12, 64, 131, 61);
        ApellidosTexto.setOpaque(false);
        contentPane.add(ApellidosTexto);

        //////////////////////////////TEXTO CORREO ELECTRONICO//////////////////////////////////////////////////////////////////////////////////////////////////
        JLabel correoElectronicoTexto = new JLabel("Correo Electrónico");
        correoElectronicoTexto.setHorizontalAlignment(SwingConstants.CENTER);
        correoElectronicoTexto.setForeground(Color.WHITE);
        correoElectronicoTexto.setFont(new Font("Times New Roman", Font.BOLD, 18));
        correoElectronicoTexto.setBounds(-12, 149, 206, 61);
        correoElectronicoTexto.setOpaque(false);
        contentPane.add(correoElectronicoTexto);

        //////////////////////////////BOTÓN RETROCESO///////////////////////////////////////
        JButton botonRetrocesoventanaPrincipal = new JButton("🢀");
        botonRetrocesoventanaPrincipal.setBounds(10, 211, 55, 42);

        // Acción del botón: ir hacia atrás a VentanaPrincipal
        botonRetrocesoventanaPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar esta ventana
                setVisible(false);
                dispose();

                // Abrir la ventana principal
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            }
        });

        contentPane.add(botonRetrocesoventanaPrincipal);

        //////////////////////////////BOTÓN ENVIAR///////////////////////////////////////
        JButton btnNewButton = new JButton("Enviar");
        btnNewButton.setBounds(213, 222, 85, 21);

        // Estilo del botón
        btnNewButton.setBackground(new Color(244, 164, 96));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton.setOpaque(false);
        btnNewButton.setContentAreaFilled(false);
        btnNewButton.setBorderPainted(true);
        btnNewButton.setFocusPainted(false);
        btnNewButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));

        // Acción del botón Enviar (opcional)
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar lógica para guardar en BD o validar campos
                String nombre = textField.getText();
                String apellidos = textField_1.getText();
                String correo = textField_2.getText();

                if (!nombre.isEmpty() && !apellidos.isEmpty() && !correo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Registro completado:\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nCorreo: " + correo);
                    
                    // Opcional: volver a ventana principal
                    setVisible(false);
                    new VentanaPrincipal().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
                }
            }
        });

        contentPane.add(btnNewButton);
        
        JLabel lblNumeroDeInvestigador = new JLabel("Numero de investigador");
        lblNumeroDeInvestigador.setOpaque(false);
        lblNumeroDeInvestigador.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumeroDeInvestigador.setForeground(Color.WHITE);
        lblNumeroDeInvestigador.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNumeroDeInvestigador.setBounds(20, 109, 180, 61);
        contentPane.add(lblNumeroDeInvestigador);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(226, 127, 200, 30);
        contentPane.add(textField_3);
    }
}