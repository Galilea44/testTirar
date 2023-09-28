package org.example;

import java.util.List;

import static org.example.Ejercicio.maxAfterOperations;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        List<int[]> queries = List.of(new int[]{1, 5, 3}, new int[]{4, 8, 7}, new int[]{6, 9, 1});
        int result = maxAfterOperations(n, queries);
        System.out.println("----------Resultado-------");
        System.out.println("El valor máximo encontrado es: " + result);
    }

}