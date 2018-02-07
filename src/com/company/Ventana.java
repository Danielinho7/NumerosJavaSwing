package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;
    private JDialog dia;
    private JLabel etiquetas;
    public Ventana() {

        super("JUEGO DE NUMEROS");
        etiqueta = new JLabel("DIME UN NUMERO");
        campo = new JTextField(4);
        jugar = new JButton("JUGAR");
        dia = new JDialog(this);
        dia.setSize(500,500);
        etiquetas = new JLabel();
        JDialog jug = new JDialog(this);

        FlowLayout f = new FlowLayout();
        setLayout(f);
        add(etiqueta);
        add(campo);
        add(jugar);
        dia.add(etiquetas);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("PERDISTE");
                jugar();
            }
        });

    }
    private void jugar () {
        String valor = campo.getText();
        int num = Integer.parseInt(valor);
        num++;
        etiquetas.setText("MI NUMERO" + num + "TE GANE");
        dia.setVisible(true);

    }
}
