package com.example.demo.javaexample;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40 ,50};

        for (int i=0; i<a.length; i++){
            System.out.println("인덱스 "+i+": "+a[i]);
        }
    }
}
