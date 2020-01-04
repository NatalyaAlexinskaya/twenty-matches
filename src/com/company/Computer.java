package com.company;

public class Computer {
    private int number;
    private String name = "Компьютер";

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int playerComputer(int matches) {
        if (matches % 4 == 0) {
            number = 3;
        } else if (matches % 2 == 0) {
            number = 1;
        } else {
            number = 2;
        }
        return number;
    }
}
