package com.example.demo.classes;

import java.awt.*;
import java.awt.event.*;

public class EjemploListener {
    public void execute() {
        Frame frame = new Frame("Ejemplo Listener");
        Button button = new Button("Haz clic");

        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón clicado");
            }
        });

        frame.add(button);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
