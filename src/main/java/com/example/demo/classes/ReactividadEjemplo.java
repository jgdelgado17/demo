package com.example.demo.classes;

import reactor.core.publisher.Flux;

public class ReactividadEjemplo {
    public void execute() {
        Flux<Integer> numeros = Flux.range(1, 5);

        numeros.subscribe(
            numero -> System.out.println("Número recibido: " + numero),
            error -> System.err.println("Error: " + error),
            () -> System.out.println("Flujo completado")
        );
    }
}

