
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BancoDigital {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
                101, "Sofia García", "s.garcia@mail.com", "911223344",
                5, 12, 2020,
                550000.00, 30, 3.5,
                50000.00, "Acciones"
        );

        Cliente cliente2 = new Cliente(
                102, "Marcos López", "m.lopez@mail.com", "911556677",
                1, 8, 2023,
                150000.00, 10, 2.8,
                2000.00, "Bonos"
        );

        Cliente cliente3 = new Cliente(
                103, "Elena Pérez", "e.perez@mail.com", "911889900",
                15, 3, 2018,
                300000.00, 20, 4.0,
                150000.00, "Fondos"
        );

        Cliente cliente4 = new Cliente(
                104, "Elena Díaz", "e.diaz@mail.com", "999889111",
                15, 3, 2025
        );

        // Lista de Clientes. NO LO MODIFIQUES!
        Cliente[] listaClientes = {cliente1, cliente2, cliente3, cliente4};


        int indice = 0;
        System.out.println("Iniciando procesamiento de cuentas bancarias...");

        // WHILE para procesar la lista de clientes (Consola)
        while (indice < listaClientes.length) {
            Cliente clienteActual = listaClientes[indice];
            double ganancia;
            System.out.printf("Procesado Cliente %d (%s). Ganancia Proyectada: %.2f€\n",
                    clienteActual.id, clienteActual.getnombre(), ganancia);

            indice++;
        }

        // --GENERACIÓN ARCHIVO HTML ---
        
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<!DOCTYPE html>\n<html lang=\"es\">\n<head>\n");
        htmlContent.append("    <meta charset=\"UTF-8\">\n    <title>Reporte Banco Digital</title>\n");
        htmlContent.append("    <style>body { font-family: sans-serif; }</style>\n");
        htmlContent.append("</head>\n<body>\n");
        htmlContent.append("    <h1>Cuentas de Clientes - Reporte Digital</h1>\n");


        for(Cliente cliente : listaClientes) {
            htmlContent.append(cliente.generarHTML());
        }

        htmlContent.append("</body>\n</html>");

        // Convertir el HTML en archivo --> banco_reporte.html
        try (PrintWriter writer = new PrintWriter(new FileWriter("banco_reporte.html"))) {
            writer.println(htmlContent.toString());
            System.out.println("\n" + "=".repeat(60));
            System.out.println(" ¡Archivo 'banco_reporte.html' generado ! ");
            System.out.println("=".repeat(60));
        } catch (IOException e) {
            System.err.println(" Error al escribir en el archivo: " + e.getMessage());
        }
    }
}