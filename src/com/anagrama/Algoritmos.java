package com.anagrama;

public class Algoritmos {

    public static boolean almostIncreasingSequence(int[] sequence) {

        for(int i = 0; i < (sequence.length - 1); i++){
            if((sequence[i+1]) < (sequence[i])){
                return false;

            }
        }

        return true;

    }


    public static void main(String args[]){
        int[] arreglo = {1, 3, 2};
        System.out.println(Algoritmos.almostIncreasingSequence(arreglo));
    }
}
