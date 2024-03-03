package com.gl.dsagroupAssign;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Skyscraper {

    void distinctFloor(List<Integer> floorSizeArray, int noOfFloors) {
        Stack<Integer> stack = new Stack<Integer>();
        int m = noOfFloors;
        for (int i = 0; i < floorSizeArray.size(); i++) {
            System.out.println("Day: " + (i + 1));
            if (floorSizeArray.get(i) == m) {
                System.out.print(floorSizeArray.get(i) + " ");
                m--;
                while (!stack.isEmpty() && stack.peek() == m) {
                    System.out.print(stack.peek() + " ");
                    m--;
                    stack.pop();
                }
                System.out.println();
            } else {
                System.out.println();
                stack.push(floorSizeArray.get(i));
                Collections.sort(stack);
            }
        }
    }
}