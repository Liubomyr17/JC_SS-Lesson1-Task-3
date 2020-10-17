package com.softserve;

import java.util.*;

public class Main {
        public static void main(String[] args) {

                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);

                /* double a = 88.8;
                   double b = 77.7; */

                System.out.println("Addition: " + (a + b) + ";");
                System.out.println("Subtraction: " + (a - b) + ";");
                System.out.println("Multiplication: " + (a * b) + ";");
                System.out.println("Division: " + (a / b) + ";");
        }
}



