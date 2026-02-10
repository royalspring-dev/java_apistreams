package com.royalspring;

import java.util.List;

public class ConsultaProductosEconomicos {
    public static void main(String[] args) {
        List<Producto> productos = ProductosDataInitializer.getTodosProductos();

        // Productos con precio menor a 1500 CLP
        List<Producto> productosEconomicos = productos.stream()
                .filter(p -> p.getPrecio() < 1500)
                .toList();

        System.out.println("=== PRODUCTOS ECONÓMICOS (<1500 CLP) ===");
        productosEconomicos.forEach(p ->
                System.out.printf("%s - $%d%n", p.getNombre(), p.getPrecio()));
        System.out.println("Total: " + productosEconomicos.size());
    }
}