// src/vista/Ventana5.java
package vista;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import modelo.ConexionMySQL;

public class Ventana5 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtTitulo, txtAutor, txtDescripcion,
                       txtAnio, txtColeccion, txtFormato,
                       txtImagenPath;
    private JLabel fotoFondo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Ventana5().setVisible(true));
    }

    public Ventana5() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 480);

        // 1) Panel principal con layout null
        contentPane = new JPanel(null);
        setContentPane(contentPane);

        // 2) Carga el fondo y añade al panel
        ImageIcon fondoIcon = new ImageIcon(
            getClass().getResource("/Fotos/biblioteca.png")
        );
        fotoFondo = new JLabel(fondoIcon);
        fotoFondo.setBounds(0, 0, getWidth(), getHeight());
        contentPane.add(fotoFondo);

        // 3) Component listener para redimensionar el fondo
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                fotoFondo.setSize(getSize());
            }
        });

        // 4) Añade todos los controles encima del fondo
        addLabel("Nombre del documento", 10, 168);
        addLabel("Nombre del Autor",     10, 204);
        addLabel("Descripción",          10, 243);
        addLabel("Año",                  10, 274);
        addLabel("Colección",            10, 313);
        addLabel("Formato",              10, 355);
        addLabel("Imagen (.png/.jpg)",   10, 395);

        txtTitulo      = addTF(354, 191);
        txtAutor       = addTF(354, 227);
        txtDescripcion = addTF(354, 266);
        txtAnio        = addTF(354, 297);
        txtColeccion   = addTF(354, 336);
        txtFormato     = addTF(354, 380);
        txtImagenPath  = addTF(354, 415);
        txtImagenPath.setEditable(false);

        JButton btnImagen = makeButton("Seleccionar Imagen", 600, 412);
        contentPane.add(btnImagen);
        btnImagen.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                txtImagenPath.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        });

        JButton btnCrear = makeButton("Crear Documento", 600, 350);
        contentPane.add(btnCrear);
        btnCrear.addActionListener((ActionEvent e) -> {
            String titulo      = txtTitulo.getText().trim();
            String autor       = txtAutor.getText().trim();
            String descripcion = txtDescripcion.getText().trim();
            String anioStr     = txtAnio.getText().trim();
            String coleccion   = txtColeccion.getText().trim();
            String formato     = txtFormato.getText().trim();
            String imagenPath  = txtImagenPath.getText().trim();

            int anio;
            try { anio = Integer.parseInt(anioStr); }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El campo Año debe ser numérico.");
                return;
            }

            String fechaHora = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            ConexionMySQL conexion = new ConexionMySQL(
                "localhost","3306","root","","aetas_historia"
            );
            if (!conexion.success()) {
                JOptionPane.showMessageDialog(this, "Error de conexión a la BD.");
                return;
            }

            boolean ok = conexion.añadirDocumento(
                titulo, descripcion, autor, anio,
                formato, coleccion, fechaHora,
                imagenPath
            );
            if (!ok) {
                JOptionPane.showMessageDialog(this, "No se pudo guardar el documento.");
                return;
            }

            new Ventana11().setVisible(true);
            dispose();
        });

        getRootPane().setDefaultButton(btnCrear);

        // 5) Tras añadir todos los controles, mueve el fondo al fondo (z-order más alto)
        contentPane.setComponentZOrder(fotoFondo, contentPane.getComponentCount() - 1);
    }

    private void addLabel(String text, int x, int y) {
        JLabel lbl = new JLabel(text);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lbl.setBounds(x, y, 300, 30);
        contentPane.add(lbl);
    }

    private JTextField addTF(int x, int y) {
        JTextField tf = new JTextField();
        tf.setBounds(x, y, 226, 19);
        contentPane.add(tf);
        return tf;
    }

    private JButton makeButton(String txt, int x, int y) {
        JButton b = new JButton(txt);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setBorderPainted(false);
        b.setBackground(Color.GRAY);
        b.setBounds(x, y, 158, 38);
        return b;
    }
}
