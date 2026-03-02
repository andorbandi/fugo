/*
* File: Sol.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft I-N
* Date: 2026-03-02
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol {
    public static void task01() {
        Scanner scanner = new Scanner(System.in);
        List<String> targetList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Cél: ");
            String target = scanner.nextLine();
            targetList.add(target);
        }

        scanner.close();
        printTarget(targetList);
    }

    public static void printTarget(List<String> targetList) {
        for (int i = 0; i < targetList.size(); i++) {
            System.out.println(targetList.get(i));
        }
    }
}
