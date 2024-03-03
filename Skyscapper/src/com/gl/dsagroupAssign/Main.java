package com.gl.dsagroupAssign;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int noOfFloors = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        noOfFloors = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < noOfFloors; i++) {
            System.out.println("enter the floor size given on day : " + (i + 1));
            list.add(sc.nextInt());
        }
        Skyscraper obj = new Skyscraper();
        obj.distinctFloor(list, noOfFloors);
    }

}