package com.example.demo.javaexample;

public class EnhancedForLoop {
    public static void main(String[] args) {
        double[] score = {85, 90, 78, 92, 88};

        for(double each:score){
            System.out.println((int)each+"점");
        }
    }
}
