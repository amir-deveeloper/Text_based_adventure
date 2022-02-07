package com.company;

public class Question {
    private String value;
    private Answer[] answers;
    private String correct;

    public Question(String value, Answer[] answers, String correct) {
        this.value = value;
        this.answers = answers;
        this.correct = correct;
    }

    public String getValue() {
        return value;
    }

    public String getCorrect() {
        return correct;
    }

    public Answer[] getAnswers() {
        return answers;
    }
}
