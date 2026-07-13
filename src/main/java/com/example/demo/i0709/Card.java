package com.example.demo.i0709;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Card {
    public final int suitNumber;
    public final int rankNumber;
    private String suit;
    private String rank;

    public String getSuit(){
        if (suitNumber == 1){suit = "Clubs";}
        else if (suitNumber == 2) {suit = "Hearts";}
        else if (suitNumber == 3) {suit = "Diamonds";}
        else if (suitNumber == 4) {suit = "Spades";}
        return suit;
    };

    public String getRank() {
        if (rankNumber == 1){rank = "ACE";}
        else if (rankNumber == 11) {rank = "Jack";}
        else if (rankNumber == 12) {rank = "Queen";}
        else if (rankNumber == 13) {rank = "King";}
        else {rank = String.valueOf(rankNumber);}
        return rank;
    }

    public String toString(){
        return String.format(getRank()+" of "+getSuit());
    }
}
