package com.example.Datastructuresjavaarrays.Arrays;

import java.util.Scanner;

public class dibujo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa tamaño de la X:");
        int n=input.nextInt();

        if (n == 0)
            System.out.println("ERROR");
        else
        {
            String[][]array = new String[n][n];

            for ( int i=0; i < array.length ;i++){
                for (int j=0; j<array.length;j++){
                    int x = i +1;
                    if((i==j) || (j == (n - x))){
                        array[i][j] = "X";
                        System.out.print(array[i][j] + "");
                    }
                    else{
                        array[i][j] = "_";
                        System.out.print(array[i][j] + "");
                    }
                }
                System.out.println();
            }
        }
    }
}
