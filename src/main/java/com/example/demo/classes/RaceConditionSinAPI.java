package com.example.demo.classes;

public class RaceConditionSinAPI {
    private static int contador = 0;

    public void execute() {
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador++;
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador++;
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor del contador: " + contador);
    }
}
