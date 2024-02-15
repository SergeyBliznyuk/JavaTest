package com.Project1;
import java.util.Random;
public class Player {
    private String name = "Bob";
    private VARIANTS item;

    Player() {

        VARIANTS[] values = VARIANTS.values();
        Random random = new Random();
        this.item = values[random.nextInt(values.length)];
    }

    public Player(VARIANTS item, String name) {
        this.item =item;
        this.name =name;
    }


    public String whoWins(Player first, Player second) {
        String winner;

        if ((this.item == VARIANTS.ROCK && second.item == VARIANTS.PAPER) ||
                (this.item == VARIANTS.ROCK && second.item == VARIANTS.SCISSORS) ||
                (this.item == VARIANTS.SCISSORS && second.item == VARIANTS.PAPER)) {
            winner = this.name;
        } else if ((this.item == VARIANTS.PAPER && second.item == VARIANTS.ROCK) ||
                (this.item == VARIANTS.SCISSORS && second.item == VARIANTS.ROCK) ||
                (this.item == VARIANTS.PAPER && second.item == VARIANTS.SCISSORS)) {
            winner = second.name;
        } else {
            winner = "draw";
            System.out.print("Played ");
            return winner;
        }

        System.out.print("The winner is ");
        return winner;
    }


}
