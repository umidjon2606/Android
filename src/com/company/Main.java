package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);
        int password = 2008;

        int carta = 700000;
        System.out.println("password write");
        System.out.print("=");
        int n = scanner.nextInt();



    if (password == n) {
        System.out.println("50000 -> [1]");
        System.out.println("100000 -> [2]");
        System.out.println("200000 -> [3]");
        System.out.println("250000->[4]");
        System.out.println("=  ");
        int pul = scanner.nextInt(); //2

        if (pul == 1) {

            if (carta >= 50000) {
                int res = carta - 50000;
                System.out.println("sizning cartangizda " + res + "pul qold");
            } else {
                System.out.println("mablag` yetarli emas " + carta + "so`m bor");

            }


        } else if (pul == 2) {

            if (carta >= 100000) {
                int res = carta - 100000;
                System.out.println("sizning cartangizda " + res + "pul qold");
            } else {
                System.out.println("mablag` yetarli emas " + carta + "so`m bor");

            }

        } else if (pul == 3)

            if (carta >= 150000) {
                int res = carta - 150000;
                System.out.println("sizning cartangizda " + res + "pul qold");
            } else {
                System.out.println("mablag` yetarli emas " + carta + "so`m bor");

            }else if (pul == 4)

            if (carta >= 25000) {
                int res = carta - 25000;
                System.out.println("sizning cartangizda " + res + "pul qold");
            } else {
                System.out.println("mablag` yetarli emas " + carta + "so`m bor");

            }
        else {
            System.out.println("error");




    }

}














    }
}
