package com.example.ejemploconcurrencia;

public class Caja {
    private int cantidadVentas = 0;
    private int totalRecaudado = 0;

    /**
     * syncronized permite que solamente un Thread (Hilo) Ejecute el metodo a  la vez.
    */
/** Uso `synchronized` para ponerle seguro a la caja: solo un vendedor puede registrar una venta a la vez y
 * así evito que dos hilos choquen y me descuadren el dinero. Si dejara solo `public void`,
 * todos entrarían al mismo tiempo, se pisarían los datos y terminaría perdiendo registros.*/
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