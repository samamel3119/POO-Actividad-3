package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaCubo extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel lado, volumen, superficie,etiquetaImagen;
    private JTextField campoLado;
    private JButton calcular;

    public ventanaCubo() {
        inicio();
        setTitle("Cubo");
        setSize(370, 210);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        lado = new JLabel();
        lado.setText("Lado (cms):");
        lado.setBounds(20, 20, 135, 23);
        campoLado = new JTextField();
        campoLado.setBounds(100, 20, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 60, 135, 23);
        calcular.addActionListener(this);
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 110, 135, 23);
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 140, 135, 23);
        ImageIcon iconoOriginal = new ImageIcon("Cubo.jpg");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        etiquetaImagen = new JLabel(new ImageIcon(imagenEscalada));
        etiquetaImagen.setBounds(240, 15, 110, 110);
        contenedor.add(lado);
        contenedor.add(campoLado);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(etiquetaImagen);
    }
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double ladoVal = 0;
        try {
            ladoVal = Double.parseDouble(campoLado.getText());
            Cubo cubo = new Cubo(ladoVal);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", cubo.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", cubo.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}