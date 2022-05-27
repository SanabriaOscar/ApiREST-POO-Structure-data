package com.example.TestParameta.exceptions;

import java.util.Scanner;

public class figura {
    public static void main(String[] args) {
        int size = new Scanner(System.in).nextInt();
        for(int row=0; row<=size; row++) {
            for(int col=0; col<=size; col++) {
                if (row == 1 || row == size || col == 1 ||
                        col == size || col == row ||col == size-(row-1)) {
                    System.out.print("X");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
