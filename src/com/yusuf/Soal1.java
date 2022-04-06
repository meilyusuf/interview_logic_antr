package com.yusuf;

public class Soal1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("ANTERAJA");
            } else if(i % 3 == 0) {
                System.out.println("ANTER");
            } else if ( i % 5 == 0) {
                System.out.println("AJA");
            } else {
                System.out.println(i);
            }
        }

    }
}
