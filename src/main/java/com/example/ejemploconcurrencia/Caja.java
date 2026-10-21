package com.example.ejemploconcurrencia;

public class Caja {
    private int cantidadVentas = 0;
    private int totalRecaudado = 0;

    /**
     * syncronized permite que solamente un Thread (Hilo) Ejecute el metodo a la vez.
    */

    public  void registrarVentas(String vendedor, int monto) {
        cantidadVentas++;
        totalRecaudado += monto;
        System.out.println(vendedor + " registró venta: " + monto
                + " | Ventas acumuladas: " + cantidadVentas
                + " | Total C$: " + totalRecaudado);
    }

    public synchronized int getCantidadVentas() {
        return cantidadVentas;
    }

    public synchronized int getTotalRecaudado() {
        return totalRecaudado;
    }
}