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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAccesoInvestigador extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaAccesoInvestigador frame = new VentanaAccesoInvestigador();
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
    public VentanaAccesoInvestigador() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Botón "Accede" - Investigador
        JButton botonAccedeInvestigador = new JButton("Accede");
        botonAccedeInvestigador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción al hacer clic (opcional)
            }
        });
        botonAccedeInvestigador.setBounds(172, 161, 115, 42);
        contentPane.add(botonAccedeInvestigador);

        ////////////////////////////////////////// BOTON REGISTRATE
        ////////////////////////////////////////// INVESTIGADOR///////////////////////////////////////////////
        // Botón "Registrate"
        JButton botonRegistroInvestigador = new JButton("Registrate");
        botonRegistroInvestigador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Abrir la nueva ventana de RegistroInvestigador
                VentanaAccesoInvestigador registroInv = new VentanaAccesoInvestigador();
                registroInv.setVisible(true);

                // Opcional: ocultar esta ventana actual
                setVisible(false);
            }
        });
        botonRegistroInvestigador.setBounds(172, 89, 115, 42);

        // Estilo del botón - igual al botón "Investigador"
        botonRegistroInvestigador.setBackground(new Color(244, 164, 96)); // Sandy Brown
        botonRegistroInvestigador.setForeground(Color.WHITE);              // Texto blanco
        botonRegistroInvestigador.setFont(new Font("Arial", Font.BOLD, 14));
        botonRegistroInvestigador.setOpaque(false);
        botonRegistroInvestigador.setContentAreaFilled(false); // Hacer fondo transparente
        botonRegistroInvestigador.setBorderPainted(true);
        botonRegistroInvestigador.setFocusPainted(false);
        botonRegistroInvestigador.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde redondeado

        contentPane.add(botonRegistroInvestigador);

        ///////////////////////////////////// TEXTO
        ///////////////////////////////////// INVESTIGADOR/////////////////////////////////////
        JLabel enunciado1_1 = new JLabel("Investigador");
        enunciado1_1.setBounds(142, 26, 181, 53);
        contentPane.add(enunciado1_1);

        // Fuentes y estilo
        enunciado1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        enunciado1_1.setForeground(Color.WHITE);
        enunciado1_1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(enunciado1_1);

        /////////////////////////////// BOTON DE RETROCESO ////////////////////////////////////////////
        JButton botonRetrocesoventanaPrincipal = new JButton("🢀");
        botonRetrocesoventanaPrincipal.setBounds(10, 211, 55, 42);

        // Acción del botón: ir hacia atrás a VentanaPrincipal
        botonRetrocesoventanaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Cerrar esta ventana
                setVisible(false);
                dispose();

                // Abrir la ventana principal
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            }
        });

        contentPane.add(botonRetrocesoventanaPrincipal);
    }
}