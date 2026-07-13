package com.example.demo.i0709;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> cards = new ArrayList<>();


/*    public ArrayList<Card> getCards(){

    }*/

    public void addCard(Card card){
        cards.add(card);
    }

    public void print(){
        System.out.println(cards.toString());
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Deck deal(int count){
        Deck hand = new Deck();
        for (int i=0; i<count; i++){
            Card card = cards.remove(cards.size() -1);
            hand.addCard(card);
        }
        return hand;
    }
}
