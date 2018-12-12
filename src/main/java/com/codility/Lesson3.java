package com.codility;

import java.util.Arrays;

    // Lesson 3 - Time Complexity

public class Lesson3 {

    // PermMissingElem 50% first attempt -> 100%

    public int permMissingElem(int A[]) {
        Integer missing = 0;
        Integer N = A.length;
        if (N == 0) {
            missing = 1;
        } else if (N == 1) {
            if (A[0] == 1) {
                missing = 2;
            } else missing = 1;
        } else {
            Arrays.sort(A);
            if (A[0] != 1) {
                missing = 1;
            } else if (A[N - 1] != N + 1) {
                missing = N + 1;
            } else {
                for (int i = 1; i < A.length; i++) {
                    if (A[i] != A[i - 1] + 1) {
                        missing = A[i - 1] + 1;
                    }
                }
            }
        }
//        System.out.println("Lesson 3 - permMissingElem solution: " + missing);
        return missing;
    }
    // --------------------------------------------------------------------------------------------------------------

    // FrogJmp 55% -> 100%

    public int frogJmp(int X, int Y, int D) {
        int nInt = 0;
        double n = (Y-X)/D;
        if (X + n * D >= Y) {
            nInt = (Y-X)/D;
        }
        else {
            nInt = (Y-X)/D + 1;
        }
//        System.out.println(nInt);
        return nInt;
    }
    // --------------------------------------------------------------------------------------------------------------

    // TODO TapeEquilibrium 50% -> to improve

    public int tapeEquilibrium(int[] A){
        int min = 0;
        int currentMin=0;
        if (A.length>2) {
            for (int p=1; p<A.length-1; p++) {
                int sum1 = 0;
                int sum2 = 0;
                for (int i=0; i<p; i++) {
                    sum1 = sum1 + A[i];
                }
                for (int j=p; j<A.length; j++) {
                    sum2 = sum2 + A[j];
                }
                if (p==1) {
                    currentMin = Math.abs(sum1 - sum2);
                    min = currentMin;
                }
                else {
                    currentMin = Math.abs(sum1 - sum2);
                    if (currentMin < min) {
                        min = currentMin;
                    }
                }
            }
        }
        else {
            min = Math.abs(A[0]-A[1]);
        }
//        System.out.println(min);
        return min;
    }
    // --------------------------------------------------------------------------------------------------------------
}
