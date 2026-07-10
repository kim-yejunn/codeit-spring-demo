package com.example.demo;

import com.example.demo.i0708.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        // 1부터 20까지의 소수 찾기
        System.out.println("1부터 20까지의 소수:");

        // 각 숫자에 대해 소수 판별
        for(int i=2; i<=20; i++){
            boolean isPrime = true;
            for(int j=2; j*j<=i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                num.add(i);
            }
        }
        System.out.println(num);

/*
        Member member = new Member("0101010-100110", "kyj", 200);
        System.out.println(member.toString());
        member.setName("kkk");
        member.birthday();
        System.out.println(member.toString());*/

/*        Game game = new Game(new String[]{"Aaron", "Baron"}, 3);

        String[] result = game.play();
        System.out.println(Arrays.toString(result));*/

/*
        int[] inputs = {10, 20, 30, 0};
        int inputIndex = 0;
        int sum = 0;

        while (true){
            int value = inputs[inputIndex];
            if (value == 0){break;}
            else {
                sum += value;
                inputIndex++;
            }
        }
*/

 /*       // 52장 스탠다드 카드 덱 생성
        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);

                standardDeck.addCard(newCard);
            }
        }

        // 카드 셔플
        standardDeck.shuffle();

        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 각 핸드 출력
        hand1.print();
        System.out.println("----------");
        hand2.print();*/

/*            Card card1 = new Card(1, 1);
            Card card2 = new Card(2, 6);
            Card card3 = new Card(4, 12);

            System.out.println(card1.getSuit());
            System.out.println(card2.getSuit());
            System.out.println(card3.getSuit());

            System.out.println(card1.getRank());
            System.out.println(card2.getRank());
            System.out.println(card3.getRank());

            System.out.println(card1.toString());
            System.out.println(card2.toString());
            System.out.println(card3.toString());*/
    }
}