package com.kiranthepro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] numbers = new String[20];
        String[] players = getPlayers();

    }

    public static String[] getPlayers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the player names as a comma separated list:");
        String[] players = scanner.next().split(",");

        // clean the names
        for (int i=0; i<players.length; i++) {
            players[i] = players[i].trim();
        }

        String[] playerArr = new String[10];

        String input;
        boolean done = false;

        while (!done) {
            System.out.println("Type the name of the player:");
            input = scanner.next();

            if (!Arrays.asList(playerArr).contains(input)) {

            }
        }
        return "";
    }
}
