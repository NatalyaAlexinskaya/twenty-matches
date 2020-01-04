package com.company;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private int number;
    private String name = "Игрок";

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int inputNumber() {
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            scanner = new Scanner(System.in);
            return number = -1;
        }
        return number;
    }
}
