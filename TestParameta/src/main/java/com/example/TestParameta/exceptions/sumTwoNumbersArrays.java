package com.example.TestParameta.exceptions;

import java.util.Scanner;

public class sumTwoNumbersArrays {

    static int[] myArray = {1,3,4,2,7,0};
    public static void main(String[] args) {
        int num=10;
        for(int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray.length; j++){
                int total=myArray[i]+myArray[j];
                if(total==num){
                    System.out.println(myArray[i]);
                }

            }
        }
        ////

    }
}



