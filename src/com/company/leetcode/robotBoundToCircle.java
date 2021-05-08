package com.company.leetcode;

import java.util.Arrays;

public class robotBoundToCircle {

    public static boolean robot2Circle(String instructions){
        /*
        * Initial point of 0,0
        * Set of movements listed in clockwise order [north, east, south, west]
        * Current Direction pointer
        * Iterate through the string, two cases:
        * 1) We encounter a G in which case add movement of direction pointer
        * 2) We encounter a L or R in which case we move direction pointer left/right
        * At the end of the iteration, if we are at zero or not facing north
        * Robot is bound to a circle
        * */

        int[][] movements = {{1,0},{0,1},{-1,0},{0,-1}};
        int currentDirection = 0;
        int[] position = {0,0};
        for (char instruction: instructions.toCharArray()){
            if (instruction == 'G'){
                position[0] += movements[currentDirection][0];
                position[1] += movements[currentDirection][1];
            }
            else if (instruction == 'L'){
                currentDirection = (currentDirection+3)%4;
            }
            else if (instruction == 'R'){
                currentDirection = (currentDirection+1)%4;
            }
        }
        return Arrays.equals(position, new int[]{0, 0}) || currentDirection != 0;
    }
}
