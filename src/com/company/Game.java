package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Game {
    private Question[] questions;
    private int counter;

    public Game( Question[] questions) {
        this.questions = questions;
    }

    void doPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Let's play!");
        for(int i = 0;i < questions.length;i++) {
            System.out.println(questions[i].getValue());
            Answer[] choice = questions[i].getAnswers();

            for(int j = 0;j < choice.length;j++) {

                System.out.println(choice[j].getValue());

            }

            System.out.println("Enter your answer:");

            String input = scanner.nextLine();
            if(input.toLowerCase().equals(questions[i].getCorrect().toLowerCase())) {
                counter = counter + 1;
            }
        }
        if(counter == 3) {
            System.out.println("Congratulations! Everything is correct!");
        }

        if(counter == 2) {
            System.out.println("Sorry! The number of correct answers is 2 out of 3");
        }

        if(counter == 1) {
            System.out.println("Sorry! The number of correct answers is 1 out of 3");
        }

        if(counter == 0) {
            System.out.println("Sorry! The number of correct answers is 0 out of 3");
        }

    }
}
