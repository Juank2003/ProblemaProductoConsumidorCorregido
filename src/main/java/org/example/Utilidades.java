package org.example;

import java.util.Random;

public class Utilidades {
    private static Random random = new Random();

    // Genera un número aleatorio entre 0 y max (exclusivo)
    public static int numAzar(int max) {
        return random.nextInt(max);
    }

    public static void esperarTiempoAzar(int maxTiempo) {
        try {
            Thread.sleep(random.nextInt(maxTiempo));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}