package com.example.Datastructuresjavaarrays.Arrays;

public class historiograma {
    static int[] myArray = {1,2,1,3,3,1,2,1,5,1};
    public static void main(String[] args) {
        int one = 0;
        int two= 0;
        int three= 0;
        int four= 0;
        int five= 0;
        for(int i=0; i< myArray.length; i++){

            if(myArray[i]==1){
                 one ++;
            }
            if(myArray[i]==2){
                two ++;
            }
            if(myArray[i]==3){
                three ++;
            }
            if(myArray[i]==4){
                four ++;
            }
            if(myArray[i]==5){
                five ++;
            }

        }
        System.out.println(one);
        System.out.println( two);
        System.out.println( three);
        System.out.println( four);
        System.out.println(five);
        int arr[] = new int[]{1,2,1,3,3,1,2,1,5,1};
        int n = arr.length;

        boolean visited[] = new boolean[n];

        // Recorro de 1 a 5 para ver cuántas veces se repite cada valor
        for (int i = 1; i <= 5; i++) {
            // Cantidad de veces que se repite i
            int count = 0;// se inicia en 0 porque hasta ahora no hay coincidencias

            // Recorro el arreglo
            for (int j = 0; j < n; j++) {
                // Skip this element if already processed
                // Esto lo hago aquí adentro porque es donde recorro el arreglo ahora
                if (visited[j] == true)
                    continue;

                // Si el valor en esa posición es el analizado (i) incremento
                if (arr[j] == i) {
                    visited[j] = true;
                    count++;
                }
            }

            // La i tiene el valor y count las veces que se repite
            System.out.print(i + ": " );
            for (int k = 0; k < count; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
