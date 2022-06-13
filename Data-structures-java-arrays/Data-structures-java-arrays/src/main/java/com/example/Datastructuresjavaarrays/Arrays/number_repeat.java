package com.example.Datastructuresjavaarrays.Arrays;

public class number_repeat {
    public static void main(String[] args) {

       int[] myArray = {1,2,2,4,5,6,7,8,8,8};
       int aux=myArray[0];
        int con=0;

        for (int i=0; i<myArray.length; i++){
            if(aux==myArray[i]){
                    con++;
                }else{

                aux=myArray[i];
                con=1;

            }
        }  System.out.println("Longest"+ con);
        System.out.println("number"+ aux);
    }
    }


