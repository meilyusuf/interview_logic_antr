package com.yusuf;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        String kata = "";
        StringBuilder reverseKata = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        kata = scan.nextLine();
        for (int i = kata.length() -1 ; i >= 0 ; i -- ) {
            reverseKata.append(kata.charAt(i));
        }
        System.out.println(kata.equalsIgnoreCase(reverseKata.toString()));
    }
}
