/*
* File: Solution.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft I-N
* Date: 2026-03-02
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example;

import java.util.Scanner;

public class Solution {
    public static void task01() {
        Scanner scanner = new Scanner(System.in);
        
        String[] targetArray = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Cél: ");
            String target = scanner.nextLine();
            targetArray[i] = target;
        }
        scanner.close();
        
        printTargets(targetArray);
        printTargets2(targetArray);
    }

    public static void printTargets(String[] targetArray) {
        for (int i = 0; i < targetArray.length; i++) {
            System.out.println(targetArray[i]);
        }
    }

    public static void printTargets2(String[] targetArray) {
        for (String target : targetArray) {
            System.out.println(target);
            
        }
    }


}
