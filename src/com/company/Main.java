package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        PrimeN primeNum = new PrimeN();
        primeNum.determinePrimeNum(number);

    }
}
