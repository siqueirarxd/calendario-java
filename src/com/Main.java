package com;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the month, day and year desired (mm/dd/yyyy): ");

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);

        System.out.println(res);
        sc.close();
    }
}

