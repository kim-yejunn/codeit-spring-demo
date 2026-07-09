package com.example.demo.lombok;

public class IfExample {
    public static void main(String[] args) {
        int score = 12;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        String day="월요일";
        String dayType=switch (day){
            case "월요일", "화요일", "수요일", "목요일", "금요일" -> {
                System.out.println("주말까지 화이팅");
                yield "주말 전..";
            }
            case "토요일", "일요일" -> {
                System.out.println("평일아 오지 마라");
                yield "드디어 주말!";
            }
            default -> "Unknown";
        };
        System.out.println(dayType);
    }
}
