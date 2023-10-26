package com.example.demo.classes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionEjemploConAPI {
    private static AtomicInteger contador = new AtomicInteger(0);

    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                // Incrementar el contador sin sincronización
                contador.incrementAndGet();
            });
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // Esperar a que todos los hilos terminen
        }

        System.out.println("Valor del contador: " + contador);
    }
}

