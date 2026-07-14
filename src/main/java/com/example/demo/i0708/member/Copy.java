package com.example.demo.i0708.member;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        /*
        int copier=100;
        int copiee=copier;
        copier=200;
        System.out.println(copier);
        System.out.println(copiee);
         */

        /*
        Member copier = new Member("Aaron");
        Member copiee = copier;
        copier.name = "Baron";
        System.out.println(copier.name);
        System.out.println(copiee.name);
        */
/*
        Member copier = new Member("Aaron");
        Member copiee = new Member(copier.name);
        copier.name = "Baron";
        System.out.println(copier.name);
        System.out.println(copiee.name);*/

/*
        int[] copier={1,2,3};
        int[] copiee=copier;

        copier[0]=100;
        System.out.println(copier[0]);
        System.out.println(copiee[0]);*/

        int[] copier={1,2,3};
        int[] copiee = Arrays.copyOf(copier, copier.length);

        copier[0]=100;
        System.out.println(copier[0]);
        System.out.println(copiee[0]);
    }
}
