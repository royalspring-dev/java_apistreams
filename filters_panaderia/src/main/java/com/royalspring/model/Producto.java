package com.royalspring.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private TipoProducto tipo;
    private int precio; // en CLP
    private int unidadesStock;
    private boolean esVegano;
    private boolean contieneGluten;
    private boolean esSinAzucar;
    private LocalDate fechaElaboracion;
    private int diasCaducidad;
    private Set<HorarioConsumo> horariosRecomendados;
    private double pesoGramos;
    private int calorias;
    private boolean esArtesanal;

    // Constructor, getters, setters
    public Producto(String id, String nombre, String descripcion, TipoProducto tipo,
                    int precio, int unidadesStock, boolean esVegano, boolean contieneGluten,
                    boolean esSinAzucar, LocalDate fechaElaboracion, int diasCaducidad,
                    Set<HorarioConsumo> horariosRecomendados, double pesoGramos,
                    int calorias, boolean esArtisanal) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.unidadesStock = unidadesStock;
        this.esVegano = esVegano;
        this.contieneGluten = contieneGluten;
        this.esSinAzucar = esSinAzucar;
        this.fechaElaboracion = fechaElaboracion;
        this.diasCaducidad = diasCaducidad;
        this.horariosRecomendados = horariosRecomendados;
        this.pesoGramos = pesoGramos;
        this.calorias = calorias;
        this.esArtesanal = esArtesanal;
    }

    public LocalDate getFechaCaducidad() {
        return fechaElaboracion.plusDays(diasCaducidad);
    }

    public boolean estaCaducado() {
        return LocalDate.now().isAfter(getFechaCaducidad());
    }

    public boolean estaPorCaducar(int diasAntelacion) {
        return LocalDate.now().plusDays(diasAntelacion).isAfter(getFechaCaducidad());
    }

    public CategoriaPrecio getCategoriaPrecio() {
        return Arrays.stream(CategoriaPrecio.values())
                .filter(categoria -> categoria.estaEnRango(this.precio))
                .findFirst()
                .orElse(CategoriaPrecio.LUJO);
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public TipoProducto getTipo() { return tipo; }
    public int getPrecio() { return precio; }
    public int getUnidadesStock() { return unidadesStock; }
    public boolean isEsVegano() { return esVegano; }
    public boolean isContieneGluten() { return contieneGluten; }
    public boolean isEsSinAzucar() { return esSinAzucar; }
    public LocalDate getFechaElaboracion() { return fechaElaboracion; }
    public Set<HorarioConsumo> getHorariosRecomendados() { return horariosRecomendados; }
    public double getPesoGramos() { return pesoGramos; }
    public int getCalorias() { return calorias; }
    public boolean isEsArtesanal() { return esArtesanal; }
}