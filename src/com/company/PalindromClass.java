package com.company;

public class PalindromClass {

    public static int palindromMethod ( int x){
        int y = 0;
        int k = x;
        while (k != 0) {
            y = y * 10 + k % 10;
            k = k/10;
                   }
        if (x==y) {
            System.out.print("true");}
        else{
            System.out.print("false");
        }

        return y;

    }
}
