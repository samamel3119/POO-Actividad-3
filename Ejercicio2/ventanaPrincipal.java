package Ejercicio2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ventanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide, Cubo, prisma;
    public ventanaPrincipal(){
        inicio();
        setTitle("Figuras");
        setSize(385, 175);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 25, 100, 30);
        cilindro.addActionListener(this);
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(130, 25, 100, 30);
        esfera.addActionListener(this);
        piramide = new JButton();
        piramide.setText("Pirámide");
        piramide.setBounds(240, 25, 100, 30);
        piramide.addActionListener(this);
        Cubo = new JButton();
        Cubo.setText("Cubo");
        Cubo.setBounds(75, 70, 100, 30);
        Cubo.addActionListener(this);
        prisma = new JButton();
        prisma.setText("Prisma");
        prisma.setBounds(185, 70, 100, 30);
        prisma.addActionListener(this);
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(Cubo);
        contenedor.add(prisma);
    }
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            VentanaEsfera esfera = new VentanaEsfera();
            esfera.setVisible(true);
        }if (evento.getSource() == cilindro) {
            ventanaCilindro cilindro = new ventanaCilindro();
            cilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) {
            ventanaPiramide piramide = new ventanaPiramide();
            piramide.setVisible(true);
        }
        if (evento.getSource() == Cubo) {
            ventanaCubo cubo = new ventanaCubo();
            cubo.setVisible(true);
        }
        if (evento.getSource() == prisma) {
            ventanaPrisma prisma = new ventanaPrisma();
            prisma.setVisible(true);
        }
    }
}
