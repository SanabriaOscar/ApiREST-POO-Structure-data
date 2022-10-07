package com.example.Datastructuresjavaarrays.Arrays;

public class burbuja {
    public static void main(String[] args) {
        int []array={5,9,1,3,6};
//        for(int i =0; i<array.length;i ++ ){
//            for(int j =0; j<array.length;j ++ ){
//      if(array[i]>array[j]){
//          int aux=array[i];
//          array[i]=array[j];
//          array[j]=aux;
//
//      }
//
//            }
//            System.out.println(array[i]);
//        }
        int i, j, aux;
        for(i=0;i<array.length;i++){
            for(j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
                }

    }
for(int p=0; p<array.length; p++){
    System.out.println(array[p]);
}

    }
}
