package com.example.Datastructuresjavaarrays.Arrays;

public class Asimetrico {
    public static void main(String[] args) {

        String[] myArray = new String[] { "a", "b", "c", "d", "d", "c", "b", "a" };


        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[0]==myArray[7])&&(myArray[1]==myArray[6])&&(myArray[2]==myArray[5])&&
                    (myArray[3]==myArray[4]) ){
            }
            System.out.println("Is simetrica");
        }


    }
}



