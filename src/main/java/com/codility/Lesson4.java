package com.codility;

import java.util.ArrayList;
import java.util.Arrays;

    // Lesson 4 - Counting elements

public class Lesson4 {

    // TODO FrogRiverOne 54% (100% correctness, 0% Performance  -> to improve

    public int frogRiverOne(int X, int[] A) {
        int second = -1;
        ArrayList<Integer> steps = new ArrayList<>();
        int i =0;

        if (A.length<X) {
            second = -1;
        }
        else {
            while (steps.size()< X && i<=A.length-1) {
                second++;
                boolean isOnList = steps.contains(A[i]);
                if (A[i] <= X && isOnList == false) {
                    steps.add(A[i]);
                }
                i++;
            }
            if (!steps.contains(X) || steps.size()<X) {
                second = -1;
            }
        }
//        System.out.println(second);
        return second;
    }
    // --------------------------------------------------------------------------------------------------------------

    // TODO MaxCounters - 44% (100% correctness, 0% Performance  -> to improve

    public int[] maxCounters(int N, int[] A) {
        int[] counters = new int[N];
        for (int i=0; i<N; i++) {
            counters[i] = 0;
        }
        int max = 0;

        for (int i : A) {
            for (int X : counters) {
                if (X > max) {
                    max = X;
                }
            }
            for (int j=0; j<counters.length; j++) {
                if (i == j+1) {
                    counters[j]++;
                }
                else if (i == N + 1) {
                    for (int x=0; x<counters.length; x++) {
                        counters[x] = max;
                    }
                }
            }
        }
//       for (int X : counters) {
//           System.out.println(X);
//       }
        return counters;
    }



    // --------------------------------------------------------------------------------------------------------------
    // Lesson 4 - Counting elements
    // TODO MissingInteger 55% -> to improve (still correctness not OK)

    public static int missingInteger(int[] A) {
        Arrays.sort(A);
        int spi = 0;
        if (A.length==1) {
            if (A[0] != 1) {
                spi = 1;
            }
            else if (A[0] ==1) spi = 2;
        }
        else if (A[A.length-1]<=0 || A[0]>=2 || (A[1]>=2 && A[0]!=1)) {
            spi = 1;
        }
        else {
            for (int x=1; x<A.length; x++) {
                if (A[x]==2 && A[x-1]!=1) {
                    spi = 1;
                    break;
                } else if (A[x]>0 && A[x]!=A[x-1]+1 && A[x-1]>-1 && A[x]!=A[x-1]) {
                    spi = A[x-1]+1;
                    break;
                }
                else if (A[x]>0 && A[x]==A[x-1]+1 && A[x]==A[A.length-1]) {
                    spi = A[x]+1;
                    break;
                }
            }
        }
        return spi;
    }
    // --------------------------------------------------------------------------------------------------------------

}
