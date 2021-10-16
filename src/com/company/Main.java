package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] getShuffling(int[] array){
        Random random = new Random();
        int buffer = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            a = random.nextInt(array.length);
            b = random.nextInt(array.length);
                buffer = array[a];
                array[a] = array[b];
                array[b] = buffer;
            }
        return array;
    }

    public static void main(String[] args) {
	int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(getShuffling(array)));
    }
}
