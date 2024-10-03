public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();
         // Creamos la instancia de la clase
         MetodoOrdenamiento ordenar = new MetodoOrdenamiento();

         // Creamos un arreglo de enteros
         int[] arreglo = { 3, 5, 1, 2, 4 };
 
         // Llamamos al método sortInsertion
         int[] arregloOrdenado = ordenar.sortInsertion(arreglo, true);
 
         // Imprimimos el arreglo ordenado
         ordenar.printArray(arregloOrdenado);

         System.out.println();


 
        // Ejercicio de la imagen 
        int[] arreglo2 = {12, 0, 5, 21, -3, 8};

        System.out.println("Arreglo original: ");
        
        //MetodoOrdenamiento.printArreglo(arreglo2);

        MetodoOrdenamiento.insertionSortPorPasos(arreglo2);

        //System.out.println("Arreglo ordenado: ");
        //MetodoOrdenamiento.printArreglo(arreglo2);
        


        
        
        




    }
}
