package com.codility;

import java.util.ArrayList;
import java.util.Arrays;


    // Lesson 1 - Iterations

public class Lesson1 {

    // BinaryGap 100%

    public int binaryGap(int N) {
        int binaryGap = 0;
        int count = 0;

        String binary = Integer.toBinaryString(N).toString();
//        System.out.println(binary);
        char[] binaryArray = binary.toCharArray();

        for (int i = 1; i < binaryArray.length; i++) {
            if (binaryArray[i] == '0') {
                count++;
            } else if (binaryArray[i] == '1' && binaryArray[i - 1] == '0') {
                if (binaryGap < count) {
                    binaryGap = count;
                }
                count = 0;
            }
        }
//        System.out.println("Lesson 1 - binaryGap solution: " + binaryGap);
        return binaryGap;
    }
    // --------------------------------------------------------------------------------------------------------------




    // --------------------------------------------------------------------------------------------------------------
    // Lesson 4 - Counting elements
    // PermCheck 58% -> 100%

    public int permCheck(int[] A) {
        int permutation = 0;
        Arrays.sort(A);
        if (A[0] == 1) {
            if (A.length==1) {
                permutation = 1;
            }
            else {
                for (int i = 1; i < A.length; i++) {
                    if (A[i] == A[i - 1] + 1) {
                        if (i != 1 && permutation == 0) {
                            permutation = 0;
                        }
                        else permutation = 1;
                    }
                    else permutation = 0;
                }
            }
        }
//        System.out.println(permutation);
        return permutation;
    }
}


