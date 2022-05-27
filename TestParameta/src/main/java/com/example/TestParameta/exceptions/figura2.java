package com.example.TestParameta.exceptions;

public class figura2 {

    public static void main(String[] args) {
        int n=5;
        int cola=n;
        int punta=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==cola-1 ||j==punta){
                    System.out.print("X");
                }else{
                    System.out.print("_");

                }
                cola--;
                punta++;
            }
        }
    }
}
