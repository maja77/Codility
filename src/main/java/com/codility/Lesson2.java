package com.codility;

import java.util.ArrayList;

    // Lesson 2 - Arrays

public class Lesson2 {

    // CyclicRotation 100%

    public int[] cyclicRotation(int[] A, int K) {
        int[] delivered = A;

        for (int i = 0; i < K; i++) {
            int[] rotated = new int[delivered.length];
            for (int j = 0; j < delivered.length; j++) {
                if (j == 0) {
                    rotated[j] = delivered[delivered.length - 1];
                } else {
                    rotated[j] = delivered[j - 1];
                }
            }
            delivered = rotated;
        }
//        System.out.print("Lesson 2 - cyclicRotation solution: ");
//        for (int x=0; x<delivered.length; x++) {
//            System.out.print(delivered[x]);
//        }
//        System.out.println();
        return delivered;
    }
    // --------------------------------------------------------------------------------------------------------------

    //TODO OddOccurrencesInArray 66% - to analise what is not OK -> to improve

    public int oddOccurrencesInArray(int[] A) {
        int[] delivered = A;
        ArrayList<Integer> unpaired = new ArrayList<>();

        for (int i = 0; i < delivered.length; i++) {
            if (unpaired.contains(delivered[i])) {
                Object o = delivered[i];
                unpaired.remove(o);
            } else {
                unpaired.add(delivered[i]);
            }
        }
        int unpairedInt = unpaired.get(0);
//        System.out.println("Lesson 2 - oddOccurrencesInArray solution: " + unpairedInt);
        return unpairedInt;
    }
    // --------------------------------------------------------------------------------------------------------------
}
