package com.royalspring;

import java.time.LocalDate;

public class ProductoPanaderia {
    private String nombre;
    private String tipo; // "pan", "pastel", "galleta", "bollo", "tarta"
    private double precio;
    private int unidadesStock;
    private LocalDate fechaFabricacion;
    private boolean sinGluten;
    private double pesoGramos;
    private int caloriasPorcion;
    private boolean vegano;
    private String proveedor;

    public ProductoPanaderia(String nombre, String tipo, double precio, int unidadesStock,
                             LocalDate fechaFabricacion, boolean sinGluten, double pesoGramos,
                             int caloriasPorcion, boolean vegano, String proveedor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.unidadesStock = unidadesStock;
        this.fechaFabricacion = fechaFabricacion;
        this.sinGluten = sinGluten;
        this.pesoGramos = pesoGramos;
        this.caloriasPorcion = caloriasPorcion;
        this.vegano = vegano;
        this.proveedor = proveedor;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }
    public int getUnidadesStock() { return unidadesStock; }
    public LocalDate getFechaFabricacion() { return fechaFabricacion; }
    public boolean isSinGluten() { return sinGluten; }
    public double getPesoGramos() { return pesoGramos; }
    public int getCaloriasPorcion() { return caloriasPorcion; }
    public boolean isVegano() { return vegano; }
    public String getProveedor() { return proveedor; }

    @Override
    public String toString() {
        return String.format("%-20s %-10s $%-6.2f Stock:%-3d %s",
                nombre, tipo, precio, unidadesStock,
                sinGluten ? "Sin gluten" : "");
    }
}