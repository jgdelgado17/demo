package com.example.demo.classes;

// Al ejecutar múltiples veces el código a continuación, el resultado será diferente, 
// observándose cómo una condición de carrera ("race condition") causa que los hilosaccedan al recurso compartido 
// (en este ejemplo, la variable contador) en diferentes momentos de la ejecución, 
// interfiriendo unos con otros y generando un resultado impredecible.
public class RaceCondition implements Runnable {
    private int contador = 0;

    private void incrementarContador() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contador++;
    }

    private int obtenerContador() {
        return contador;
    }

    @Override
    public void run() {
        incrementarContador();
        System.out.println(
                "Valor luego de incrementar el " + Thread.currentThread().getName() + ": " + obtenerContador());
    }

    public void execute() {
        RaceCondition contador = new RaceCondition();
        Thread hilo1 = new Thread(contador, "primer hilo");
        Thread hilo2 = new Thread(contador, "segundo hilo");
        Thread hilo3 = new Thread(contador, "tercer hilo");

        // La llamada a start() hace que se ejecute el método run
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
