package com.stof;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore (true, 800, 5, 100);
        System.out.println("Your final score is " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore (true, 800, 5, 100);
        System.out.println("Your final score " + highScore);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if (gameOver) {
            int finalSoore = score + (levelCompleted * bonus);
            finalSoore += 1000;
            return finalSoore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition() {

        String playersName = "player name";
    }
}
