package com.company;

public class Print {
    public static void startGame() {
        System.out.println("Игра началась, на столе 20 спичек.");
        System.out.println("");
    }

    public static void printStep(String name) {
        String step = String.format("Ход выполняет: %s", name);
        System.out.println(step);
    }

    public static void print() {
        System.out.print("Введите количество спичек, от 1 до 3: ");
    }

    public static void printNumberComputer(int number) {
        System.out.println(number);
    }

    public static void printNumber(int number, int matches) {
        if (number == -1) {
            System.out.println("Вы ввели текст, допустимо вводить только цифры!");
        } else if (number < 1 || number > 3 || number > matches) {
            System.out.println("Некорректное количество спичек!");
        }
    }

    public static void printQuantityMatches(int matches) {
        String quantityMatches = String.format("На столе осталось %d спичек.", matches);
        System.out.println(quantityMatches);
    }

    public static void printEnd(String name) {
        String end = String.format("Игра окончена! %s победил!", name);
        System.out.println("");
        System.out.println(end);
    }
}
