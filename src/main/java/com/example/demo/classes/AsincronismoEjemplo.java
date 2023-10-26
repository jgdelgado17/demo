package com.example.demo.classes;

import java.util.concurrent.CompletableFuture;

public class AsincronismoEjemplo {
    public void execute() {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Realizar trabajo pesado en segundo plano
            System.out.println("Tarea en segundo plano ejecutándose...");
        });

        // El hilo principal no se bloquea y puede realizar otras tareas
        System.out.println("Hilo principal continúa ejecutándose...");

        // Esperar a que la tarea en segundo plano termine (esto es opcional)
        future.join();
    }
}

