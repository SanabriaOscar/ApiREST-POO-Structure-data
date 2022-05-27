package com.example.TestParameta.exceptions;

import java.util.Scanner;

public class MaxMinMedia {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int []array=new int[8];
        int  sum=0;;
        int max=array[0];
        int min=array[0];
        for (int i=0; i<8; i++){
            System.out.println("ingrese el num ");
           array[i]= s.nextInt();
        }
        for (int i=0; i<8; i++){
            sum+=array[i];
        }
        for (int i=1; i<8; i++){

           // System.out.println(sum);
            if(array[i]>max){
                max=array[i];
            }if(array[i]<min){
                min=array[i];
            }

        }
        System.out.println("El minimo es: "+min);
        System.out.println("El max es: "+max);
        System.out.println("La suma es: "+sum/8);

    }
}
