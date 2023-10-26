package com.example.demo.classes;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionConAPI {
    private static AtomicInteger contador = new AtomicInteger(0);

    public void execute() {
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador.incrementAndGet();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador.incrementAndGet();
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
