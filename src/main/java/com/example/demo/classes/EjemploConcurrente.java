package com.example.demo.classes;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class EjemploConcurrente {
    public void execute() {
        // Crear un Executor que utiliza un grupo de hilos (ThreadPool)
        Executor executor = Executors.newFixedThreadPool(2);

        // Definir tareas a ejecutar
        Runnable tarea1 = () -> {
            System.out.println("Tarea 1 ejecutada por " + Thread.currentThread().getName());
        };

        Runnable tarea2 = () -> {
            System.out.println("Tarea 2 ejecutada por " + Thread.currentThread().getName());
        };

        // Ejecutar las tareas de forma concurrente
        executor.execute(tarea1);
        executor.execute(tarea2);
    }
}
