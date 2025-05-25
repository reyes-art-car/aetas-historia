// src/vista/Ventana11.java
package vista;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;
import modelo.ConexionMySQL;
import modelo.DocumentFullData;

public class Ventana11 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel fotoFondo;
    private JTextField txtBuscar;
    private JList<String> list;
    private DefaultListModel<String> model;
    private List<String> allTitles;
    private ConexionMySQL conexion;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Ventana11().setVisible(true));
    }

    public Ventana11() {
        setTitle("Listado de Documentos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 480);

        // Panel principal
        contentPane = new JPanel(null);
        setContentPane(contentPane);

        // Fondo
        ImageIcon fondoIcon = new ImageIcon(getClass().getResource("/Fotos/biblioteca.png"));
        fotoFondo = new JLabel(fondoIcon);
        fotoFondo.setBounds(0, 0, getWidth(), getHeight());
        contentPane.add(fotoFondo);
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                fotoFondo.setSize(getSize());
            }
        });

        // Encabezado
        JLabel header = new JLabel("Documentos Registrados");
        header.setFont(new Font("Times New Roman", Font.BOLD, 36));
        header.setForeground(Color.WHITE);
        header.setBounds(180, 10, 450, 40);
        contentPane.add(header);

        // Campo de búsqueda
        JLabel lblBuscar = new JLabel("Buscar:");
        lblBuscar.setForeground(Color.WHITE);
        lblBuscar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblBuscar.setBounds(34, 60, 60, 25);
        contentPane.add(lblBuscar);

        txtBuscar = new JTextField();
        txtBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        txtBuscar.setBounds(100, 60, 300, 25);
        contentPane.add(txtBuscar);

        // Lista de documentos
        model = new DefaultListModel<>();
        list = new JList<>(model);
        list.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(34, 100, 700, 300);
        contentPane.add(scroll);

        // Cargar datos de la BD
        conexion = new ConexionMySQL("localhost","3306","root","","aetas_historia");
        if (!conexion.success()) {
            JOptionPane.showMessageDialog(this, "Error de conexión a la BD.");
            return;
        }
        List<DocumentFullData> docs = conexion.getAllDocuments();
        allTitles = docs.stream()
                        .map(DocumentFullData::getTitulo)
                        .collect(Collectors.toList());
        // Inicializar lista completa
        updateList("");

        // Filtrado en tiempo real
        txtBuscar.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { filter(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { filter(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { filter(); }
            private void filter() {
                updateList(txtBuscar.getText());
            }
        });

        // Doble clic abre Ventana12
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int idx = list.locationToIndex(e.getPoint());
                    String titulo = model.getElementAt(idx);
                    DocumentFullData full = conexion.getDocumentByTitle(titulo);
                    if (full != null) {
                        new Ventana12(full).setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo cargar la información.");
                    }
                }
            }
        });

        // Botón Volver
        JButton btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setBackground(Color.GRAY);
        btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnVolver.setBounds(600, 380, 158, 38);
        btnVolver.addActionListener(e -> {
            new Ventana5().setVisible(true);
            dispose();
        });
        contentPane.add(btnVolver);

        // Enviar fondo al fondo
        contentPane.setComponentZOrder(fotoFondo, contentPane.getComponentCount() - 1);
    }

    /** Actualiza el modelo de la JList según el filtro */
    private void updateList(String filter) {
        model.clear();
        String lower = filter.toLowerCase();
        for (String title : allTitles) {
            if (title.toLowerCase().contains(lower)) {
                model.addElement(title);
            }
        }
    }
}
