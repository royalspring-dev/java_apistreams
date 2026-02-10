package com.royalspring.model;

public enum CategoriaPrecio {
    ECONOMICO(0, 1000),
    MEDIO(1001, 3000),
    PREMIUM(3001, 7000),
    LUJO(7001, 15000);

    private final int minPrecio;
    private final int maxPrecio;

    CategoriaPrecio(int minPrecio, int maxPrecio) {
        this.minPrecio = minPrecio;
        this.maxPrecio = maxPrecio;
    }

    public boolean estaEnRango(int precio) {
        return precio >= minPrecio && precio <= maxPrecio;
    }
}
