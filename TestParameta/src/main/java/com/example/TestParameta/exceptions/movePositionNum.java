package com.example.TestParameta.exceptions;

import java.util.Scanner;

public class movePositionNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] numero= new int[8];
        int con=0;
        System.out.println("escribir 8 numeros");
    for(int i=0; i<numero.length; i++){
        numero[i]= s.nextInt();
    }
        for(int i=0; i<numero.length; i++){
            System.out.printf("|"+i);
        }

        for(int i=0; i<numero.length; i++){
            System.out.printf("|"+numero[i]);
        }

        int aux=numero[7];
        for (int i=7; i>0; i--){
        numero[i]=numero[i-1];
        }
        System.out.println();
        numero[0]=aux;
        System.out.println("this is the array modified");
        for(int i=0; i<numero.length; i++){
            System.out.printf("|"+numero[i]);
        }

    }
}
