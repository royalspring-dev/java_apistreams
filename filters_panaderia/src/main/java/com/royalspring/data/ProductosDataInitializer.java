package com.royalspring.data;

import com.royalspring.model.HorarioConsumo;
import com.royalspring.model.Producto;
import com.royalspring.model.TipoProducto;

import java.time.LocalDate;
import java.util.*;

public class ProductosDataInitializer {
    private static final List<Producto> productos = new ArrayList<>();

    static {
        inicializarProductos();
    }

    private static void inicializarProductos() {
        // Productos tipo PAN (16 productos)
        productos.add(new Producto("P001", "Marraqueta", "Pan clásico chileno", TipoProducto.PAN, 1200, 150,
                true, true, false, LocalDate.now().minusDays(1), 3,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE, HorarioConsumo.ALMUERZO, HorarioConsumo.CENA),
                250, 650, false));

        productos.add(new Producto("P002", "Hallulla Premium", "Hallulla artesanal mantequilla", TipoProducto.PAN, 1800, 80,
                true, true, false, LocalDate.now(), 2,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 200, 700, true));

        productos.add(new Producto("P003", "Pan Amasado Integral", "Pan amasado con harina integral", TipoProducto.PAN, 1500, 60,
                true, true, true, LocalDate.now().minusDays(1), 4,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.MERIENDA), 300, 550, false));

        productos.add(new Producto("P004", "Dobladitas", "Pan doblado relleno manteca", TipoProducto.PAN, 800, 200,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.DESAYUNO), 150, 450, false));

        productos.add(new Producto("P005", "Pan de Completo", "Pan especial para completos", TipoProducto.PAN, 1000, 120,
                true, true, false, LocalDate.now().minusDays(2), 5,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.CENA), 180, 400, false));

        productos.add(new Producto("P006", "Pan Baguette Artesanal", "Baguette larga crocante", TipoProducto.PAN, 2200, 40,
                true, true, false, LocalDate.now(), 2,
                Set.of(HorarioConsumo.ALMUERZO, HorarioConsumo.CENA), 350, 850, true));

        productos.add(new Producto("P007", "Pan Sin Gluten", "Para celíacos", TipoProducto.PAN, 3200, 30,
                true, false, false, LocalDate.now().minusDays(1), 3,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 200, 500, true));

        productos.add(new Producto("P008", "Pan de Pascua Premium", "Navideño con frutas secas", TipoProducto.PAN, 4500, 25,
                false, true, false, LocalDate.now().minusDays(10), 30,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 500, 1200, true));

        productos.add(new Producto("P009", "Pan Frica", "Pan dulce especial", TipoProducto.PAN, 900, 100,
                false, true, false, LocalDate.now(), 2,
                Set.of(HorarioConsumo.DESAYUNO), 180, 600, false));

        productos.add(new Producto("P010", "Coliza", "Pan dulce redondo", TipoProducto.PAN, 950, 90,
                false, true, false, LocalDate.now().minusDays(1), 2,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 200, 650, false));

        productos.add(new Producto("P011", "Pan de Huevo", "Enriquecido con huevo", TipoProducto.PAN, 1300, 70,
                false, true, false, LocalDate.now(), 3,
                Set.of(HorarioConsumo.DESAYUNO), 220, 750, true));

        productos.add(new Producto("P012", "Pan de Molde Integral", "Rebanado integral", TipoProducto.PAN, 2800, 35,
                true, true, true, LocalDate.now().minusDays(3), 7,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.MERIENDA), 500, 900, false));

        productos.add(new Producto("P013", "Pan Centeno", "De harina centeno", TipoProducto.PAN, 1900, 45,
                true, true, false, LocalDate.now(), 4,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ALMUERZO), 280, 600, true));

        productos.add(new Producto("P014", "Pan de Avena", "Con copos avena", TipoProducto.PAN, 1600, 55,
                true, true, true, LocalDate.now().minusDays(1), 5,
                Set.of(HorarioConsumo.DESAYUNO), 300, 550, false));

        productos.add(new Producto("P015", "Pan con Chicharrones", "Tradicional con chicharrones", TipoProducto.PAN, 1100, 85,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.DESAYUNO), 250, 800, false));

        productos.add(new Producto("P016", "Pan con Pasas", "Dulce con pasas", TipoProducto.PAN, 1400, 65,
                false, true, false, LocalDate.now().minusDays(2), 4,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 230, 700, false));

        // Productos tipo PASTEL (8 productos)
        productos.add(new Producto("PT001", "Mil Hojas Manjar", "Clásico chileno", TipoProducto.PASTEL, 5800, 15,
                false, true, false, LocalDate.now().minusDays(1), 5,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 800, 2800, true));

        productos.add(new Producto("PT002", "Torta Tres Leches", "Esponjosa tres leches", TipoProducto.PASTEL, 6200, 12,
                false, true, false, LocalDate.now(), 4,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.CENA), 900, 3200, true));

        productos.add(new Producto("PT003", "Brazo de Reina", "Con manjar y crema", TipoProducto.PASTEL, 3200, 20,
                false, true, false, LocalDate.now().minusDays(1), 3,
                Set.of(HorarioConsumo.ONCE), 400, 1500, false));

        productos.add(new Producto("PT004", "Pastel de Choclo", "Salado tradicional", TipoProducto.PASTEL, 4200, 18,
                false, true, false, LocalDate.now(), 2,
                Set.of(HorarioConsumo.ALMUERZO, HorarioConsumo.CENA), 1200, 1800, true));

        productos.add(new Producto("PT005", "Torta Selva Negra", "Con chocolate y cerezas", TipoProducto.PASTEL, 7500, 8,
                false, true, false, LocalDate.now().minusDays(2), 6,
                Set.of(HorarioConsumo.ONCE), 1200, 3800, true));

        productos.add(new Producto("PT006", "Cheesecake Frutos Rojos", "Base galleta sin horno", TipoProducto.PASTEL, 6800, 10,
                false, true, false, LocalDate.now(), 4,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 850, 2900, true));

        productos.add(new Producto("PT007", "Torta de Zanahoria", "Con frosting de queso", TipoProducto.PASTEL, 5200, 14,
                true, true, false, LocalDate.now().minusDays(1), 4,
                Set.of(HorarioConsumo.ONCE), 800, 2600, true));

        productos.add(new Producto("PT008", "Torta Milhojas Frambuesa", "Con frambuesas frescas", TipoProducto.PASTEL, 6500, 9,
                false, true, false, LocalDate.now(), 3,
                Set.of(HorarioConsumo.ONCE), 900, 3100, true));

        // Productos tipo EMPANADA (8 productos)
        productos.add(new Producto("E001", "Empanada de Pino", "Tradicional horno", TipoProducto.EMPANADA, 1800, 50,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ALMUERZO, HorarioConsumo.CENA), 250, 450, false));

        productos.add(new Producto("E002", "Empanada de Queso", "Queso derretido", TipoProducto.EMPANADA, 1600, 45,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 220, 400, false));

        productos.add(new Producto("E003", "Empanada de Mariscos", "Mariscos frescos", TipoProducto.EMPANADA, 2800, 30,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ALMUERZO), 280, 380, true));

        productos.add(new Producto("E004", "Empanada Vegetariana", "Verduras salteadas", TipoProducto.EMPANADA, 1700, 40,
                true, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ALMUERZO), 230, 350, false));

        productos.add(new Producto("E005", "Empanada de Pollo", "Pollo crema", TipoProducto.EMPANADA, 1900, 38,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ALMUERZO, HorarioConsumo.CENA), 240, 420, false));

        productos.add(new Producto("E006", "Empanada de Choclo Queso", "Choclo fresco y queso", TipoProducto.EMPANADA, 1650, 42,
                true, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 225, 390, false));

        productos.add(new Producto("E007", "Empanada Caprese", "Tomate, albahaca, mozzarella", TipoProducto.EMPANADA, 2100, 28,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ALMUERZO), 245, 430, true));

        productos.add(new Producto("E008", "Empanada de Camarón Queso", "Camarón y queso", TipoProducto.EMPANADA, 3200, 22,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ALMUERZO), 260, 410, true));

        // Productos tipo ALFAJOR (4 productos)
        productos.add(new Producto("A001", "Alfajor Tradicional", "Maicena y manjar", TipoProducto.ALFAJOR, 1200, 60,
                false, true, false, LocalDate.now().minusDays(5), 20,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 80, 380, false));

        productos.add(new Producto("A002", "Alfajor de Nuez", "Con nuez caramelizada", TipoProducto.ALFAJOR, 1800, 40,
                false, true, false, LocalDate.now().minusDays(3), 25,
                Set.of(HorarioConsumo.ONCE), 85, 420, true));

        productos.add(new Producto("A003", "Alfajor Chocolate", "Bañado chocolate", TipoProducto.ALFAJOR, 1500, 48,
                false, true, false, LocalDate.now().minusDays(7), 30,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 90, 450, false));

        productos.add(new Producto("A004", "Alfajor Sin Azúcar", "Para diabéticos", TipoProducto.ALFAJOR, 2200, 35,
                false, true, true, LocalDate.now().minusDays(2), 15,
                Set.of(HorarioConsumo.ONCE), 75, 300, true));

        // Productos tipo QUEQUE (4 productos)
        productos.add(new Producto("Q001", "Queque de Vainilla", "Clásico vainilla", TipoProducto.QUEQUE, 3900, 18,
                false, true, false, LocalDate.now().minusDays(2), 7,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 600, 1800, false));

        productos.add(new Producto("Q002", "Queque de Chocolate", "Húmedo chocolate", TipoProducto.QUEQUE, 4200, 16,
                false, true, false, LocalDate.now().minusDays(1), 7,
                Set.of(HorarioConsumo.ONCE), 650, 2100, true));

        productos.add(new Producto("Q003", "Queque de Limón", "Con glaseado limón", TipoProducto.QUEQUE, 3800, 20,
                false, true, false, LocalDate.now(), 7,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 580, 1700, true));

        productos.add(new Producto("Q004", "Queque Integral Zanahoria", "Con zanahoria y nueces", TipoProducto.QUEQUE, 4500, 14,
                true, true, true, LocalDate.now().minusDays(1), 7,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 620, 1600, true));

        // Productos tipo BERLINES (4 productos)
        productos.add(new Producto("B001", "Berlín Crema Pastelera", "Relleno crema pastelera", TipoProducto.BERLINES, 1200, 35,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 150, 450, false));

        productos.add(new Producto("B002", "Berlín Manjar", "Relleno manjar", TipoProducto.BERLINES, 1300, 32,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 160, 480, false));

        productos.add(new Producto("B003", "Berlín Frambuesa", "Relleno frambuesa", TipoProducto.BERLINES, 1400, 28,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 155, 460, true));

        productos.add(new Producto("B004", "Berlín Chocolate", "Relleno chocolate", TipoProducto.BERLINES, 1350, 30,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.DESAYUNO, HorarioConsumo.ONCE), 158, 470, true));

        // Productos tipo SOPAIPILLAS (4 productos)
        productos.add(new Producto("S001", "Sopaipilla Tradicional", "Con zapallo", TipoProducto.SOPAIPILLAS, 600, 80,
                true, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 100, 280, false));

        productos.add(new Producto("S002", "Sopaipilla Pasadas", "Bañadas en chancaca", TipoProducto.SOPAIPILLAS, 800, 65,
                true, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 110, 350, false));

        productos.add(new Producto("S003", "Sopaipilla con Pebre", "Con pebre picante", TipoProducto.SOPAIPILLAS, 750, 70,
                true, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ONCE), 105, 300, true));

        productos.add(new Producto("S004", "Sopaipilla Queso", "Con queso derretido", TipoProducto.SOPAIPILLAS, 900, 55,
                false, true, false, LocalDate.now(), 1,
                Set.of(HorarioConsumo.ONCE, HorarioConsumo.MERIENDA), 115, 320, true));
    }

    public static List<Producto> getTodosProductos() {
        return new ArrayList<>(productos);
    }
}