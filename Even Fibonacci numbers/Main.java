
package com.tuyendev.test;

public class Main {
    public static void main(String[] args) {
        int start1 = 1;
        int start2 = 2;
        long sum = start2;
        int count = 0;
        int nextnumber = 0;
        while(nextnumber < 4_000_000){
            nextnumber = start1+start2;
            start1 = start2;
            start2 = nextnumber;
            count++;
            if(count == 3){
                count = 0;
                sum+=nextnumber;
            }
        }
        System.out.println(sum);
    }
}
