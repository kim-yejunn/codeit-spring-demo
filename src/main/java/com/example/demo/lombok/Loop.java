package com.example.demo.lombok;

public class Loop {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("i= "+i);
        }

        for (int i=1; i<=3; i++){
            for (int j=1; j<=2; j++){
                System.out.println("i= "+i+", j= "+j);
            }
        }

        int[] scores={90, 85, 78};
        for (int s : scores){
            System.out.println("점수: "+s);
        }

        int countdown=5;
        do {
            System.out.println("countdown: "+countdown--);
        }while (countdown>5);

        int[] int_array=new int[3];
        int[] int_array2={1, 2, 3};
        Integer[] integer_array=new Integer[3];
        Integer[] integer_array2={1, 2, 3};
        System.out.println(integer_array2.length);


    }
}
