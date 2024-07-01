/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author villa
 */
public class Lector {

    /**
     * Busca una fila en un archivo CSV por el valor en una columna específica.
     *
     * @param filePath   Ruta del archivo CSV.
     * @param columnName Nombre de la columna donde buscar el valor.
     * @param value      Valor que se busca en la columna.
     * @return Arreglo de strings con la fila encontrada, o un arreglo vacío si no se encuentra.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public static String[] retornarFilaPorValorEnColumna(String filePath, String columnName, String value) throws IOException {
        if (csvVacio(filePath)) {
            return new String[0]; // Retorna un array vacío si el archivo está vacío o solo tiene encabezados
        }

        List<String[]> registros = leerCSV(filePath);
        String[] header = registros.get(0); // La primera línea es el encabezado
        int columnIndex = findColumnIndex(header, columnName);

        if (columnIndex == -1) {
            throw new IllegalArgumentException("Columna '" + columnName + "' no encontrada en el archivo CSV");
        }

        // Itera a través de los registros para encontrar el valor coincidente
        for (int i = 1; i < registros.size(); i++) { // Empezamos desde 1 para omitir la cabecera
            String[] row = registros.get(i);
            if (row[columnIndex].equals(value)) {
                return row;
            }
        }

        return new String[0]; // Retorna un array vacío si no se encuentra ningún valor coincidente
    }

    /**
     * Verifica si un archivo CSV está vacío (sin datos de filas, pero puede tener encabezados).
     *
     * @param filePath Ruta del archivo CSV.
     * @return true si el archivo está vacío (solo encabezados o sin datos), false si tiene al menos una fila de datos.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public static boolean csvVacio(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine(); // Leer la primera línea (encabezados)
            String firstDataRow = br.readLine(); // Leer la siguiente línea (primer dato de fila)
            return firstDataRow == null; // El archivo está vacío si no hay datos de fila después de los encabezados
        }
    }

    /**
     * Agrega un nuevo registro al final de un archivo CSV.
     *
     * @param filePath     Ruta del archivo CSV.
     * @param nuevoRegistro Array de strings con los datos del nuevo registro a agregar.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    public static void agregarNuevoRegistro(String filePath, String[] nuevoRegistro) throws IOException {
        List<String[]> registrosExistentes = leerCSV(filePath);

        // Agregar el nuevo registro al final de la lista de registros existentes
        registrosExistentes.add(nuevoRegistro);

        // Escribir todos los registros de nuevo en el archivo CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            escribirCSV(bw, registrosExistentes);
        }
    }

    /**
     * Elimina un registro de un archivo CSV por el valor de una columna específica.
     *
     * @param filePath Ruta del archivo CSV.
     * @param columnName Nombre de la columna donde buscar el valor.
     * @param value Valor que se busca en la columna para identificar el registro a eliminar.
     * @throws IOException Si ocurre un error al leer o escribir en el archivo.
     */
    public static void eliminarRegistroPorValorEnColumna(String filePath, String columnName, String value) throws IOException {
        List<String[]> registros = leerCSV(filePath);
        List<String[]> registrosActualizados = new ArrayList<>();

        boolean encontrado = false;
        String[] header = registros.get(0); // La primera línea es el encabezado
        int columnIndex = findColumnIndex(header, columnName);

        if (columnIndex == -1) {
            throw new IllegalArgumentException("Columna '" + columnName + "' no encontrada en el archivo CSV");
        }

        // Recorrer todos los registros y agregar solo los que no coinciden con el valor especificado
        for (String[] registro : registros) {
            if (!registro[columnIndex].equals(value)) {
                registrosActualizados.add(registro);
            } else {
                encontrado = true;
            }
        }

        if (!encontrado) {
            throw new IllegalArgumentException("No se encontró el valor '" + value + "' en la columna '" + columnName + "'");
        }

        // Escribir todos los registros actualizados en el archivo CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            escribirCSV(bw, registrosActualizados);
        }
    }

    /**
     * Lee todos los registros de un archivo CSV y los devuelve como una lista de arrays de strings.
     *
     * @param filePath Ruta del archivo CSV.
     * @return Lista de arrays de strings, donde cada array representa una fila del archivo CSV.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    private static List<String[]> leerCSV(String filePath) throws IOException {
        List<String[]> registros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                registros.add(line.split(";"));
            }
        }
        return registros;
    }

    /**
     * Escribe todos los registros de un archivo CSV a un BufferedWriter.
     *
     * @param bw        BufferedWriter donde se escribirán los registros.
     * @param registros Lista de arrays de strings, donde cada array representa una fila del archivo CSV.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    private static void escribirCSV(BufferedWriter bw, List<String[]> registros) throws IOException {
        for (String[] registro : registros) {
            bw.write(String.join(";", registro));
            bw.newLine();
        }
    }

    /**
     * Encuentra el índice de una columna específica en el encabezado del archivo CSV.
     *
     * @param header     Array de strings con los nombres de las columnas (encabezado).
     * @param columnName Nombre de la columna a buscar.
     * @return Índice de la columna si se encuentra, o -1 si no se encuentra.
     */
    private static int findColumnIndex(String[] header, String columnName) {
        for (int i = 0; i < header.length; i++) {
            if (header[i].equals(columnName)) {
                return i;
            }
        }
        return -1;
    }
    
    
}
