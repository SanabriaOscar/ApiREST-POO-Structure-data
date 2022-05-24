package com.example.TestParameta.exceptions;

public class array_2 {
    public static int main(String[] args) {

        int num[]={1,2,3};
        int total=5;
        for (int i = 0; i<num.length; i++){
            for (int j = 0; j <num.length; j++){
               int numTotal=num[i]+num[j];
if( numTotal==total){
    System.out.println("this is the total"+ numTotal);
}
            }
        }
        int[] myArray = {1,3,4,2,7,0};
        int num2=10;
        for(int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray.length; j++){
                int total2=myArray[i]+myArray[j];
                if(total2==num2){
                }
            }
        }
        return total;
    }

        }




