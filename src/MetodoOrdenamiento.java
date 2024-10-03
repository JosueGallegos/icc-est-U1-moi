import java.util.Arrays;

public class MetodoOrdenamiento {
     /**
     * Sorts an array using the insertion sort algorithm.
     *
     * @param arreglo the array to be sorted
     * @param logs    if true, logs the sorting process to the console
     * @return the sorted array
     */
    public int[] sortInsertion(int[] arreglo, boolean logs) {
        if (logs) {
            System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        }
        // Longitud del arreglo
        int n = arreglo.length;

        // Comenzar desde el segundo elemento (el primer elemento ya está "ordenado")
        for (int i = 1; i < n; i++) {
            if (logs) {
                System.out.println("Pasada número " + i);
            }

            // Elemento actual que se va a insertar en la parte ordenada del arreglo
            int actual = arreglo[i];

            // Inicializar j para escanear la parte ordenada en busca de la posición
            // correcta de actual
            int j = i - 1;

            if (logs) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            }

            // Mover elementos de la parte ordenada que son mayores que el elemento actual a
            // una posición adelante
            // de su posición actual
            while (j >= 0 && arreglo[j] > actual) {
                if (logs) {
                    System.out.println("\t\tComparamos " + actual + " con " + arreglo[j]);
                }

                arreglo[j + 1] = arreglo[j];
                j--;

                if (logs) {
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }
            }

            // Insertar el elemento actual en su posición correcta
            arreglo[j + 1] = actual;

            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }
        }

        return arreglo;
    }

    /**
     * Prints the elements of the array to the console.
     *
     * @param arreglo the array to be printed
     */
    public void printArray(int[] arreglo) {
        System.out.println("\nResultado");
        System.out.println(Arrays.toString(arreglo));




    }

    public static void  insertionSortPorPasos(int[] arreglo){
        int tamano = arreglo.length; 
        for(int i = 1; i < tamano ;i++){
            int valorActual = arreglo[i];
            int j = i - 1;

            System.out.println("["+ printArreglo(arreglo)+ "] Iteracion: "+i+" Iniciando con el valor Actual : " + valorActual);

            while (j >= 0 && arreglo[j]> valorActual) {
                System.out.println("["+ printArreglo(arreglo)+ "] Desplazamiento de "+ arreglo[j]+ " en la posicion " + (j+1));
                arreglo[j + 1] = arreglo[j];
                j--;
                
            }
            arreglo[j+1]= valorActual;
            System.out.println("["+ printArreglo(arreglo)+"] Insertar el valor Actual en la posicion "+ (j+1));

            //System.out.println();

            //printArreglo(arreglo);

        }
    }
    public static String printArreglo(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length;i++) {
            //System.out.print(arreglo[i] + " ");
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(",");
                
            }
        }
        //System.out.println();
        return sb.toString();
    } 

    
    
}


/*Bucle for: El bucle empieza en i = 1 porque el primer elemento ya se considera ordenado.

Lógica del while: La línea arreglo[j + 1] = arreglo[j]; ahora mueve los elementos mayores hacia la derecha.

Asignación de valorActual: Ahora arreglo[j + 1] = valorActual; se asegura de insertar el valor en la posición correcta después de que los elementos mayores hayan sido movidos.

Método printArreglo estático: Ahora el método printArreglo es estático para que puedas llamarlo sin necesidad de crear una instancia de MetodoOrdenamiento*/
