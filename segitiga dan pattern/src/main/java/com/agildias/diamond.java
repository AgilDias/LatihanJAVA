package com.agildias;

public class diamond {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int b = 0; b < 8; b++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }
            for (int k = 8; k > b; k--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}