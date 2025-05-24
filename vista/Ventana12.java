// src/vista/Ventana12.java
package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import modelo.DocumentFullData;
import modelo.ConexionMySQL;

public class Ventana12 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel fotoFondo;

    /** Constructor por defecto para visitante sin logeo */
    public Ventana12() {
        this(null);
    }

    /** Constructor que recibe todos los datos de un documento */
    public Ventana12(DocumentFullData doc) {
        setTitle(doc != null ? doc.getTitulo() : "Visor de Documento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 550);

        contentPane = new JPanel(null);
        setContentPane(contentPane);

        // ----- fondo -----
        ImageIcon fondoIcon = new ImageIcon(
            getClass().getResource("/Fotos/biblioteca.png")
        );
        fotoFondo = new JLabel(fondoIcon);
        fotoFondo.setBounds(0, 0, getWidth(), getHeight());
        contentPane.add(fotoFondo);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                fotoFondo.setSize(getSize());
            }
        });

        if (doc != null) {
            // ----- Título -----
            JLabel lblTitulo = new JLabel("Título:");
            lblTitulo.setForeground(Color.WHITE);
            lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblTitulo.setBounds(30, 20, 100, 30);
            contentPane.add(lblTitulo);

            JLabel valTitulo = new JLabel(doc.getTitulo());
            valTitulo.setForeground(Color.WHITE);
            valTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            valTitulo.setBounds(140, 20, 600, 30);
            contentPane.add(valTitulo);

            // ----- Autor -----
            JLabel lblAutor = new JLabel("Autor:");
            lblAutor.setForeground(Color.WHITE);
            lblAutor.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblAutor.setBounds(30, 60, 100, 30);
            contentPane.add(lblAutor);

            JLabel valAutor = new JLabel(doc.getAutor());
            valAutor.setForeground(Color.WHITE);
            valAutor.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            valAutor.setBounds(140, 60, 600, 30);
            contentPane.add(valAutor);

            // ----- Descripción -----
            JLabel lblDesc = new JLabel("Descripción:");
            lblDesc.setForeground(Color.WHITE);
            lblDesc.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblDesc.setBounds(30, 100, 120, 30);
            contentPane.add(lblDesc);

            JTextArea valDesc = new JTextArea(doc.getDescripcion());
            valDesc.setForeground(Color.WHITE);
            valDesc.setBackground(new Color(0,0,0,80)); // semitransparente
            valDesc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            valDesc.setLineWrap(true);
            valDesc.setWrapStyleWord(true);
            valDesc.setEditable(false);
            JScrollPane scrollDesc = new JScrollPane(valDesc);
            scrollDesc.setBounds(140, 100, 600, 100);
            contentPane.add(scrollDesc);

            // ----- Año -----
            JLabel lblAnno = new JLabel("Año:");
            lblAnno.setForeground(Color.WHITE);
            lblAnno.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblAnno.setBounds(30, 220, 100, 30);
            contentPane.add(lblAnno);

            JLabel valAnno = new JLabel(String.valueOf(doc.getAnio()));
            valAnno.setForeground(Color.WHITE);
            valAnno.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            valAnno.setBounds(140, 220, 100, 30);
            contentPane.add(valAnno);

            // ----- Formato -----
            JLabel lblFormato = new JLabel("Formato:");
            lblFormato.setForeground(Color.WHITE);
            lblFormato.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblFormato.setBounds(30, 260, 120, 30);
            contentPane.add(lblFormato);

            JLabel valFormato = new JLabel(doc.getFormato());
            valFormato.setForeground(Color.WHITE);
            valFormato.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            valFormato.setBounds(140, 260, 200, 30);
            contentPane.add(valFormato);

            // ----- Colección -----
            JLabel lblColeccion = new JLabel("Colección:");
            lblColeccion.setForeground(Color.WHITE);
            lblColeccion.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblColeccion.setBounds(30, 300, 120, 30);
            contentPane.add(lblColeccion);

            JLabel valColeccion = new JLabel(doc.getColeccion());
            valColeccion.setForeground(Color.WHITE);
            valColeccion.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            valColeccion.setBounds(140, 300, 200, 30);
            contentPane.add(valColeccion);

            // ----- Fecha de subida -----
            JLabel lblFecha = new JLabel("Fecha subida:");
            lblFecha.setForeground(Color.WHITE);
            lblFecha.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblFecha.setBounds(30, 340, 140, 30);
            contentPane.add(lblFecha);

            JLabel valFecha = new JLabel(doc.getFechaDeSubida());
            valFecha.setForeground(Color.WHITE);
            valFecha.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            valFecha.setBounds(170, 340, 300, 30);
            contentPane.add(valFecha);

            // ----- Imagen -----
            String imgPath = doc.getImagenPath();
            if (imgPath != null && !imgPath.isBlank()) {
                ImageIcon icon = new ImageIcon(imgPath);
                Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                JLabel lblImg = new JLabel(new ImageIcon(img));
                lblImg.setBounds(550, 220, 200, 200);
                contentPane.add(lblImg);
            }
        } else {
            // mensaje visitante
            JLabel lblVis = new JLabel("Bienvenido, visitante sin logeo");
            lblVis.setForeground(Color.WHITE);
            lblVis.setFont(new Font("Times New Roman", Font.BOLD, 24));
            lblVis.setBounds(200, 200, 400, 50);
            contentPane.add(lblVis);
        }

        // ----- Botón Volver -----
        JButton btnVolver = new JButton("Volver");
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setBackground(Color.GRAY);
        btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnVolver.setBounds(600, 420, 158, 38);
        btnVolver.addActionListener(e -> {
            // abre Ventana11 de nuevo
            new Ventana11().setVisible(true);
            dispose();
        });
        contentPane.add(btnVolver);

        // manda fondo al fondo
        contentPane.setComponentZOrder(fotoFondo, contentPane.getComponentCount() - 1);
    }
}
