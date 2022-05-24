package com.example.TestParameta.exceptions;

import java.util.Scanner;

public class numerosPar {
    public static void main(String[] args) {

        int[]Array=new int [6];
        Scanner s= new Scanner(System.in);
        System.out.println("ingrese 6 numeros");
        for(int i=0; i<6; i++){
            Array[i]=s.nextInt();
        }
        for (int i=0; i<Array.length; i++){
            if (Array[i]%2==0){
                System.out.println("par"+Array[i]);
            }else {
                System.out.println("impar"+Array[i]);
            }
        }
    }
}
