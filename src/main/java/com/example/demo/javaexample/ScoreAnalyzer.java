package com.example.demo.javaexample;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        double[] score = {85, 90, 78, 92, 88};
        double total=0;
        int up = 0, down=0;

        for (int i=0; i<score.length; i++){
            total +=score[i];
        }

        total = total/score.length;
        System.out.println("평균: "+ total);

        for (double each:score){
            if (each>total){
                up++;
            } else if (each<total) {
                down++;
            }
        }
        System.out.println("평균보다 높은 점수 개수: "+up);
        System.out.println("평균보다 낮은 점수 개수: "+down);
    }
}
