package com.yao;

import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times:");
        String line = scanner.nextLine();
        int n= Integer.parseInt(line);
        for (int i= 0; i<n;i++){
            System.out.print("("+ i +") =>");
            System.out.println(i);
        }
    }
}
