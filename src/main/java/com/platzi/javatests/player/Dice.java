package com.platzi.javatests.player;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int roll(){
        return new Random().nextInt(sides) + 1;
    }

}
