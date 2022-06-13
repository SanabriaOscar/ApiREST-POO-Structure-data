package com.example.Datastructuresjavaarrays.Arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int num [][]={
                {1,2,3},
                {1,3,5,7},
                {1,3,12,7},
        };
        for (int i=0; i<num.length; i++){
          for (int j=0; j<num[0].length; j++){
              System.out.print(num[i][j]);
          }
        }
        String[] animal=new String[2];
        animal[0]="perro";
        animal[1]="loro";

        for (int p=0;p<animal.length; p++ ){
            System.out.println(animal[p]);
        }
        String valor="“Hola;bienvenido;a;la;aplicación;";
        String strMain = "Hola;bienvenido;a;la;aplicación;";
        long arrSplit = Arrays.stream(strMain.split("\\;")).count();
        for (int i = 0; i < arrSplit; i++)
        {
            int n=0; n++;
            System.out.println(n);
        }
    }


}
