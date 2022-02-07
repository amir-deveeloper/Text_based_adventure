package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Question[] questions = new Question[3];

        String quest1 = "The capital of the USA?";
        String quest2 = "The capital of the UK?";
        String quest3 = "The capital of the Russia?";

        Answer[] answers  = new Answer[3];
        answers[0] = new Answer("- Moscow");
        answers[1] = new Answer("- London");
        answers[2] = new Answer("- Washington");



        questions[0] = new Question(quest1,answers,"Washington");
        questions[1] = new Question(quest2,answers,"London");
        questions[2] = new Question(quest3,answers,"Moscow");

        Game game = new Game(questions);

        game.doPlay();
    }
}

