package com.company;

import java.util.*;

import static com.company.frequency.Frequency.countFrequency;
import static com.company.leetcode.kClosestPoints.kClosestPointsToOrigin;
import static com.company.leetcode.robotBoundToCircle.robot2Circle;
import static com.company.leetcode.numberOfIslands.countNumberOfIslands;

public class Main {

    public static void main(String[] args) {
//	TwoSum results = new TwoSum();
//	int[] test = {1,2,3,4,5};
//	int target = 3;
//	int[] ans = results.twoSum(test, target);
//	System.out.println(Arrays.toString(ans));
//        ----------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a list of names separated by space: ");
//        String input = scanner.nextLine();
//
//        String[] names = input.split(" ");
//        for(String name:names){
//            System.out.println(name);
//        }
//        System.out.println(Arrays.toString(names));
//        Map<String,Integer> freqMap = countFrequency(names);
//        System.out.println(freqMap);
//        -------------------------------------------------------
//        int[][] points = {{3,3},{5,-1},{-2,4}};
//        int k = 2;
//        System.out.println(Arrays.deepToString(kClosestPointsToOrigin(k, points)));
//        --------------------------------------------------------
//        String instructions = "GLGRGLGRGLLGGGG";
//        System.out.println(robot2Circle(instructions));
//        --------------------------------------------------------
        String[][] grid = {
                {"1","1","0","0","0"},
                {"1","1","0","0","0"},
                {"0","0","1","0","0"},
                {"0","0","0","1","1"}
        };
        System.out.println(countNumberOfIslands(grid));

    }



    }
