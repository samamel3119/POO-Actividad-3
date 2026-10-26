package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaPrisma extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, volumen, superficie,etiquetaImagen;
    private JTextField campoBase, campoAltura;
    private JButton calcular;
    public ventanaPrisma() {
        inicio();
        setTitle("Prisma");
        setSize(390, 210);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        base = new JLabel();
        base.setText("Base (cms):");
        base.setBounds(20, 20, 135, 23);
        campoBase = new JTextField();
        campoBase.setBounds(100, 20, 135, 23);
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(100, 50, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 80, 135, 23);
        calcular.addActionListener(this);
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 110, 135, 23);
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 140, 135, 23);
        ImageIcon iconoOriginal = new ImageIcon("Prisma.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        etiquetaImagen = new JLabel(new ImageIcon(imagenEscalada));
        etiquetaImagen.setBounds(240, 15, 110, 110);
        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(etiquetaImagen);
    }
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double baseVal = 0;
        double alturaVal = 0;
        try {
            baseVal = Double.parseDouble(campoBase.getText());
            alturaVal = Double.parseDouble(campoAltura.getText());
            Prisma prisma = new Prisma(baseVal, alturaVal);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", prisma.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", prisma.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}