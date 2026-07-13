package com.example.demo.javaexample;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] num = {3, 7, 2, 9, 1, 5, 8};
        int maxnum=1;
        int minnum=1;

        for (int each:num){
            if (each>=maxnum){
                maxnum=each;
            } else if (each<=minnum) {
                minnum=each;
            }
        }
        System.out.println("최댓값: "+maxnum);
        System.out.println("최솟값: "+minnum);
    }
}
