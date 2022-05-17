package com.example.TestParameta.exceptions;

public class Factorial {
    public static void main(String[] args) {
        //Fac(4);

        int num = 3;
        int fac = 1;

        for (int i = 1; i <= num; i++) {
            fac = fac * i;
            System.out.println("print:" + fac);
        }
        int ArrayTest[] = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
        for (int i = 0; i < ArrayTest.length - 1; i++) {
            for (int j = 0; j < ArrayTest.length - i - 1; j++) {
                if (ArrayTest[j + 1] < ArrayTest[j]) {
                    int contador = ArrayTest[j + 1];
                    ArrayTest[j + 1] = ArrayTest[j];
                    ArrayTest[j] = contador;
                   for (int p=0;p<contador; p++ ){
                       System.out.println(p);
                   }
                }
            }
        }


    }

    static Integer Fac(int num) {

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        System.out.println("print: " + factorial);
        return factorial;
    }



}
