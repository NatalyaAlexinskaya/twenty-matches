package com.company;

public class Main {

    public static void main(String[] args) {
        int matches = 20;
        boolean priority = false;

        Player player = new Player();
        Computer computer = new Computer();

        Print.startGame();

        do {
            priority = !priority;
            if (priority) {
                Print.printStep(computer.getName());
                Print.print();
                computer.playerComputer(matches);
                Print.printNumberComputer(computer.getNumber());
                matches -= computer.getNumber();
            } else {
                Print.printStep(player.getName());
                do {
                    Print.print();
                    player.inputNumber();
                    Print.printNumber(player.getNumber(), matches);
                } while (player.getNumber() < 1 || player.getNumber() > 3);
                matches -= player.getNumber();
            }
            Print.printQuantityMatches(matches);
        } while (matches > 1);

        if (priority) {
            Print.printEnd(computer.getName());
        } else {
            Print.printEnd(player.getName());
        }
    }
}
