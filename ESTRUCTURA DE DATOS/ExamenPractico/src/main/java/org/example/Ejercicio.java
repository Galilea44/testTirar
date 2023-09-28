package org.example;

import java.util.List;

public class Ejercicio {
    public static int maxAfterOperations(int n, List<int[]> queries) {
        int[] arr = new int[n + 1];  //creo in arreglo para las operaciones a realizar

        for (int[] query : queries) {  // recorre odo el arreglo
            int a = query[0];  //indice del inicio del rango
            int b = query[1];  //indice del fin del rango
            int k = query[2];    //valor agregado al rango
            arr[a] += k;
            if (b + 1 <= n) { //representa la operacion de disminucion para indicar el fin del rango (a,b)
                arr[b + 1] -= k;
            }
        }

        int max = 0;  //variable con el valor max. encontrado
        int min = 0;  //para conocer el valor actual mientras se ssigue iterando en el arreglo

        // Iteración a través del arreglo, tiempo constante O(n)
        for (int completo : arr) { //se itera sobre todos los elementos del arreglo
            min += completo;
            if (min > max) {
                max = min; // Actualización del valor máximo
            }
        }

        return max;
    }
}
