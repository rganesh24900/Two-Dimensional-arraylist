package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows:");

        int a = sc.nextInt();
        System.out.println("Enter the size of columns:");
        int b = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            arr.add(i, new ArrayList<>());
            for (int j = 0; j < b; j++) {
                arr.get(i).add(j);
            }
        }
//using for-each loop
        try {
            for (ArrayList<Integer> i : arr) {
                System.out.print("[");
                for (int j :
                        i) {
                    System.out.print(j + ",");

                }
                System.out.println("]");
            }
        }
        catch (Exception e){
            System.out.println("Exception handled successfully");
        }

//        System.out.println(arr);
    }
}
