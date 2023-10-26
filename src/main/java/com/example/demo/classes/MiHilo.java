package com.example.demo.classes;

public class MiHilo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo: " + Thread.currentThread().getId() + " Contador: " + i);
        }
    }
}
