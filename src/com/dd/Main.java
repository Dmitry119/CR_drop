/*
version 1.01
 */

package com.dd;

import jdk.nashorn.internal.ir.IfNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        while (true) {
            calculate();
        }

    }

    private static void calculate() {
        String input = null;
        int events_number;
        double chance;
        System.out.println("Enter number of events");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        events_number = Integer.parseInt(input);

        System.out.println("Enter chance of event");
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        chance = Double.parseDouble(input);

        Random rnd = new Random();

        for (int i = 0; i < events_number; i++) {


            if (chance >= ( rnd.nextInt(100) + 1) ){ // +1 надо т.к. генерация числа от 0 до 99, прибавляя 1 делаем от 1 до 100
                System.out.print("+");
            } else {
                System.out.print("-");
            }



        }

        System.out.println("\n\n");
    }
}
