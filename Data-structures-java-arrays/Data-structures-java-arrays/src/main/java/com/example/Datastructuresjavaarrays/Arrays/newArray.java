package com.example.Datastructuresjavaarrays.Arrays;

public class newArray {
    static int[] myArray = {1,3,4,2,7,0};
    public static void main(String[] args) {
        int num=10;
        for(int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray.length; j++){
                int total=myArray[i]+myArray[j];
                if(total==num){
                   // System.out.println([i], [j]);
                    String pero= String.valueOf(myArray[i]);
                    System.out.print(pero);
               String [] palabra=pero.split("  ");
                    System.out.println(palabra);
                }

            }
        }

        String name="37";
        String [] parts=name.split(" ");
        String part1=parts[1];
       // String part2=parts[1];
        System.out.println(part1);
       // System.out.println(part2);
    }
}
