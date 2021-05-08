package com.company.leetcode;

import java.util.*;

public class kClosestPoints {

    public static int[][] kClosestPointsToOrigin(int k, int[][] points){
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) ->(b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1]));
        for (int[] point: points){
            maxHeap.add(point);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        while (k > 0){
            result[k-1] = maxHeap.poll();
            k-=1;
        }
        return result;
    }
}
