package com.example.Datastructuresjavaarrays.Arrays;

import java.util.Arrays;

public class ArrayInverse {
    public static void main(String[] args) {
        int[]myArray={6,9,5,1,6,3};
         Arrays.sort(myArray);
        for (int i =0; i<myArray.length; i++){
            System.out.println(myArray[i]);

        }

        System.out.println("ordené el array");
        for(int i=5; i>=0; i--){
            System.out.println(myArray[i]);
        }
    }
}
