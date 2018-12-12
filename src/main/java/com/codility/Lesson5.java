package com.codility;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Arrays;

    // Lesson 5 - Prefix Sums

public class Lesson5 {

    // TODO PassingCars 50% -> 90% -> How to improve more?
    public static int passingCars (int[] A) {
        int count = 0;
        int multi = 0;
        for (int c=0; c<A.length; c++) {
            if (A[c]==0) {
//                for (int d=c; d<A.length; d++) {
////                    if ( A[d]==1) count++;
////                }
                multi++;
            }
            else {
                count = count + multi;
            }
        }
        if (count > 1000000000) count =-1;
        return count;
    }
    // --------------------------------------------------------------------------------------------------------------

    // TODO GenomicRangeQuery
    // --------------------------------------------------------------------------------------------------------------

    // TODO MinAvgTwoSlice
    // --------------------------------------------------------------------------------------------------------------

    // TODO CountDiv
    // --------------------------------------------------------------------------------------------------------------

}
