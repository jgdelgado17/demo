package com.example.demo.classes;

public class EjemploCallback {
    private interface Callback {
        void onComplete(String resultado);
    }

    private static void tareaAsincronica(Callback callback) {
        // Simular una tarea asincrónica
        new Thread(() -> {
            String resultado = "Tarea completada";
            callback.onComplete(resultado);
        }).start();
    }

    public void execute() {
        tareaAsincronica(resultado -> {
            System.out.println("Callback: " + resultado);
        });
    }
}
